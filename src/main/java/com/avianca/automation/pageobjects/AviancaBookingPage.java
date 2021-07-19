package com.avianca.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.avianca.com/co/es/")

public class AviancaBookingPage extends PageObject {



    public By destinationInput = By.xpath("(//input[contains(@id, 'pbDestino')] )[2]");
    public By destinationClick = By.xpath("//*[@data-terminal='MDE'][1]");
    public By datesClick = By.xpath("(//input[contains(@id, 'pbFechas')] )[1]");
    public By departureDate = By.xpath("(//div[@data-day= '2021.7.29'])[2]");
    public By returnDate = By.xpath("(//div[@data-day= '2021.8.25'])[2]");
    public By searchFlightButton = By.xpath("//*[@class='btn primary btn-codepromo pull-btn rojo'][1]");
    public By selectCabinButton = By.xpath("(//*[@class= 'select-cabin-button'])[1]");
    public By selectBaggage = By.xpath("(//*[@class= 'ff-price-container'])[3]");
    public By continueButton = By.xpath("//*[@class= 'btn-primary continue-btn']");
    public By firstNameInput = By.xpath("(//*[@formcontrolname= 'firstName'])[1]");
    public By lastNameInput = By.xpath("(//*[@formcontrolname= 'lastName'])[1]");
    public By contactInformationButton = By.xpath("//*[@class= 'btn-primary passenger-btn ng-star-inserted']");
    public By emailInput = By.xpath("(//*[@formcontrolname= 'email'])[1]");
    public By numberInput = By.xpath("(//*[@formcontrolname= 'number'])[1]");
    public By saveInfoButton = By.xpath("//*[@class= 'btn-primary continue-btn ng-star-inserted']");
    public By continueToPayButton= By.id("continue-btn-footer-static");
    public By departureDateFinal= By.xpath("(//*[@class='flight-date-info'])[1]");
    public By departureCity= By.xpath("(//*[@class='bound-airport'])[1]");
    public By arrivedCity= By.xpath("(//*[@class='bound-airport'])[2]");
    public By returnDateFinal= By.xpath("(//*[@class='flight-date-info'])[2]");
    public By returnCityFinal= By.xpath("(//*[@class='bound-airport'])[3]");
    public By cityFinal= By.xpath("(//*[@class='bound-airport'])[4]");



    public Object setDepartureDateFinal() {
        getDriver().findElement(departureDateFinal).getText();
        return null;
    }

    public Object setDepartureCity() {
        getDriver().findElement(departureCity).getText();
        return null;
    }

    public Object setArrivedCity() {
        getDriver().findElement(arrivedCity).getText();
        return null;
    }

    public Object setReturnDateFinal() {
        getDriver().findElement(returnDateFinal).getText();
        return null;
    }

    public Object setReturnCityFinal() {
        getDriver().findElement(returnCityFinal).getText();
        return null;
    }

    public Object setCityFinal() {
        getDriver().findElement(cityFinal).getText();

        return null;
    }




    public void setDestination(String string) {
        getDriver().findElement(destinationInput).sendKeys(string);
    }

    public void setFirstNameInput(String string) {
        getDriver().findElement(firstNameInput).sendKeys(string);
    }

    public void setLastNameInput(String string) {
        getDriver().findElement(lastNameInput).sendKeys(string);
    }

    public void setEmailInput(String string) {
        getDriver().findElement(emailInput).sendKeys(string);
    }

    public void setNumberInput(String string) {
        getDriver().findElement(numberInput).sendKeys(string);
    }


}
