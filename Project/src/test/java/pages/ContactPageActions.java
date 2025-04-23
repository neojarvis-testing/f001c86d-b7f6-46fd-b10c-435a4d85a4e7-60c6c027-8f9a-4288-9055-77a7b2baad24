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
    public void clickOnContact(){
       // helper.hoverOverElement(ContactPageLocators.contact);
        helper.clickOnElement(ContactPageLocators.contact);
        driver.navigate().back();

       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
    public void verifyContact(){
        asserts.verifyTitleOfPage("Contact Us | Mayors");
    }
    public void verifyContactURL(){
        asserts.verifyURLOfPage("https://www.mayors.com/contact-us");
    }
    public void clickOnLuxury(){
       // helper.hoverOverElement(ContactPageLocators.luxury);
       helper.waitForElementToBeVisible(ContactPageLocators.luxury, 5);
        helper.clickOnElement(ContactPageLocators.luxury);
        driver.navigate().back();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
    public void verifyLuxury(){
        asserts.verifyTitleOfPage("Luxury Services | Mayors");
    }
    public void verifyLuxuryURL(){
        asserts.verifyURLOfPage("https://www.mayors.com/luxury-services");
    }
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   
    public void clickOnStore(){
       
        helper.waitForElementToBeVisible(ContactPageLocators.store, 5);
         helper.clickOnElement(ContactPageLocators.store);
         driver.navigate().back();
        
     }
     public void verifyStore(){
        asserts.verifyTitleOfPage("Store Finder | Mayors");
    }
    public void verifyStoreURL(){
        asserts.verifyURLOfPage("https://www.mayors.com/store-finder");
    }
     public void clickOnDelivery(){
       
        helper.waitForElementToBeVisible(ContactPageLocators.delivery, 5);
         helper.clickOnElement(ContactPageLocators.delivery);
         driver.navigate().back();
        
     }
     public void verifyDelivery(){
        asserts.verifyTitleOfPage(" Delivery Information | Mayors");
    }
    public void verifyDeliveryURL(){
        asserts.verifyURLOfPage("https://www.mayors.com/delivery-information");
    }
     public void clickOnclick(){
       
        helper.waitForElementToBeVisible(ContactPageLocators.click, 5);
         helper.clickOnElement(ContactPageLocators.click);
         driver.navigate().back();
        
     }
     public void verifyclick(){
        asserts.verifyTitleOfPage("Click and Collect | Mayors");
    }
    public void verifyClickURL(){
        asserts.verifyURLOfPage("https://www.mayors.com/click-and-collect");
    }
     public void clickOnReturn(){
       
        helper.waitForElementToBeVisible(ContactPageLocators.retpolicy, 5);
         helper.clickOnElement(ContactPageLocators.retpolicy);
         driver.navigate().back();
        
     }
     public void verifyReturn(){
        asserts.verifyTitleOfPage("Return Policy | Mayors");
    }
    public void verifyReturnURL(){
        asserts.verifyURLOfPage("https://www.mayors.com/return-policy");
    }
     public void clickOnAffrim(){
       
        helper.waitForElementToBeVisible(ContactPageLocators.affrim, 5);
         helper.clickOnElement(ContactPageLocators.affrim);
         driver.navigate().back();
        
     }
     public void verifyAffrim(){
        asserts.verifyTitleOfPage("Affirm Finance | Mayors");
    }
    public void verifyAffrimURL(){
        asserts.verifyURLOfPage("https://www.mayors.com/affirm-finance");
    }
     public void clickOnFeedback(){
       
        helper.waitForElementToBeVisible(ContactPageLocators.feedback, 5);
         helper.clickOnElement(ContactPageLocators.feedback);
         driver.navigate().back();
        
     }
     public void verifyFeedback(){
        asserts.verifyTitleOfPage("Your Feedback | Mayors");
    }
    public void verifyFeedbackURL(){
        asserts.verifyURLOfPage("https://www.mayors.com/your-feedback");
    }
    public void clusterVerification(){
        verifyAffrim();
        verifyAffrimURL();
        verifyLuxury();
        verifyLuxuryURL();
        verifyContact();
        verifyContactURL();
        verifyDelivery();
        verifyDeliveryURL();
        verifyReturn();
        verifyReturnURL();
        verifyFeedback();
        verifyFeedbackURL();
        verifyStore();
        verifyStoreURL();
        verifyclick();
        verifyClickURL();
        
    }
    
}
