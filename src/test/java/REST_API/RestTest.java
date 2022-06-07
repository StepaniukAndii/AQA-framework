package REST_API;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestTest {

    @Test
    public void getUsers() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user", "Andrii");
        jsonObject.put("age", 19);

        given()
                .baseUri("http://192.168.1.106:3000")
                .basePath("/api/users")
                .contentType(ContentType.JSON)
                .when()
                .body(jsonObject.toJSONString())
                .post()
                .then()
                .statusCode(200);
    }
}