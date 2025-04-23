package pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ContactPageLocators;
import uistore.RingsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class ContactPageActions extends Base {

    WebDriver driver;
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    LoggerHandler logs;
    public ContactPageActions(WebDriver driver, ExtentTest test, LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        asserts = new Assertion(driver, logs);
        this.logs = logs;
    }
     /*a.Method name:clickOnAccept
    *b.Author:Krishna Reddy
    *Description:This Method is for click on accept cookies 
    *Return Type:void
    */
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        LoggerHandler.logInfo("Clicked on accept cookies");
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked Accept");
            test.log(Status.FAIL, "Clicked Accept");

        }
    }
    /*a.Method name:clickOnContact
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on contact us
    *Return Type:void
    */
    public void clickOnContact(){
        try{
        helper.clickOnElement(ContactPageLocators.contact);
        asserts.verifyTitleOfPage("Contact Us");
        asserts.verifyURLOfPage("https://www.mayors.com/contact-us");
        LoggerHandler.logInfo("Clicked on Contact");
        test.log(Status.PASS,"Clicked on Contact");
        
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked Contact");
            test.log(Status.FAIL, "Clicked Contact");

        }
    }
    
     /*a.Method name:clickOnLuxury
    *b.Author:Krishna Reddy
    *Description:This Method is for click on luxury
    *Return Type:void
    */
    public void clickOnLuxury(){
        try{
            driver.navigate().back();
       helper.waitForElementToBeVisible(ContactPageLocators.luxury, 5);
        helper.clickOnElement(ContactPageLocators.luxury);
        LoggerHandler.logInfo("Clicked on Luxury");
        test.log(Status.PASS,"Clicked on Luxury");
        asserts.verifyTitleOfPage("Luxury Services | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/luxury-services");

    }
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked Luxury");
            test.log(Status.FAIL, "Clicked Luxury");

        }
    }
    
    /*a.Method name:clickOnStore
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on store
    *Return Type:void
    */
    public void clickOnStore(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.store, 5);
         helper.clickOnElement(ContactPageLocators.store);
         LoggerHandler.logInfo("Clicked on Store");
        test.log(Status.PASS,"Clicked on Store");
        asserts.verifyTitleOfPage("Store Finder | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/store-finder");
       }
       catch(Exception e){
        LoggerHandler.logError("Clicked Store");
        test.log(Status.FAIL, "Clicked Store");

    }
}
    
     /*a.Method name:clickOnDelivery
    *b.Author:Krishna Reddy
    *Description:This Method is for click On Delivery
    *Return Type:void
    */
     public void clickOnDelivery(){
        try{
            driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.delivery, 5);
         helper.clickOnElement(ContactPageLocators.delivery);
         LoggerHandler.logInfo("Clicked on Delivery");
        test.log(Status.PASS,"Clicked on Delivery");
        asserts.verifyTitleOfPage(" Delivery Information | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/delivery-information");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked Delivery");
            test.log(Status.FAIL, "Clicked Delivery");

        }
        
     }
     /*a.Method name:clickOnclick
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on click and collect
    *Return Type:void
    */
     public void clickOnclick(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.click, 5);
         helper.clickOnElement(ContactPageLocators.click);
         LoggerHandler.logInfo("Clicked on Delivery");
        test.log(Status.PASS,"Clicked on Delivery");
        asserts.verifyTitleOfPage("Click and Collect | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/click-and-collect");
       }
       catch(Exception e){
        LoggerHandler.logError("Clicked Click");
        test.log(Status.FAIL, "Clicked Click");

    }
}
      /*a.Method name:clickOnReturn
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on return 
    *Return Type:void
    */
     public void clickOnReturn(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.retpolicy, 5);
         helper.clickOnElement(ContactPageLocators.retpolicy);
         LoggerHandler.logInfo("Clicked on Return");
        test.log(Status.PASS,"Clicked on Return");
        asserts.verifyTitleOfPage("Return Policy | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/return-policy");
       }
       catch(Exception e){
        LoggerHandler.logError("Clicked Return");
        test.log(Status.FAIL, "Clicked Return");

    }
}

      /*a.Method name:clickOnAffrim
    *b.Author:Krishna Reddy
    *Description:This Method is forclick the Affrim
    *Return Type:void
    */
     public void clickOnAffrim(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.affrim, 5);
         helper.clickOnElement(ContactPageLocators.affrim);
         LoggerHandler.logInfo("Clicked on Affrim");
        test.log(Status.PASS,"Clicked on Affrim");
        asserts.verifyTitleOfPage("Affirm Finance | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/affirm-finance");
       }
       catch(Exception e){
        LoggerHandler.logError("Clicked Affrim");
        test.log(Status.FAIL, "Clicked Affrim");

    }
}
     /*a.Method name:clickOnFeedback
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on feedback
    *Return Type:void
    */
     public void clickOnFeedback(){
       try{
        driver.navigate().back();
        helper.waitForElementToBeVisible(ContactPageLocators.feedback, 5);
         helper.clickOnElement(ContactPageLocators.feedback);
         LoggerHandler.logInfo("Clicked on Feedback");
        test.log(Status.PASS,"Clicked on Feedback");
        asserts.verifyTitleOfPage("Your Feedback | Mayors");
        asserts.verifyURLOfPage("https://www.mayors.com/your-feedback");
       }
       catch(Exception e){
        LoggerHandler.logError("Clicked Feedback");
        test.log(Status.FAIL, "Clicked Feedback");

    }
      
     }

    //  /*a.Method name:clusterVerification
    // *b.Author:Krishna Reddy
    // *Description:This Method is for verification of group of elements
    // *Return Type:void
    // */
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
