package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class AccountPage {
    WebDriver driver;
    WebDriverWait  wait;

    By LoginButton=By.className("login-button");
    By USERNAME=By.id("usernameInput");
    By PASSWORD=By.id("passwordInput");

    public AccountPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(20));

    }

    public void login(String username , String password){
        driver.findElement(USERNAME).sendKeys(username);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LoginButton).click();
    }
}
