package test.restApiTest.videoGameDB;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameModel {

    public int id;
    public String name;
    public String releaseDate;
    public int reviewScore;
    public String category;
    public String rating;
}
