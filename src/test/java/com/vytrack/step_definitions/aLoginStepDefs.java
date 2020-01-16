package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class aLoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I opened the browswer and navigated to qa3.vytrack.com");

    }

    @When("the users enter driver information")
    public void the_users_enter_driver_information() {
        System.out.println("I entered user1 and UserUser123");

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verified that logion is successful");

    }

    @When("the users enter sales manager information")
    public void the_users_enter_sales_manager_information() {
        System.out.println("I entered SalesManager123 and UserUser123");
    }
  @When("the users enter store manager information")
    public void the_users_enter_store_manager_information() {
        System.out.println("Enter srtore manager information");
    }

}
