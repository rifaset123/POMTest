package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // ini locator
    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("submit");


    // ini method
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickButton() {
        driver.findElement(loginBtn).click();
    }
}
