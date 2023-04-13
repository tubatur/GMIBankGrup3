package ApiRK;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class States {
    public static Response getAllStates(String bearerToken){
        return given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .header("Authorization", bearerToken)
                .when()
                .get("https://medunna.com/api/c-states");

    }
}
