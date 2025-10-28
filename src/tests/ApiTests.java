package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests {

    @Test
    public void getPetTest() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        Response response = RestAssured
                .given()
                .when()
                .get("/pet/98765")
                .then()
                .extract()
                .response();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void createPetTest() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        Pet pet = new Pet();
        pet.id = 23456;
        pet.name = "Fenixcat";
        pet.status = "available";

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(pet)
                .when()
                .post("/pet")
                .then()
                .extract()
                .response();

        Assert.assertEquals(response.getStatusCode(), 200);

        Pet responsePet = response.as(Pet.class);
        Assert.assertEquals(responsePet.name, pet.name);
    }
}