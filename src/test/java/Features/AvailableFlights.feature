Feature: Find all available flights between given cities

  Background: User is in the homepage of the website

  Scenario: Enter all the details and click search
    Given User enters the from city
    And User enters to city
    And Selects the date of journey
    And Selects the class he wants to travel in
    Then click search
