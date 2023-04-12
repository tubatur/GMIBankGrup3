package utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TokenGenarate {

    public static String token(){
        String url="https://medunna.com/api/authenticate";
        Map<String, String> tokenbody=new HashMap<>();
        tokenbody.put("username", "batch_yuzuc");
        tokenbody.put("password", "Batch.103");

        Response responseToken = RestAssured.given().contentType(ContentType.JSON).log().uri()
                .log().body().body(tokenbody).when().post(url);

        return responseToken.path("id_token");
    }

    public static String token(){
        String url="https://medunna.com/api/authenticate";

        Map<String, String> tokenbody=new HashMap<>();

        tokenbody.put("username", "batch_yuzuc");
        tokenbody.put("password", "Batch.103");

        Response responseToken = RestAssured.given().contentType(ContentType.JSON)
                .log().uri()
                .log().body()
                .body(tokenbody).when().post(url);

        return responseToken.path("id_token");
    }


}
