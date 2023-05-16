package tests;

import data.RestUtils;
import io.restassured.http.ContentType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;

public class Put
{
    public JSONObject request = new JSONObject();
    public JSONObject requestCategory = new JSONObject();
    public JSONObject requestTags = new JSONObject();

    @BeforeMethod
    public void postData()
    {
        requestCategory.put("name", RestUtils.getPetCategory());
        request.put("category", requestCategory);

        request.put("name", RestUtils.getPetName());

        JSONArray list = new JSONArray();
        list.add("");
        request.put("photoUrls", list);


        requestTags.put("name", RestUtils.getPetTags());
        List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
        jsonObjects.add(requestTags);
        request.put("tags", jsonObjects);

        request.put("status", "available");
    }

    @Test
    public void testPut()
    {
        given().
                baseUri("https://petstore.swagger.io").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                put("/v2/pet").
        then().
                log().all().
                assertThat().statusCode(200);

        System.out.println("json Updated: " + request.toJSONString());
        
    }
}
