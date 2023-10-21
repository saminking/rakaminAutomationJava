package cucumber.pages;

import cucumber.utility.driverConfig;
import org.openqa.selenium.By;

public class cartPage extends driverConfig {
    public static String cartTitle = "//span[contains(text(), 'Your Cart')]";
    public static String checkOutButton = "//button[@id='checkout']";

    public String cartTitleText(){
        return driver.findElement(By.xpath(cartTitle)).getText();
    }
    public void checkoutClick(){
        driver.findElement(By.xpath(checkOutButton)).click();
    }


}
