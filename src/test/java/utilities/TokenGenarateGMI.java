package utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class TokenGenarateGMI {

    public static String token(){
        String url="https://gmibank.com/api/authenticate";
        Map<String, String> tokenbody=new HashMap<>();
        tokenbody.put("username", "admin2023");
        tokenbody.put("password", "Admin.Strator23");

        Response responseToken = RestAssured.given().contentType(ContentType.JSON).log().uri()
                .log().body().body(tokenbody).when().post(url);

        return responseToken.path("id_token");
    }



}
