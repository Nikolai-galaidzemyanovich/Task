package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TicketsSelectionPage {

    private static By SELECT_TICKET = Locators.get("SelectTikets");
    private static By TRIP_SUBMIT_BUTTON = Locators.get("TripSummarySubmitButton");

    public static void selectTicket(WebDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", driver.findElement(SELECT_TICKET));
        js.executeScript("arguments[0].click();", driver.findElement(SELECT_TICKET));
        js.executeScript("arguments[0].click();", driver.findElement(TRIP_SUBMIT_BUTTON));

    }
}
