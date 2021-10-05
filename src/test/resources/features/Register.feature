Feature: Register to NopeCommerce
  @regression
  Scenario: As a customer register to NopeCommerece
    Given User is on register page
    When User enters all the valid information and submits
    Then User should see successful registration message