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
    /*
     * Method Name : waitForElementToBeVisible
     * Author Name : Praneeth
     * Description : This method is used to wait until the element get visible
     * Parameters : locator , timeoutInSeconds
     * Return Type : void
     */
    public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*
     * Method Name : waitForElementToBeClickable
     * Author Name : Praneeth
     * Description : This method is used to wait until the element is clicked
     * Parameters : locator , timeoutInSeconds
     * Return Type : void
     */
    public void waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*
     * Method Name : clickOnElement
     * Author Name : Praneeth
     * Description : This method is used to click on the element
     * Parameters : locator
     * Return Type : void
     */
    public void clickOnElement(By locator){
        try{
        WebElement elem = driver.findElement(locator);
        elem.click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
     }
    /*
     * Method Name : typeInElement
     * Author Name : Praneeth
     * Description : This method is used to input value
     * Parameters : locator , text
     * Return Type : void
     */
    public void typeInElement(By locator, String text){
        try {
            WebElement elem = driver.findElement(locator);
        elem.sendKeys(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    /*
     * Method Name : selectDropDown
     * Author Name : Praneeth
     * Description : This method is used to select value in a dropdown
     * Parameters : path , value
     * Return Type : void
     */
    public void selectDropDown(By path, String value){
        try {
            WebElement element = driver.findElement(path);
        Select select = new Select(element);
        select.selectByVisibleText(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    /*
     * Method Name : hoverOverElement
     * Author Name : Praneeth
     * Description : This method is used to hover on a element
     * Parameters : locator
     * Return Type : void
     */
    public void hoverOverElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
          Actions actions = new Actions(driver);
          actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*
     * Method Name : enterText
     * Author Name : Praneeth
     * Description : This method is used to enter data 
     * Parameters : locator , data
     * Return Type : void
     */
    public void enterText(By locator, String data) {
        try {
           WebElement webElement = driver.findElement(locator);
          webElement.sendKeys(data);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          
    }
    /*
     * Method Name : windowSwitch
     * Author Name : Praneeth
     * Description : This method is used to shift the focus of the window
     * Parameters : NA
     * Return Type : void
     */
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
    /*
     * Method Name : enterAction
     * Author Name : Praneeth
     * Description : This method is used to perform enter action after entering value
     * Parameters : locator
     * Return Type : void
     */
    public void enterAction(By locator) {
        try {

            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /*
     * Method Name : javascriptScroll
     * Author Name : Praneeth
     * Description : This method is used to scroll to the element 
     * Parameters : locator
     * Return Type : void
     */
    public void javascriptScroll(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }
    /*
     * Method Name : alertMessage
     * Author Name : Praneeth
     * Description : This method is used to handle alerts
     * Parameters : path
     * Return Type : void
     */
    public void alertMessage(By path){
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }
    /*
     * Method Name : excelReading
     * Author Name : Praneeth
     * Description : This method is used read data from a excel reader
     * Parameters : path
     * Return Type : void
     */
    public String excelReading(int sheet, int row , int col){
        String text = ExcelReader.excelReader(System.getProperty("user.dir")+"/testdata/Excel.xlsx",sheet,row,col);
        return text;
    }
    
}
