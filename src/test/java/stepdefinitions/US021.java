package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojo.US021RegisterBodyPojo;
import pojo.US021ResponseBodyPojo;
import utilities.TokenGenarate;

public class US021 {

    Faker faker = new Faker();

    String email;
    String firstName;
    String lastName;
    String login;
    String password;
    String ssn;
    String token= TokenGenarate.token();

    US021RegisterBodyPojo registerBodyPojo=new US021RegisterBodyPojo();
    US021ResponseBodyPojo responseBodyPojo=new  US021ResponseBodyPojo();

    Response response;


    @Given("User creates data for a patient")
    public void userCreatesDataForAPatient() {
        email=faker.internet().emailAddress();
        firstName=faker.name().firstName();
        lastName=faker.name().lastName();
        login=faker.name().username();
        password=faker.internet().password();
        ssn=faker.idNumber().ssnValid();

        registerBodyPojo.setEmail(email);
        registerBodyPojo.setFirstName(firstName);
        registerBodyPojo.setLastName(lastName);
        registerBodyPojo.setLogin(login);
        registerBodyPojo.setPassword(password);
        registerBodyPojo.setSsn(ssn);

    }

    @And("User sends this patient created by post request.")
    public void userSendsThisPatientCreatedByPostRequest() {
        response = RestAssured.given().log().uri().log().body()
                .contentType(ContentType.JSON)
                .and().accept(ContentType.ANY).header("Authorization", "Bearer " + token)
                .body(registerBodyPojo)
                .when().post("https://www.medunna.com/api/register");
    }

    @Then("User verifies patient")
    public void userVerifiesPatient() {
        //gelen veriyi responsopojoya atayip ordaki verileri kontol
        responseBodyPojo = response.as(US021ResponseBodyPojo.class);

        Assert.assertEquals(firstName,responseBodyPojo.getFirstName());
        Assert.assertEquals(lastName,responseBodyPojo.getLastName());
        Assert.assertEquals(login,responseBodyPojo.getLogin());
        Assert.assertEquals(ssn,responseBodyPojo.getSsn());

        System.out.println(response.body().prettyPrint());
    }
}
