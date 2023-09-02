@alltest
Feature: Login to Website
  we have to login to the saucelab website to check the log in process.

  @logintest @orderTest
  Scenario: login with invalid credentials
    When User logged in with credentials "invaliduser"
    Then User should not be logged in to the website
    And Error message is displayed

  @ui
  Scenario: login with invalid credentials
    When User logged in with credentials "invaliduser" and "password"
    Then User should not be logged in to the website
    And Error message is displayed
