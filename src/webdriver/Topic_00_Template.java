package webdriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_00_Template {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    @BeforeClass
    public void beforeClass() {
        // Config browser driver
        System.setProperty("webdriver.chrome.driver", projectPath + File.separator + "browserDrivers" + File.separator+ "chromedriver");

        // Khởi tạo browser
        driver = new ChromeDriver();

        // Config wait time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Maximize window size
        driver.manage().window().maximize();


        driver.get("https://vietstartest.com/practice-basic-selenium/");
    }

    @Test
    public void TC_01_() {

    }

    @Test
    public void TC_02_() {

    }

    @Test
    public void TC_03_() {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
