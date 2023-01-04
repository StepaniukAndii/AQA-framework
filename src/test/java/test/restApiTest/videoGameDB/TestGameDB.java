package test.restApiTest.videoGameDB;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestGameDB {

    @Test
    public void checkGamesPositive(){

        Response response = given()
                .baseUri("http://localhost:8080")
                .header("Accept", "application/json")
                .when()
                .get("/app/videogames/8");


        GameModel gameModel = response.as(GameModel.class);

        Assert.assertEquals(gameModel.id, 8);
        Assert.assertEquals(gameModel.reviewScore, 88);
        Assert.assertEquals(gameModel.name, "SimCity 2000");
        Assert.assertEquals(gameModel.releaseDate, "1994-09-11");
        Assert.assertEquals(gameModel.category, "Strategy");
        Assert.assertEquals(gameModel.rating, "Universal");
    }
}
