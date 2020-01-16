Feature: Users should be able to login
  @driver @test
  Scenario: Login  as a driver
    Given the user is on the login page
    When the users enter driver information
    Then the user should be able to login

  @sales_manager @test
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the users enter sales manager information
    Then the user should be able to login

  @store_manager @login
   Scenario: Login as a store manager
   Given the user is on the login page
    When  the users enter store manager information
    Then the user should be able to login