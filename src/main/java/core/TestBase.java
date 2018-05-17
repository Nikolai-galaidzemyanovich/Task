package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    protected String site = "https://www.tut.by/";
    protected String site2 = "https://gmail.com/";
    protected String site3 = "https://www.delta.com/";

    @BeforeTest
    public void setUp(){
       // System.setProperty("webdriver.gecko.driver", "C:/q/geckodriver.exe");
       // driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get(site3);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();

    }


}
