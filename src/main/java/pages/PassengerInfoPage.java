package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PassengerInfoPage{

    private static By FIRST_NAME_FIELD = Locators.get("FirstName");
    private static By LAST_NAME_FIELD = Locators.get("LastName");
    private static By GENDER_BUTTON = Locators.get("GenderButton");
    private static By FEMALE = Locators.get("Female");
    private static By MONTH_BUTTON = Locators.get("MonthButton");
    private static By SELECT_MONTH = Locators.get("August");
    private static By DAY = Locators.get("Day");
    private static By SELECT_DAY = Locators.get("SelectDay");
    private static By YEAR_BUTTON = Locators.get("Year");
    private static By YEAR = Locators.get("ChooseYear");
    private static By COUNTRY_BUTTON = Locators.get("EmgcCountryButton");
    private static By CHOOSE_COUNTRY = Locators.get("ChooseCountry");
    private static By EMGC_FIST_NAME = Locators.get("EmgcFirstName");
    private static By EMGC_LAST_NAME = Locators.get("EmgcLastName");
    private static By PHONE = Locators.get("Phone");
    private static By PHONE_CONTACT = Locators.get("PhoneContact");
    private static By EMAIL = Locators.get("Email");
    private static By CONFIRM_EMAIL = Locators.get("ConfirmEmail");
    private static By CONTINUE = Locators.get("Continue");
    private static By DEVICE_TYPE = Locators.get("DeviceType");
    private static By SELECT_DEVICE_TYPE = Locators.get("SelectDeviceType");
    private static By COUNTRY_CODE = Locators.get("CountryCode");
    private static By SELECT_COUNTRY_CODE = Locators.get("SelectCountryCode");

    public static void enterPassengerInformation(WebDriver driver, String firstName,
                                                 String lastName, String phone, String email) throws InterruptedException {


        driver.findElement(FIRST_NAME_FIELD).sendKeys(firstName);
        driver.findElement(LAST_NAME_FIELD).sendKeys(lastName);
        driver.findElement(GENDER_BUTTON).click();
        driver.findElement(FEMALE).click();
        driver.findElement(YEAR_BUTTON).click();
        driver.findElement(YEAR).click();
        driver.findElement(MONTH_BUTTON).click();
        driver.findElement(SELECT_MONTH).click();
        driver.findElement(DAY).click();
        driver.findElement(SELECT_DAY).click();
        driver.findElement(COUNTRY_BUTTON).click();
        driver.findElement(CHOOSE_COUNTRY).click();
        driver.findElement(EMGC_FIST_NAME).sendKeys(firstName);
        driver.findElement(EMGC_LAST_NAME).sendKeys(lastName);
        driver.findElement(PHONE).sendKeys(phone);
        driver.findElement(PHONE_CONTACT).sendKeys(phone);
        driver.findElement(DEVICE_TYPE).click();
        driver.findElement(SELECT_DEVICE_TYPE).click();
        driver.findElement(COUNTRY_CODE).click();
        driver.findElement(SELECT_COUNTRY_CODE).click();
        driver.findElement(EMAIL).sendKeys(email);
        driver.findElement(CONFIRM_EMAIL).sendKeys(email);
        driver.findElement(CONTINUE).click();
    }
}
