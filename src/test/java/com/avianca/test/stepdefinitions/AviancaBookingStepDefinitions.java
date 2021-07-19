package com.avianca.test.stepdefinitions;

import com.avianca.automation.steps.AviancaBookingSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class AviancaBookingStepDefinitions {

    @Managed
    private WebDriver driver;

    @Steps
    AviancaBookingSteps aviancaBookingSteps;

    @Given("^An user wants to make a flight booking in Avianca$")
    public void anUserWantsToMakeAFlightBookingInAvianca() {
        // Write code here that turns the phrase above into concrete actions
        aviancaBookingSteps.openBrowser();

    }


    @When("^The user choose the flight and fill all requested fields$")
    public void theUserChooseTheFlightAndFillAllRequestedFields() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        aviancaBookingSteps.makeBooking();
    }

    @Then("^The user should see the successful booking$")
    public void theUserShouldSeeTheSuccessfulBooking() throws IOException {
        // Write code here that turns the phrase above into concrete actions

        aviancaBookingSteps.flightResult();

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("results/screenshots/flight.png"));
    }

}
