package com.avianca.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/aviancaBooking.feature",
        glue = "com.avianca.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@regression")

public class AviancaBookingRunner {

}
