#Author Ayachi
Feature: Ornage HRM Test

  Background: 
    Given User login with valid username "Admin" and password "admin123"

  Scenario Outline: Menus coverage
    When user clicks on "<Menu>"
    Then user directs to the "<Menu>" page

    Examples: 
      | Menu        |
      | Admin       |
      | PIM         |
      | Leave       |
      | Time        |
      | Recruitment |
      | My Info     |
      | Performance |
      | Dashboard   |
      | Directory   |
      | Maintenance |
      | Claim       |
      | Buzz        |
