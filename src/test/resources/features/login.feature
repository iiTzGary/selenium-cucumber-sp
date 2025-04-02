@General
Feature: User is able to navigate to linkedin profile

  @Profile
  Scenario: User logs in and navigates to the profile page
    Given the user is on the LinkedIn login page
    When enters valid credentials
    Then it should see the homepage
    When navigates to the profile
    Then the profile page should be displayed
