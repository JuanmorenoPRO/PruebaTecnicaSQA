package com.avianca.automation.steps;

import com.avianca.automation.pageobjects.AviancaBookingPage;
import com.avianca.automation.util.Javascript;
import com.avianca.automation.util.Log4jResult;
import com.avianca.automation.util.SpecialMethods;
import com.avianca.automation.util.Times;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

public class AviancaBookingSteps {

    AviancaBookingPage aviancaBookingPage = new AviancaBookingPage();
    private static final Logger log = Logger.getLogger(Log4jResult.class);



    @Step
    public void openBrowser(){
        aviancaBookingPage.open();
    }

    @Step
    public void makeBooking() throws InterruptedException {
        SpecialMethods.configProperties();
        PropertyConfigurator.configure("resources/logconfig/log4j.properties");
        aviancaBookingPage.setDestination(SpecialMethods.properties.getProperty("destination"));
        Times.waitFor(1000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.destinationClick);
        Times.waitFor(3000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.datesClick);
        Times.waitFor(3000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.departureDate);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.returnDate);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.searchFlightButton);
        Times.waitFor(25000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.selectCabinButton);
        Times.waitFor(10000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.selectBaggage);
        Times.waitFor(10000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.selectCabinButton);
        Times.waitFor(10000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.selectBaggage);
        Times.waitFor(10000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.continueButton);
        Times.waitFor(10000);
        aviancaBookingPage.setFirstNameInput(SpecialMethods.properties.getProperty("firstname"));
        aviancaBookingPage.setLastNameInput(SpecialMethods.properties.getProperty("lastname"));
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.contactInformationButton);
        Times.waitFor(5000);
        aviancaBookingPage.setEmailInput(SpecialMethods.properties.getProperty("userEmail"));
        aviancaBookingPage.setNumberInput(SpecialMethods.properties.getProperty("mobile"));
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.saveInfoButton);
        Times.waitFor(25000);
        Javascript.clickJS(aviancaBookingPage.getDriver(), aviancaBookingPage.continueToPayButton);
        Times.waitFor(20000);
    }

    @Step
    public void flightResult(){
        log.info("Fecha de Salida");
        log.debug(aviancaBookingPage.setDepartureDateFinal());

        log.info("Ciudad de Salida");
        log.debug(aviancaBookingPage.setDepartureCity());

        log.info("Ciudad de llegada");
        log.debug(aviancaBookingPage.setArrivedCity());

        log.info("Fecha de regreso");
        log.debug(aviancaBookingPage.setReturnDateFinal());

        log.info("Ciudad de partida");
        log.debug(aviancaBookingPage.setReturnCityFinal());

        log.info("Ciudad de llegada");
        log.debug(aviancaBookingPage.setCityFinal());
    }



}
