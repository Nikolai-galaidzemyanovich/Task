package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;

public class Gmail {

    private static By INDENTI_FIELD = Locators.get("Identifield");
    private static By BUTTON_NEXT = Locators.get("NextBatton");
    private static By PASSWORD_FIELD = Locators.get("PasswordField");
    private static By BUTTON_NEXT_AFTER_PASSWORD = Locators.get("NextButtonAfterPassword");
    private static By BUTTON_INBOX = Locators.get("ButtonInBox");
    private static By CHECK_INBOX = Locators.get("CheckInbox");
    private static By OUTBOX = Locators.get("OUTBox");
    private static By SPAM = Locators.get("Spam");
    private static By CHECK_SPAM = Locators.get("CheckSpam");
    private static By WRITE_MESSAGE = Locators.get("WriteMessage");
    private static By WRITE_To = Locators.get("WriteTo");
    private static By SUBJECT = Locators.get("Subject");
    private static By TEXT_MESSAGE = Locators.get("TextMessage");
    private static By SEND_MESSAGE = Locators.get("SendMessage");
    private static By ACCOUNT_INFO = Locators.get("AccountInfo");
    private static By LOG_OUT = Locators.get("LogOut");
    private static By SEARCH_MAIL_FIELD = Locators.get("SearchEmailField");
    private static By SEARCH_MAIL_BUTTON = Locators.get("SearchButtonToEmail");

public static void loginInGmailAccount(WebDriver driver,String email, String password,
                                       String searchWorld) throws InterruptedException {
    driver.findElement(INDENTI_FIELD).sendKeys(email);
    driver.findElement(BUTTON_NEXT).click();
    Thread.sleep(2000);
    driver.findElement(PASSWORD_FIELD).sendKeys(password);
    driver.findElement(BUTTON_NEXT_AFTER_PASSWORD).click();
    driver.findElement(BUTTON_INBOX).click();
    assertTrue(driver.findElement(CHECK_INBOX).isDisplayed());
    driver.findElement(OUTBOX).click();
    assertTrue(driver.findElement(OUTBOX).isDisplayed());
    driver.findElement(SPAM).click();
    assertTrue(driver.findElement(CHECK_SPAM).isDisplayed());
    driver.findElement(SEARCH_MAIL_FIELD).sendKeys(searchWorld);
    driver.findElement(SEARCH_MAIL_BUTTON).click();
    }

  public static void writeAndSendLetter(WebDriver driver, String email, String subject,String message){

      driver.findElement(WRITE_MESSAGE).click();
      driver.findElement(WRITE_To).click();
      driver.findElement(WRITE_To).sendKeys(email);
      driver.findElement(SUBJECT).click();
      driver.findElement(SUBJECT).sendKeys(subject);
      driver.findElement(TEXT_MESSAGE).click();
      driver.findElement(TEXT_MESSAGE).sendKeys(message);
      driver.findElement(SEND_MESSAGE).click();
      driver.findElement(ACCOUNT_INFO).click();
      driver.findElement(LOG_OUT).click();
  }
}
