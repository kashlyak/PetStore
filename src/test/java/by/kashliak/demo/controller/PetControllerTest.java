package by.kashliak.demo.controller;

import by.kashliak.demo.entity.Pet;
import by.kashliak.demo.petDAO.PetDAO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.assertj.core.api.Assert;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

@Component
class PetControllerTest {


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
}