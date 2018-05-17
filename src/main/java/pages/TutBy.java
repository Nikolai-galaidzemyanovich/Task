package pages;

import helpers.Locators;
import org.openqa.selenium.*;
import java.util.List;

public class TutBy {

private static By SEARCH_FIELD = Locators.get("SearchFieldLink");
private static By SEARCH_BUTTON = Locators.get("SearchButton");
private static By COUNT = Locators.get("Count");

    public static void searchField(WebDriver driver, String searchInformation){
        driver.findElement(SEARCH_FIELD).sendKeys(searchInformation);
        driver.findElement(SEARCH_BUTTON).sendKeys(Keys.ENTER);
}

    public static int countingSearchResults(WebDriver driver){
        List<WebElement> letters = driver.findElements(COUNT);
        letters.size();
        return letters.size();
}

    public static void clickSearchResult(WebDriver driver,String text){
        try {
            if (driver.getPageSource().contains(text)) {
                driver.findElement(By.linkText(text)).click();
            }else{
                System.out.println("No search result");
            }
             }catch (WebDriverException e){
            System.out.println("Error");
        }
    }
}
