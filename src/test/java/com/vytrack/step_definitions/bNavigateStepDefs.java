package com.vytrack.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class bNavigateStepDefs {

    @Given("the user is on the logged in to the page")
    public void the_user_is_on_the_logged_in_to_the_page() {
        System.out.println("The user is logged in as sales manager");

    }

    @When("navigate to Fleet Vehicles menu")
    public void navigate_to_Fleet_Vehicles_menu() {
        System.out.println("The sales manager navigates to Fleet menu and then to Vehicles sub menu");

    }

    @Then("the ecpected url must match fleet>vehicles")
    public void the_ecpected_url_must_match_fleet_vehicles() {
        System.out.println("Assert if the website is now in https://qa3.vytrack.com/entity/fleet");
    }

    @When("navigate to Marketing Campaigns menu")
    public void navigate_to_Marketing_Campaigns_menu() {
        System.out.println("The sales manager navigates to Marketing menu and then to Campaigns sub menu");
    }

    @When("navigate to Activities CalendarEvents menu")
    public void navigate_to_Activities_CalendarEvents_menu() {
        System.out.println("The sales manager navigates to Activities  menu and then to Calendar Events sub menu");
    }
    @Then("the ecpected url must match Campaigns")
    public void the_ecpected_url_must_match_Campaigns() {
        System.out.println("Assert if the website is now in https://qa3.vytrack.com/campaign/");
    }

    @Then("the ecpected url must match CalendarEvents")
    public void the_ecpected_url_must_match_CalendarEvents() {
        String expectedurl="https://qa3.vytrack.com/calendar/event";

        System.out.println("Assert if the website is now in https://qa3.vytrack.com/calendar/event");
    }
}
