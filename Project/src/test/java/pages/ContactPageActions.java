package pages;


import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ContactPageLocators;
import uistore.RingsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class ContactPageActions extends Base {

    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    LoggerHandler logs;
    /*
     * Constructor Name : ContactPageActions
     * Author Name : Krishna Reddy
     * Description : This constructor creates the instances of the WebDriverHelper and Assertion.
     * Parameters : N/A
     * Return Type : void
     */
    public ContactPageActions(WebDriver driver, ExtentTest test, LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        asserts = new Assertion(driver, logs);
        this.logs = logs;
    }
   /*
     * Method Name : clickOnAccept
     * Author Name : Krishna Reddy
     * Description : This method clicks on Accept cookies on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        logs.logInfo("Clicked on accept cookies");
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            logs.logError("Clicked Accept");
            test.log(Status.FAIL, "Clicked Accept");

        }
    }
     /*
     * Method Name : clickOnContact
     * Author Name : Krishna Reddy
     * Description : This method clicks on Contact us on the home page
     * Parameters : N/A
     * Return Type : void
     */
    
    public void clickOnContact(){
        try{
        helper.clickOnElement(ContactPageLocators.contact);
        asserts.verifyTitleOfPage("Contact Us");
        asserts.verifyURLOfPage("https://www.mayors.com/contact-us");
        logs.logInfo("Clicked on Contact");
        test.log(Status.PASS,"Clicked on Contact");
        
        }
        catch(Exception e){
            logs.logError("Clicked Contact");
            test.log(Status.FAIL, "Clicked Contact");
            Screenshot.takeScreenshot("src3");
            Reporter.attachScreenshotToReport("Brands", test, "src3");

        }
    }
    
     /*
     * Method Name : clickOnContact
     * Author Name : Krishna Reddy
     * Description : This method clicks on Luxury on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnLuxury(){
        try{
            driver.navigate().back();
       helper.waitForElementToBeVisible(ContactPageLocators.luxury, 5);
        helper.clickOnElement(ContactPageLocators.luxury);
        logs.logInfo("Clicked on Luxury");
        test.log(Status.PASS,"Clicked on Luxury");
        asserts.verifyTitleOfPage("Luxury Services | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/luxury-services");
    }catch(Exception e){
        logs.logError("Clicked Store");
        test.log(Status.FAIL, "Clicked Store");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("Brands", test, "src5");

    }
}
    
    /*
     * Method Name : clickOnStore
     * Author Name : Krishna Reddy
     * Description : This method clicks on Store on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnStore(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.store, 5);
         helper.clickOnElement(ContactPageLocators.store);
         logs.logInfo("Clicked on Store");
        test.log(Status.PASS,"Clicked on Store");
        asserts.verifyTitleOfPage("Store Finder | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/store-finder");
       }
       catch(Exception e){
        logs.logError("Clicked Store");
        test.log(Status.FAIL, "Clicked Store");
        Screenshot.takeScreenshot("src5");
        Reporter.attachScreenshotToReport("Brands", test, "src5");

    }
}
    
     /*
     * Method Name : clickOnDelivery
     * Author Name : Krishna Reddy
     * Description : This method clicks on Delivery on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnDelivery(){
        try{
            driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.delivery, 5);
         helper.clickOnElement(ContactPageLocators.delivery);
         logs.logInfo("Clicked on Delivery");
        test.log(Status.PASS,"Clicked on Delivery");
        asserts.verifyTitleOfPage(" Delivery Information | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/delivery-information");
        }
        catch(Exception e){
            logs.logError("Clicked Delivery");
            test.log(Status.FAIL, "Clicked Delivery");
            Screenshot.takeScreenshot("src2");
            Reporter.attachScreenshotToReport("Brands", test, "src2");
           

        }
        
     }
      /*
     * Method Name : clickOnclick
     * Author Name : Krishna Reddy
     * Description : This method clicks on click and collect on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnclick(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.click, 5);
         helper.clickOnElement(ContactPageLocators.click);
         logs.logInfo("Clicked on Click and collect");
        test.log(Status.PASS,"Clicked on Click and collect");
        asserts.verifyTitleOfPage("Click and Collect | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/click-and-collect");
       }
       catch(Exception e){
        logs.logError("Clicked Click and collect");
        test.log(Status.FAIL, "Clicked Click and collect");
        Screenshot.takeScreenshot("src99");
        Reporter.attachScreenshotToReport("Brands", test, "src99");

    }
}
      /*
     * Method Name : clickOnReturn
     * Author Name : Krishna Reddy
     * Description : This method clicks on Return Policy on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnReturn(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.retpolicy, 5);
         helper.clickOnElement(ContactPageLocators.retpolicy);
         logs.logInfo("Clicked on Return");
        test.log(Status.PASS,"Clicked on Return");
        asserts.verifyTitleOfPage("Return Policy | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/return-policy");
       }
       catch(Exception e){
        logs.logError("Clicked Return");
        test.log(Status.FAIL, "Clicked Return");
        Screenshot.takeScreenshot("src11");
        Reporter.attachScreenshotToReport("Brands", test, "src11");

    }
}

     /*
     * Method Name : clickOnAffrim
     * Author Name : Krishna Reddy
     * Description : This method clicks on Affrim on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnAffrim(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.affrim, 5);
         helper.clickOnElement(ContactPageLocators.affrim);
         logs.logInfo("Clicked on Affrim");
        test.log(Status.PASS,"Clicked on Affrim");
        asserts.verifyTitleOfPage("Affirm Finance | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/affirm-finance");
       }
       catch(Exception e){
        logs.logError("Clicked Affrim");
        test.log(Status.FAIL, "Clicked Affrim");
        Screenshot.takeScreenshot("src12");
        Reporter.attachScreenshotToReport("Brands", test, "src12");

    }
}
      /*
     * Method Name : clickOnFeedback
     * Author Name : Krishna Reddy
     * Description : This method clicks on Feedback on the home page
     * Parameters : N/A
     * Return Type : void
     */
     public void clickOnFeedback(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.feedback, 5);
         helper.clickOnElement(ContactPageLocators.feedback);
         logs.logInfo("Clicked on Feedback");
        test.log(Status.PASS,"Clicked on Feedback");
        asserts.verifyTitleOfPage("Your Feedback | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/your-feedback");
       }
       catch(Exception e){
        logs.logError("Clicked Feedback");
        test.log(Status.FAIL, "Clicked Feedback");
        Screenshot.takeScreenshot("src13");
        Reporter.attachScreenshotToReport("Brands", test, "src13");

    }
      
     }

     /*
    * Method Name : runContact
    * Author Name : Krishna Reddy
    * Description : This method is a cluster of all the methods which needs to be executed
    * Parameters : N/A
    * Return Type : void
    */
    public void runContact(){
        clickOnAccept();
        clickOnContact();
        clickOnLuxury();
        clickOnStore();
        clickOnDelivery();
        clickOnclick();
        clickOnReturn();
        clickOnAffrim();
        clickOnFeedback();
        
       
        
    }
    
}
