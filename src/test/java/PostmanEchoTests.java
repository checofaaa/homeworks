import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTests {
    @Test
    public void testGetRequest() {
        RestAssured
                .given()
                    .log().all()
                    .queryParam("foo", "bar")
                    .queryParam("test", "123")
                .when()
                    .get("https://postman-echo.com/get")
                .then()
                    .log().body()
                    .statusCode(200)
                    .body("args.foo", equalTo("bar"))
                    .body("args.test", equalTo("123"));
    }

    @Test
    public void testPostRequest() {
        String body = "{\"name\":\"Ivan\", \"age\":30}";

        RestAssured
                .given()
                    .log().all()
                    .contentType("application/json")
                    .body(body)
                .when()
                    .post("https://postman-echo.com/post")
                .then()
                    .log().body()
                    .statusCode(200)
                    .body("json.name", equalTo("Ivan"))
                    .body("json.age", equalTo(30));
    }

    @Test
    public void testPutRequest() {
        String body = "{\"update\":\"yes\"}";

        RestAssured
                .given()
                    .log().all()
                    .contentType("application/json")
                    .body(body)
                .when()
                    .put("https://postman-echo.com/put")
                .then()
                    .log().body()
                    .statusCode(200)
                    .body("json.update", equalTo("yes"));
    }

    @Test
    public void testDeleteRequest() {
        RestAssured
                .given()
                    .log().all()
                .when()
                    .delete("https://postman-echo.com/delete")
                .then()
                    .log().body()
                    .statusCode(200)
                    .body("url", equalTo("https://postman-echo.com/delete"));
    }

    @Test
    public void testStatus200() {
        RestAssured
                .given()
                    .log().all()
                .when()
                    .get("https://postman-echo.com/status/200")
                .then()
                    .log().body()
                    .statusCode(200);
    }
}
