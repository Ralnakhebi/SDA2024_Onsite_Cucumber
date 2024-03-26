package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Properties;

public class Driver {

    // Create a private static WebDriver object
    private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
    // To make a singleton driver, make the constructor private, so that no objects can be created from outside classes.
    private Driver() { // Constructor Driver
    }
    static Properties properties;

    // Create the getDriver method to create and initiate the driver instance
    public static WebDriver getDriver(){
        // This ensures that only one driver object is created.
        // If a driver was created before, 'driver' won't be null, and this if block won't execute.
        // It will return the existing (previously created) driver.
        properties=new Properties();
        if(driver==null){
            switch (properties.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver.set( new ChromeDriver());
                    break;
                default:
                    System.out.println("Invalid Browser Type");
            }
            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get().manage().window().maximize();

        }
        return driver.get();
    }
    // create a closeDriver method to close the driver
    public static void closeDriver() {
        //   quit the driver id it is pointing chromedriver, firefoxdriver....
        if (driver != null) {
            driver.get().quit();
            driver = null;
        }
    }
}
