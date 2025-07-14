package api.rest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class POSAPITest {

    @Test
    public void getAllCustomers(){
        given()
                .when()
                .get("http://localhost:3000/api/customers")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();
    }
}
