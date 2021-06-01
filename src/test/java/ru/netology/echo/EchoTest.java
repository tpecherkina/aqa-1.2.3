package ru.netology.echo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class EchoTest {
    @Test
    void shouldReturnData(){
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("test")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("test"));
    }
}
