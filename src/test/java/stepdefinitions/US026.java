package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojo.US026CountryExpectedPojo;
import pojo.US026CountryResponsePojo;
import pojo.US026RegisterPojo;
import pojo.US026ResponsePojo;
import utilities.TokenGenarateGMI;

public class US026 {
    String token = TokenGenarateGMI.token();

    // For creating account
    US026RegisterPojo us026RegisterPojo = new US026RegisterPojo();        //expected Data
    // US026ResponsePojo us026ResponsePojo = new US026ResponsePojo();     //actual Data


    // For updating countries
    US026CountryExpectedPojo us026CountryExpectedPojo = new US026CountryExpectedPojo();
    US026CountryResponsePojo us026CountryResponsePojo = new US026CountryResponsePojo();

    Faker faker = new Faker();
    Response response;

    int id;

    @Given("User creates data for the registration")
    public void userCreatesDataForTheRegistration() {

        String ssn = faker.idNumber().ssnValid();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String address = faker.address().fullAddress();
        String mobilePhoneNumber = faker.phoneNumber().cellPhone();
        int userId = faker.number().numberBetween(1,4);
        String userName = firstName + "_" + lastName;
        String email = faker.internet().emailAddress();

        us026RegisterPojo.setSsn(ssn);
        us026RegisterPojo.setFirstName(firstName);
        us026RegisterPojo.setLastName(lastName);
        us026RegisterPojo.setAddress(address);
        us026RegisterPojo.setMobilePhoneNumber(mobilePhoneNumber);
        us026RegisterPojo.setUserId(userId);
        us026RegisterPojo.setUserName(userName);
        us026RegisterPojo.setEmail(email);

        System.out.println(us026RegisterPojo);
    }

    @And("User sends a post request for registration")
    public void userSendsAPostRequestForRegistration() {

        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token)
                .body(us026RegisterPojo).when()
                .post("https://www.gmibank.com/api/tp-account-registrations");

       response.prettyPrint();
    }

    @Then("User verifies API registration")
    public void userVerifiesAPIRegistration() {

        US026ResponsePojo responsePojo = response.as(US026ResponsePojo.class);   //response'den gelen json datayi US026ResponsePojo data type' ina aktardik.

        Assert.assertEquals(us026RegisterPojo.getFirstName(),responsePojo.getFirstName());
        Assert.assertEquals(us026RegisterPojo.getLastName(),responsePojo.getLastName());
        Assert.assertEquals(us026RegisterPojo.getSsn(),responsePojo.getSsn());
        Assert.assertEquals(us026RegisterPojo.getAddress(),responsePojo.getAddress());
        Assert.assertEquals(us026RegisterPojo.getMobilePhoneNumber(),responsePojo.getMobilePhoneNumber());
        Assert.assertEquals(us026RegisterPojo.getUserName(),responsePojo.getUserName());
        Assert.assertEquals(us026RegisterPojo.getEmail(),responsePojo.getEmail());
    }



    @Given("User gets country data")
    public void userGetsCountryData() {
        RestAssured.given().log().uri().log().body()
                .contentType(ContentType.JSON)
                .and().accept(ContentType.ANY).header("Authorization", "Bearer " + token)
                .when().get("https://www.gmibank.com/api/tp-countries/24113").prettyPrint();
    }

    @When("User updates country data")
    public void userUpdatesCountryData() {
        Response response = RestAssured.given().log().uri().log().body()
                .contentType(ContentType.JSON)
                .and().accept(ContentType.ANY).header("Authorization", "Bearer " + token)
                .body("{\"name\":\"Tuba\",\"states\": null}")
                .when().post("https://www.gmibank.com/api/tp-countries");

        US026CountryResponsePojo responseCountry = response.as(US026CountryResponsePojo.class);
        id = responseCountry.getId();
        System.out.println(id);
    }

    @Then("User gets new country data")
    public void userGetsNewCountryData() {
              Response response = RestAssured.given().log().uri().log().body()
                      .contentType(ContentType.JSON)
                      .and().accept(ContentType.ANY).header("Authorization", "Bearer " + token)
                      .when().get("https://www.gmibank.com/api/tp-countries/"+id);

        US026CountryResponsePojo responseCountry = response.as(US026CountryResponsePojo.class);

        System.out.println(responseCountry);

        Assert.assertEquals(responseCountry.getName(),"Tuba");
        Assert.assertEquals(responseCountry.getStates(),null);
          }
    }