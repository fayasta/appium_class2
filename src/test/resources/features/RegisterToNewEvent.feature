@RegressionAndroid @ContactTest1
Feature: Like a user requests to register a new Event

 #Scenario 1
  Scenario Outline: The user requests to register a new Event
    Given I login with my "<username>" and my "<password>"
    And I'm on my profile page
    When I click in Events tab
    Then I should see the Event Page
    When I click in select a halloween event
    And click on Register button
    Then I should see the first confirmation message
    When I click in yes option
    Then I should see the confirmation message
    When I click on got it message
    Then I should see the event details screen displayed
    When I click on back button
    Then I should see the Event dashboard
    And I finally Logout of App

    Examples:
    |username| password|
    |fayasta | nando   |



