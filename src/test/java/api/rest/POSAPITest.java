package api.rest;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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

    @Test
    public void createNewCustomer(){
        String newCustomer = "    {\n" +
                "        \"name\": \"New Customer 1\",\n" +
                "        \"address\": \"New Address 1\",\n" +
                "        \"salary\": 68000\n" +
                "    }";
        given()
                .contentType(ContentType.JSON)
                .body(newCustomer)
                .when()
                .post("http://localhost:3000/api/customers")
                .then()
                .assertThat()
                .body("name",equalTo("New Customer 1"))
                .log().all();
    }

}
