package utils;
import java.util.Set;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverHelper {
    private WebDriver driver;
    public  WebDriverHelper(WebDriver driver){
        this.driver = driver;
       }
    public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void clickOnElement(By locator){
        try{
        WebElement elem = driver.findElement(locator);
        elem.click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
     }
    
    public void typeInElement(By locator, String text){
        try {
            WebElement elem = driver.findElement(locator);
        elem.sendKeys(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    public void selectDropDown(By path, String value){
        try {
            WebElement element = driver.findElement(path);
        Select select = new Select(element);
        select.selectByVisibleText(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    public void hoverOverElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
          Actions actions = new Actions(driver);
          actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void enterText(By locator, String data) {
        try {
            WebElement webElement = driver.findElement(locator);
          webElement.sendKeys(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          
    }
    public void windowSwitch(){
        try {
            String current = driver.getWindowHandle();
            Set<String> windows = driver.getWindowHandles();
        for(String window:windows){
            if(!window.equalsIgnoreCase(current)){
                driver.switchTo().window(window);
            }
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void enterAction(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void javascriptScroll(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }
    public void alertMessage(By path){
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }
    
}
