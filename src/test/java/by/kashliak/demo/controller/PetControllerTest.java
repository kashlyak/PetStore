package by.kashliak.demo.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
@SpringBootTest
class PetControllerTest {

    @Autowired
    private PetController petController;

    @Test
    void petList() {
        RestAssured.
                when().get("http://localhost:8080/petstore").
                then().assertThat().statusCode(200);
    }

    @Test
    void addPet() {
        given().log().body()
                .contentType(ContentType.JSON).body(String.format("{name: %s, type: %s}", "name", "type"))

                .when().post("/petstore")

                .then().log().body()
                .statusCode(HttpStatus.CREATED.value());
    }


    @Test
    public void contextLoads() throws Exception {
        assertThat(petController).isNotNull();
    }
}