Feature: Make a flight booking in Avianca


  @regression
  Scenario: flight booking
    Given An user wants to make a flight booking in Avianca
    When The user choose the flight and fill all requested fields
    Then The user should see the successful booking
