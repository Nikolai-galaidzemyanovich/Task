package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;

public class CreditCardInfoPage {

    private static By CREDIT_CARD_NUMBER = Locators.get("CreditCardNumber");
    private static By CARD_MONTH = Locators.get("CardMonth");
    private static By SELECT_CARD_MONTH = Locators.get("SelectCardMonth");
    private static By CARD_YEAR = Locators.get("CardYear");
    private static By SELECT_CARD_YEAR = Locators.get("SelectCardYear");
    private static By CVV = Locators.get("CVV");
    private static By NAME_ON_CARD = Locators.get("NameOnCard");
    private static By COUNTRY_CARD = Locators.get("CountryOnCard");
    private static By SELECT_CARD_COUNTRY = Locators.get("SelectCountryOnCard");
    private static By ADDRESS_LINE1 = Locators.get("AddressLine1");
    private static By CITY_COUNTRY_WARD = Locators.get("CityCountyWard");
    private static By POSTAL = Locators.get("Postal");
    private static By COMPLETE_PURCHASE = Locators.get("CompletePurchase");

    public static void enterCreditCardInfo(WebDriver driver, String numberCreditCard, String cvv,
                                           String nameOnCard,String address,String city, String post){

        driver.findElement(CREDIT_CARD_NUMBER).sendKeys(numberCreditCard);
        driver.findElement(CARD_MONTH).click();
        driver.findElement(SELECT_CARD_MONTH).click();
        driver.findElement(CARD_YEAR).click();
        driver.findElement(SELECT_CARD_YEAR).click();
        driver.findElement(CVV).sendKeys(cvv);
        driver.findElement(NAME_ON_CARD).sendKeys(nameOnCard);
        driver.findElement(COUNTRY_CARD).click();
        driver.findElement(SELECT_CARD_COUNTRY).click();
        driver.findElement(ADDRESS_LINE1).sendKeys(address);
        driver.findElement(CITY_COUNTRY_WARD).sendKeys(city);
        driver.findElement(POSTAL).sendKeys(post);
        assertTrue(driver.findElement(COMPLETE_PURCHASE).isDisplayed());
    }
}
