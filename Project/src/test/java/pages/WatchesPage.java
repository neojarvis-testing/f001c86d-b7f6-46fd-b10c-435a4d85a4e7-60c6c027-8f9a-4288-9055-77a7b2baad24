package pages;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.WatchesLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class WatchesPage extends Base{
    public WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;
    /*Method name:WatchesPage
    *Author:Sumayya Sultana
    *Description:This method is a constructor od class WatchesPage
    *Parameters: test
    *Return Type:none
    */
    public WatchesPage(ExtentTest test,LoggerHandler logs){
        helper=new WebDriverHelper(driver);
        this.test = test;
        asserts = new Assertion(driver,logs);
        this.logs=logs;
    }
     
    /*Method name:acceptOnCookies
    *Author:Sumayya Sultana
    *Description:This method is for accepting cookies
    *Parameters: N/A
    *Return Type:void
    */
    public void acceptOnCookies(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.acceptOnCookies,5);
            helper.clickOnElement(WatchesLocators.acceptOnCookies);
            LoggerHandler.logInfo("Clicked on cookies");
            test.log(Status.INFO,"Clicked on cookies");
            test.log(Status.PASS, "Clicked on cookies");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to click on the Cookies");
            test.log(Status.INFO,"Unable to click on the Cookies");
            test.log(Status.FAIL, "Unable to click on the Cookies");
            Screenshot.takeScreenshot("Cookies");
            Reporter.attachScreenshotToReport("Cookies", test, "Cookies");
        }
    }

    /*Method name:hoverOnWatches
    *Author:Sumayya Sultana
    *Description:This method is for hovering on watches
    *Parameters: N/A
    *Return Type:void
    */

    public void hoverOnWatches(){
        try {
            acceptOnCookies();
            helper.waitForElementToBeVisible(WatchesLocators.hoverOnWatches,5);
            helper.hoverOverElement(WatchesLocators.hoverOnWatches);
            test.log(Status.INFO,"Hover on watches");
            logs.logInfo("Hover on watches");
            test.log(Status.PASS, "Hover on watches");
           
        } catch (Exception e) {
            LoggerHandler.logError("Unable to Hover on watches");
            test.log(Status.INFO,"Unable to Hover on watches");
            test.log(Status.FAIL, "Unable to Hover on watches");
            Screenshot.takeScreenshot("Hover watches");
            Reporter.attachScreenshotToReport("Hover watches", test, "Hover watches");
        }
    }

    /*Method name:clickOnBestSellers
    *Author:Sumayya Sultana
    *Description:This method is for clicking on Best Sellers
    *Parameters: N/A
    *Return Type:void
    */

    public void clickOnBestSellers(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnBestSellers,5);
            helper.clickOnElement(WatchesLocators.clickOnBestSellers);
            LoggerHandler.logInfo("Clicked n Best Seller");
            test.log(Status.INFO,"Clicked on Best Seller");
            test.log(Status.PASS, "Clicked on Best Seller");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to  click on Best Seller");
            test.log(Status.INFO,"Unable to  click on Best Seller");
            test.log(Status.FAIL, "Unable to  click on Best Seller");
            Screenshot.takeScreenshot("Best Sellers");
            Reporter.attachScreenshotToReport("Best Sellers", test, "Best Sellers");
        }
    }

    /*Method name:verifyTitle
    *Author:Sumayya Sultana
    *Description:This method is for verifying Title
    *Parameters: N/A
    *Return Type:void
    */

    public void verifyTitle(){
        try {
            asserts.verifyTitleOfPage("omega");
            LoggerHandler.logInfo("Title verified");
            test.log(Status.INFO,"Title verified");
            test.log(Status.PASS, "Title verified");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to verify Title");
            test.log(Status.INFO,"Unable to verify Title");
            test.log(Status.FAIL, "Unable to verify Title");
            Screenshot.takeScreenshot("verified Title");
            Reporter.attachScreenshotToReport("verified Title", test, "verified Title");
        }
    }

    /*Method name:clickOnClosePopUp 
    *Author:Sumayya Sultana
    *Description:This method is for closing pop up
    *Parameters: N/A
    *Return Type:void
    */
    public void clickOnClosePopUp(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnCross,5);
            helper.clickOnElement(WatchesLocators.clickOnCross);
            LoggerHandler.logInfo("Clicked on close pop up");
            test.log(Status.INFO,"Clicked on close pop up");
            test.log(Status.PASS, "Clicked on close pop up");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to click on close pop up");
            test.log(Status.INFO,"Unable to click on close pop up");
            test.log(Status.FAIL, "Unable to click on close pop up");
            Screenshot.takeScreenshot("Close pop up");
            Reporter.attachScreenshotToReport("Close pop up", test, "Close pop up");
        }
    }

    /*Method name:clickOnForHim 
    *Author:Sumayya Sultana
    *Description:This method is for clicking on For Him
    *Parameters: N/A
    *Return Type:void
    */
    public void clickOnForHim(){
        try {
            try {
                clickOnClosePopUp();
            } catch (Exception e) {
            }
            helper.waitForElementToBeVisible(WatchesLocators.clickOnForHim,5);
            helper.clickOnElement(WatchesLocators.clickOnForHim);
            LoggerHandler.logInfo("Clicked on For Him");
            test.log(Status.INFO,"Clicked on For Him");
            test.log(Status.PASS, "Clicked on For Him");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to click on For Him");
            test.log(Status.INFO,"Unable to click on For Him");
            test.log(Status.FAIL, "Unable to click on For Him");
            Screenshot.takeScreenshot("Clicked For Him");
            Reporter.attachScreenshotToReport("Clicked For Him", test, "Clicked For Him");
        }
    }

    /*Method name:clickOnCartier 
    *Author:Sumayya Sultana
    *Description:This method is for clicking on Cartier
    *Parameters: N/A
    *Return Type:void
    */

    public void clickOnCartier(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnCartier,5);
            helper.clickOnElement(WatchesLocators.clickOnCartier);
            LoggerHandler.logInfo("Clicked on Cartier");
            test.log(Status.INFO,"Clicked on Cartier");
            test.log(Status.PASS, "Clicked on Cartier");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to click on Cartier");
            test.log(Status.INFO,"Unable to click on Cartier");
            test.log(Status.FAIL, "Unable to click on Cartier");
            Screenshot.takeScreenshot("Cartier");
            Reporter.attachScreenshotToReport("Cartier", test, "Cartier");
        }
    }

    /*Method name:clickOnDialColor
    *Author:Sumayya Sultana
    *Description:This method is for clicking on Dial Color
    *Parameters: N/A
    *Return Type:void
    */

    public void clickOnDialColor(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnDialColor,5);
            helper.clickOnElement(WatchesLocators.clickOnDialColor);
            LoggerHandler.logInfo("Clicked on Color");
            test.log(Status.INFO,"Clicked on Color");
            test.log(Status.PASS, "Clicked on Color");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to click on Color");
            test.log(Status.INFO,"Unable to click on Color");
            test.log(Status.FAIL, "Unable to click on Color");
            Screenshot.takeScreenshot("Dial Color");
            Reporter.attachScreenshotToReport("Dial Color", test, "Dial Color");

        }
    }

    /*Method name:clickOnBlack
    *Author:Sumayya Sultana
    *Description:This method is for clicking on Black
    *Parameters: N/A
    *Return Type:void
    */

    public void clickOnBlack(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnBlack,5);
            helper.clickOnElement(WatchesLocators.clickOnBlack);
            LoggerHandler.logInfo("Clicked on Black");
            test.log(Status.INFO,"Clicked on Black");
            test.log(Status.PASS, "Clicked on Black");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to click on Black");
            test.log(Status.INFO,"Unable to click on Black");
            test.log(Status.FAIL, "Unable to click on Black");
            Screenshot.takeScreenshot("Black");
            Reporter.attachScreenshotToReport("Black", test, "Black");

        }
    }

    /*Method name:clickOnFirstProduct
    *Author:Sumayya Sultana
    *Description:This method is for clicking on first product
    *Parameters: N/A
    *Return Type:void
    */


    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnFirstProduct,5);
            helper.clickOnElement(WatchesLocators.clickOnFirstProduct);
            LoggerHandler.logInfo("Clicked on First Product");
            test.log(Status.INFO,"Clicked First on Product");
            test.log(Status.PASS, "Clicked First on Product");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to click on First Product");
            test.log(Status.INFO,"Unable to click on First Product");
            test.log(Status.FAIL, "Unable to click on First Product");
            Screenshot.takeScreenshot("First Product");
            Reporter.attachScreenshotToReport("First Product", test, "First Product");

        }
    }
    
    /*Method name:clickOnAdd
    *Author:Sumayya Sultana
    *Description:This method is for clicking on add to cart
    *Parameters: N/A
    *Return Type:void
    */
    public void clickOnAdd(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnAdd,5);
            helper.clickOnElement(WatchesLocators.clickOnAdd);
            Screenshot.takeScreenshot("Add To Shopping Bag");
            LoggerHandler.logInfo("Clicked on add to cart");
            test.log(Status.INFO,"Clicked on add to cart");
            test.log(Status.PASS, "Clicked on add to cart");
        } catch (Exception e) {
            LoggerHandler.logError("Unable to click on add to cart");
            test.log(Status.INFO,"Unable to click on add to cart");
            test.log(Status.FAIL, "Unable to click on add to cart");
            Screenshot.takeScreenshot("Add to cart");
            Reporter.attachScreenshotToReport("Add to cart", test, "Add to cart");
        }
    }

    /*Method name:testcase1
    *Author:Sumayya Sultana
    *Description:This method is cluster method for all the above actions
    *Parameters: N/A
    *Return Type:void
    */

    public void testcase1(){
        hoverOnWatches();
        clickOnBestSellers();
        clickOnForHim();
        clickOnCartier();
        clickOnDialColor();
        clickOnBlack();
        clickOnFirstProduct();
        clickOnAdd();
    } 
}
