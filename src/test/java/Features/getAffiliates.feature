Feature: Validating Affiliates Api

  Scenario: Verify if affiliates list is displaying using getAffiliates Api
    Given the endpoint is "https://qa-api.creditrepaircloud.com/api/affiliates"
    When I send a GET request to the endpoint
    Then the api call is success is 200
    And status in response body is OK
