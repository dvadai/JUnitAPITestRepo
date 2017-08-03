package thisIsTheWebDriverPackage;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class APITest {

    @Test
    public void apiTest(){

        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");


      given().baseUri("https://jsonplaceholder.typicode.com").headers(headers).
      when().get("/posts").
      then().assertThat().statusCode(200);

       Response response =  given().baseUri("https://jsonplaceholder.typicode.com").headers(headers).
                when().get("/posts");
        Assert.assertEquals(response.statusCode() , 200);
//        Assert.assertTrue(response.statusCode() == 200);
//        System.out.println(response.getBody().prettyPrint());


        given().baseUri("http://pokeapi.co/api/v2/berry").headers(headers).
                when().get("/aa").
                then().assertThat().statusCode(404);



    }
}
