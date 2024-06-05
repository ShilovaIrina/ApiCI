package ru.netology.echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostEchoTest {

    @Test
    void shouldReturnData() {
        // Given - When - Then
// Предусловия
        String message = "Hello";
        given()
                .baseUri("https://postman-echo.com")
                .body(message) // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(message) )
        ;
    }
}
