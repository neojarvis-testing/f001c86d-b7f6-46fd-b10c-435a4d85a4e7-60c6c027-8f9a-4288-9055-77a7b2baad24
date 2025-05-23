package utils;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class Base {
    public static WebDriver driver;
    public static FileInputStream file;
    public static Properties prop;
    Property property = new Property();
     
    /*Method name:openBrowser
    *Author:Sumayya Sultana
    *Description:This method is for opening Browser
    *Parameters:N/A
    *Return Type:void
    */
    public void openBrowser() {
            prop=property.loadBaseProperties();
        try {
            driver = new RemoteWebDriver(new URL(prop.getProperty("gridurl")), new ChromeOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);
    }
}

