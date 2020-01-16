@navigation
Feature: User should be able to navigate to pages using the top menu
  Scenario: Login and navigate to vehicles sub menu as sales manager
    Given the user is on the logged in to the page
    When navigate to Fleet Vehicles menu
    Then the ecpected url must match fleet>vehicles

  Scenario: Login and navigate to campaigns sub menu as sales manager
    Given the user is on the logged in to the page
    When navigate to Marketing Campaigns menu
    Then the ecpected url must match Campaigns

  Scenario: Login and navigate to Caendar Events sub menu as sales manager
    Given the user is on the logged in to the page
    When navigate to Activities CalendarEvents menu
    Then the ecpected url must match CalendarEvents