package cucumber.pages;

import cucumber.utility.driverConfig;
import org.openqa.selenium.By;

public class homePage extends driverConfig {
    public static String productPageTitle = "//span[contains(text(), 'Products')]";
    public static String addToCartButton = "(//div[contains(@class, 'inventory_item')]//button[contains(text(), 'Add to cart')])[1]";
    public static String cartItemAmount = "//span[contains(@class, 'shopping_cart_badge')]";
    public static String cartLink = "//a[contains(@class, 'shopping_cart_link')]";
    public static String hamburgerMenu = "//button[@id='react-burger-menu-btn']";
    public static String logoutButton = "//a[@id='logout_sidebar_link']";

    public String productTitle(){
        return driver.findElement(By.xpath(productPageTitle)).getText();
    }
    public void clickAddToCart(){
        driver.findElement(By.xpath(addToCartButton)).click();
    }
    public String itemAmountInCart(){
        return driver.findElement(By.xpath(cartItemAmount)).getText();
    }
    public void goToCartMenu(){
        driver.findElement(By.xpath(cartLink)).click();
    }
    public void clickHamburger(){
        driver.findElement(By.xpath(hamburgerMenu)).click();
    }
    public void clickLogout(){
        driver.findElement(By.xpath(logoutButton)).click();
    }

}
