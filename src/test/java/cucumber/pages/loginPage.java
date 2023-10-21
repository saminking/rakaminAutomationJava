package cucumber.pages;

import cucumber.utility.driverConfig;
import org.openqa.selenium.By;

public class loginPage extends driverConfig {

    public static String userNameTextBox = "//input[contains(@name, 'user-name')]";
    public static String passwordTextBox = "//input[contains(@name, 'password')]";

    public static String loginButton = "//input[contains(@id, 'login-button')]";

    public static String errorMessageLocked = "//h3[contains(text(), 'Epic sadface: Sorry, this user has been locked out.')]";

    public void setUserNameInput(String userName) {
        driver.findElement(By.xpath(userNameTextBox)).sendKeys(userName);
    }

    public void setPasswordInput(String password) {
        driver.findElement(By.xpath(passwordTextBox)).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath(loginButton)).click();
    }

    public void goToSauce() {
        driver.get("https://www.saucedemo.com/");
    }

    public String errorLockedShown() {
        return driver.findElement(By.xpath(errorMessageLocked)).getText();
    }
    public void loginMenuDisplayed(){
        driver.findElement(By.xpath(userNameTextBox)).isDisplayed();
    }
}
