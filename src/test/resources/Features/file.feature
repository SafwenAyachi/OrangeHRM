#Author: Ayachi
Feature: Orange HRM login test

  Background: 
    Given User is on login page

  Scenario: Login with valid credentials
    When user enters a valid usernamer "Admin" and a valid password "admin123"
    Then user redirects to home page with message "Dashboard"

  Scenario: Login with invalid credentials
    When user enters a invalid usernamer "Safwen" and a valid password "admin123"
    Then user redirects satays in login page with alert message "Invalid credentials"

 
