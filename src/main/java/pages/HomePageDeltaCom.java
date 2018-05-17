package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePageDeltaCom {

    private static By FLIGHT_TRIP_BUTTON = Locators.get("FlightTripButton");
    private static By FROM_CITY_LOOK_UP = Locators.get("FromCityLookUp");
    private static By COUNTRY_TAB_RADIO = Locators.get("CountryTabRadio");
    private static By CHOOSE_CITY_FROM = Locators.get("ChooseCityFrom");
    private static By CHOOSE_AIRPORT_FROM = Locators.get("AirportFrom");
    private static By TO_CITY_LOOK_UP = Locators.get("ToCityLookUp");
    private static By REST_OF_WORLD = Locators.get("RestOfWorld");
    private static By CHOOSE_CITY_TO = Locators.get("ChooseCityTo");
    private static By CHOOSE_AIRPORT_TO = Locators.get("AirportTo");
    private static By DEPART_DATE = Locators.get("DepartDate");
    private static By RETURN_DATE = Locators.get("ReturnDate");
    private static By EXACT_DAYS = Locators.get("ExactDaysButton");
    private static By CASH_BUTTON = Locators.get("CashButton");
    private static By FLIGHTS_SUBMIT = Locators.get("FlightsSubmit");

    public static void bookATrip(WebDriver driver){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", driver.findElement(FLIGHT_TRIP_BUTTON));
        js.executeScript("arguments[0].click();", driver.findElement(FROM_CITY_LOOK_UP));
        js.executeScript("arguments[0].click();", driver.findElement(COUNTRY_TAB_RADIO));
        js.executeScript("arguments[0].click();", driver.findElement(CHOOSE_CITY_FROM));
        js.executeScript("arguments[0].click();", driver.findElement(CHOOSE_AIRPORT_FROM));
        js.executeScript("arguments[0].click();", driver.findElement(TO_CITY_LOOK_UP));
        js.executeScript("arguments[0].click();", driver.findElement(REST_OF_WORLD));
        js.executeScript("arguments[0].click();", driver.findElement(CHOOSE_CITY_TO));
        js.executeScript("arguments[0].click();", driver.findElement(CHOOSE_AIRPORT_TO));
        js.executeScript("arguments[0].click();", driver.findElement(DEPART_DATE));
        js.executeScript("arguments[0].click();", driver.findElement(By.linkText("17")));
        js.executeScript("arguments[0].click();", driver.findElement(RETURN_DATE));
        js.executeScript("arguments[0].click();", driver.findElement(By.linkText("19")));
        js.executeScript("arguments[0].click();", driver.findElement(EXACT_DAYS));
        js.executeScript("arguments[0].click();", driver.findElement(CASH_BUTTON));
        js.executeScript("arguments[0].click();", driver.findElement(FLIGHTS_SUBMIT));
    }
}
