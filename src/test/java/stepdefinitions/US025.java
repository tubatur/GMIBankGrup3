package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.TokenGenarate;

public class US025 {
    @Given("Delete a staff and verify that this staff was deleted")
    public void deleteAStaffAndVerifyThatThisStaffWasDeleted() {
        Response response = RestAssured.given().log().uri().log().body()
                .contentType(ContentType.JSON)
                .baseUri("https://www.medunna.com/api")
                .pathParam("id",23934 )
                .and().accept(ContentType.ANY).header("Authorization", "Bearer " + TokenGenarate.token())
                .when().delete("staff/{id}").then().assertThat().statusCode(204).extract().response();

    }
}
