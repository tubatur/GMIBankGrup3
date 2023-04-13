package stepdefinitions;


import ApiRK.Authenticate;
import ApiRK.States;
import ResponsesRK.StatesResponse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US022 {
    private String bearerToken;
    private StatesResponse statesResponse;

    @Given("I get bearer token with {string} and {string}")
    public void iGetBearerTokenWithAnd(String username, String password) {
        bearerToken = Authenticate.getBearerToken(username, password);
    }

    @When("I call GET c-states")
    public void iCallGETApiCStates() {
        Response allStates = States.getAllStates(bearerToken);
        statesResponse = new StatesResponse(allStates);
    }

    @Then("The status code should be {string}")
    public void theStatusCodeShouldBe(String statusCode) {
        Assert.assertEquals("Status code should be 200",statesResponse.getResponse().statusCode(),200);
        Assert.assertTrue("The server should return less than 3000 milisec",
                statesResponse.getResponse().getTime() < 3000 );
        Assert.assertTrue("The server should return at least 1 state",
                statesResponse.getListOfStatesSize() >1);
    }

}
