package stepDefinitions;

/*
 * Author: Durga Rao
 * Initial Date: 06/10/2023
 * Description: This class contains the step definitions of feature file
 */

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class AffiliatesStepDefinition {

    private static Response response;

    @Given("the endpoint is {string}")
    public void the_endpoint_is(String string) {
        RestAssured.baseURI = "https://qa-api.creditrepaircloud.com";
    }
    @When("I send a GET request to the endpoint")
    public void i_send_a_get_request_to_the_endpoint() {
         response = RestAssured.given()
                 .header("authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJpZCI6ImFjZmMwYWY5ZmI0ZTZkZjg4MjA4NDBlN2JhNjJmM2NlZjZkYzhkMjkzODUwZjVlYzBhYTQ4MzAxZjIxYWUxYjc2MWJkZjNhZGNmZjJlNTA3IiwiY29tcGFueV9uYW1lIjoiQXV0b21hdGlvbiIsImZpcnN0X25hbWUiOiJwYXltZW50cyIsImxhc3RfbmFtZSI6InRlc3QiLCJhZG1pbl9lbWFpbCI6InBheW1lbnR0ZXN0OTBAeW9wbWFpbC5jb20iLCJ1c2VyX2lkIjo0MDA4ODUsInJlZ19pZCI6MjA0Nzg5LCJiaWxsaW5nX3JlZl9pZCI6IjA4MzdmMjIwLTYzNzItNDg3Yy05ZWM1LWVkYTIyNzlkMzIzYiIsInVzZXJfdHlwZSI6ImFkbWluIiwiYWNjb3VudF9zdGF0dXMiOiJhY3RpdmUiLCJyZWN1cmx5X3BheW1lbnRfc3RhdHVzIjoicGFpZCIsImNvdW50cnlfY29kZSI6MjI0LCJjb3VudHJ5X25hbWUiOiJVbml0ZWQgU3RhdGVzIiwidHdvX2RpZ2l0X2NvdW50cnlfY29kZSI6IlVTIiwiY3VycmVuY3lfY29kZSI6IlVTRCIsImN1cnJlbmN5X3N5bWJvbCI6IiQiLCJ0aW1lem9uZSI6IihHTVQtOTowMCkgIEFsYXNrYSBUaW1lIiwiaXNfZWFybHlfYWNjZXNzIjoxLCJpc19wcmVfbGF1bmNoIjpmYWxzZSwiY2hhcmdlYmVlX2Vucm9sbGVkIjp0cnVlLCJjaGFyZ2ViZWVfZW5hYmxlZCI6dHJ1ZSwiY3JjX2JpbGxpbmdfZW5hYmxlZCI6dHJ1ZSwiaWF0IjoxNzE4MDY3MDU5LCJuYmYiOjE3MTgwNjcwNTksImV4cCI6MTcxODE1MzQ1OX0.toXGdz35iYwXlYku-Y8CDsBW8zyjWW2e27dcQlPMCGr9fNZGghcsrapSlYgp74PR7w3wnhxC9qr7XFyuSKtjI6UdycZJMZJkVe7lXktE8wM0QUORsmT9CulBGIHrP-tf_qpJN4zdmJ7sPUSQNexFtdL2Ej89H4FI8RsUZwfTk8l-6aaNU7PknyMBk2zq-AQYU4tXyjW10AjaylrNoCvTcBGzUwZbVI5yDFCKOO4M6ZDKpd5ar7eX3vc5xamaxDLezB0l--_Eft8hZt3J6PHu4VAcgfNktM4nNgzG9dctigfNn5NV8KJxapX69gJuJI11Y0L4oaNp3G4hk9lilcbliQ")
                .header("content-type", "application/json")
                .when().get("/api/affiliates")
                .then().extract().response();
    }
    @Then("the api call is success is {int}")
    public void the_api_call_is_success_is(Integer int1) {
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    @Then("status in response body is OK")
    public void status_in_response_body_is_ok() {
        Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
    }
}
