Feature: Finding the best flight for the journey

Background:
  Given The user opens MakeMyTrip website.

Scenario: Giving the details of the journey
  When User enters starting city
  And enters destination city
  And enters departure date
  And selects the travel class and clicks search
  Then close the browser
