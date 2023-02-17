package Tema8.teste;

import org.example.BrowserManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected ChromeDriver driver;

    @BeforeMethod(groups = "desktop")
    public void createChromeDriverForDesktop(){
        driver = BrowserManager.createChromeDriverForDesktop();
    }

    @BeforeMethod(groups = "mobile")
    public void createChromeDriverForMobile(){
        driver = BrowserManager.createChromeDriverForMobile();
    }

    @AfterMethod(alwaysRun = true)
    public void quitDriver() {
        if (driver!=null) {
            driver.quit();
        }
    }
}
