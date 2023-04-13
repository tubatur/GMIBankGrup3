package ApiRK;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class Authenticate {
    public static String getBearerToken(String username, String password){
        String body = String.format("{\n" +
                "    \"username\": \"%1s\",\n" +
                "    \"password\": \"%2s\",\n" +
                "    \"rememberMe\": true\n" +
                "}",username, password);
        Response res = given().log().all()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .body(body)
                .when()
                .post("https://medunna.com/api/authenticate");

        return "Bearer " + res.jsonPath().get("id_token");
    }
}
