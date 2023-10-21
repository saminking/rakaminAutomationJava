package cucumber.pages;

import cucumber.utility.driverConfig;
import org.openqa.selenium.By;

public class checkoutPage extends driverConfig {
    public static String checkoutTitle = "//span[@class='title']";
    public static String firstNameInput = "//input[@id='first-name']";
    public static String lastNameInput = "//input[@id='last-name']";
    public static String zipInput = "//input[@id='postal-code']";
    public static String checkoutContinueButton = "//input[@id='continue']";
    public static String checkoutOverviewTitle = "//span[@class='title']";
    public static String checkoutFinishButton = "//button[@id='finish']";
    public static String checkoutCompleteTitle = "//span[@class='title']";
    public static String thankYouTitle = "//h2[@class='complete-header']";



    public String getCheckoutTitle(){
        return driver.findElement(By.xpath(checkoutTitle)).getText();
    }
    public void setFirstNameInput(String firstName){
        driver.findElement(By.xpath(firstNameInput)).sendKeys(firstName);
    }
    public void setLastNameInput(String lastName){
        driver.findElement(By.xpath(lastNameInput)).sendKeys(lastName);
    }
    public void setZipInput(String zipCode){
        driver.findElement(By.xpath(zipInput)).sendKeys(zipCode);
    }
    public void clickContinueChekout(){
        driver.findElement(By.xpath(checkoutContinueButton)).click();
    }
    public String getCheckoutOverviewTitle(){
        return driver.findElement(By.xpath(checkoutOverviewTitle)).getText();
    }
    public void clickFinishCheckout(){
        driver.findElement(By.xpath(checkoutFinishButton)).click();
    }
    public String getCheckoutCompleteTitle(){
        return driver.findElement(By.xpath(checkoutCompleteTitle)).getText();
    }
    public String getThankYouMessage(){
        return driver.findElement(By.xpath(thankYouTitle)).getText();
    }
}
