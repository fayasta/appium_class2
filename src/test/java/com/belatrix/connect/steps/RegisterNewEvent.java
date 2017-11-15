package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterNewEvent extends ParentScenario {

    @When("^I click in Events tab$")
    public void i_click_in_Events_tab(){
        mainProfilePage.clickEventsTab();
        System.out.println("I clicked in Events tab");
    }

    @Then("^I should see the Event Page$")
    public void i_should_see_the_Event_Detail_Page(){
        eventsPage.verifyElementsDisplayed();
        System.out.println("Event Detail's Page is loaded correctly");
    }

    @When("^I click in select a halloween event$")
    public void i_click_in_select_a_halloween_event(){
        eventsPage.clickHalloweenEvent();
        System.out.println("I click in Halloween event");
    }

    @And("^click on Register button$")
    public void click_on_Register_button(){
        eventDetailPage.clickRegisterButton();
        System.out.println("I click on Register button at Event Details Screen");
    }

    @Then("^I should see the first confirmation message$")
    public void i_should_see_the_first_confirmation_message(){
        eventDetailPage.confirmationMessage();
        System.out.println(" First confirmation message is displayed ");
    }


    @When("^I click in yes option$")
    public void i_click_in_yes_option()  {
        eventDetailPage.acceptFirstConfirmationMessage();
        System.out.println("I click in Yes option");
    }

    @Then("^I should see the confirmation message$")
    public void i_should_see_the_confirmation_message(){
        eventDetailPage.verifyConfirmationMessageIsDisplayed();
        System.out.println("The confirmation message was displayed correctly ");
    }

    @When("^I click on got it message$")
    public void i_click_on_got_it_message(){
        eventDetailPage.reconfirmationMessage();
        System.out.println("I click on Got it message");
    }



    @Then("^I should see the event details screen displayed$")
    public void i_should_see_the_event_details_screen_displayed(){
        eventDetailPage.verifyElementsDisplayed();
        System.out.println("The details screen was displayed ");
    }

    @When("^I click on back button$")
    public void i_click_on_back_button(){
        eventDetailPage.backToEventPage();
        System.out.println("I click on Back button to return to the event detail");
    }


    @Then("^I should see the Event dashboard$")
    public void i_should_see_the_Event_dashboard(){
        eventsPage.verifyElementsDisplayed();
        System.out.println("Event Page is loaded correctly");
    }

}
