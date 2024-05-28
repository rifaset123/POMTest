package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestCase {

    @Test
    public void  loginTest() {
        // create object driver
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // maximize windows browser
        driver.manage().window().maximize();

        // buat objek manggil dari pages
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        // makek method buat masukin username pw
        login.enterUsername("student");
        login.enterPassword("Password123");

        // method klik login
        login.clickButton();

        // verify jika ada text products
        home.getTextProducts();

        // veryfy url
        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(home.getActualUrl(), expectedURL);

        // quit driver
        driver.quit();
    }
}
