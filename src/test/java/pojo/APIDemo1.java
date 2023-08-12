package pojo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APIDemo1 {

    @Test
    public void test_poj(){

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        


    }
}
