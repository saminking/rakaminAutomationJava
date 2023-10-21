package cucumber.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Optional;

public class driverConfig {
    public static WebDriver driver;

    public ChromeOptions options;

    public void BrowseDriver(){
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "src/test/resources/chromedriver/chromedriver.exe");
        this.options.setImplicitWaitTimeout(Duration.ofSeconds(40));
        this.driver = new ChromeDriver(options);
    }

    public void close(){
        this.driver.close();
    }
}
