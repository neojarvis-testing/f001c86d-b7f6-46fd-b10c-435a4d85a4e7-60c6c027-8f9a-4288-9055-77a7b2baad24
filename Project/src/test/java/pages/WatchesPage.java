package pages;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.WatchesLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class WatchesPage extends Base{
    public WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;
    
    public WatchesPage(ExtentTest test){
        helper=new WebDriverHelper(driver);
        this.test = test;
        asserts = new Assertion(driver);
    }
     
    /*a.Method name:acceptOnCookies
    *b.Author:Sumayya Sultana
    *Description:This Method is for accepting cookies
    *Return Type:void
    */
    public void acceptOnCookies(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.acceptOnCookies,5);
            helper.clickOnElement(WatchesLocators.acceptOnCookies);
            LoggerHandler.logInfo("Clicked cookies");
            test.log(Status.INFO,"Clicked cookies");
            test.log(Status.PASS, "Clicked cookies");
        } catch (Exception e) {
            LoggerHandler.logError("cant Clicked cookies");
            test.log(Status.INFO,"cant clicked cookies");
            test.log(Status.FAIL, "cant Clicked cookies");
        }
    }

    /*a.Method name:hoveronwatches
    *b.Author:Sumayya Sultana
    *Description:This Method is for hovering on watches
    *Return Type:void
    */

    public void hoverOnWatches(){
        try {
            acceptOnCookies();
            helper.waitForElementToBeVisible(WatchesLocators.hoverOnWatches,5);
            helper.hoverOverElement(WatchesLocators.hoverOnWatches);
            LoggerHandler.logInfo("Hover on watches");
            test.log(Status.INFO,"Hover on watches");
            test.log(Status.PASS, "Hover on watches");
           
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant Hover on watches");
            test.log(Status.INFO,"cant Hover on watches");
            test.log(Status.FAIL, "cant Hover on watches");
        }
    }

    /*a.Method name:clickOnBestSellers
    *b.Author:Sumayya Sultana
    *Description:This Method is for clicking on Best Sellers
    *Return Type:void
    */

    public void clickOnBestSellers(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnBestSellers,5);
            helper.clickOnElement(WatchesLocators.clickOnBestSellers);
            LoggerHandler.logInfo("clicked Best Seller");
            test.log(Status.INFO,"clicked Best Seller");
            test.log(Status.PASS, "clicked Best Seller");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant clicked Best Seller");
            test.log(Status.INFO,"cant clicked Best Seller");
            test.log(Status.FAIL, "cant clicked Best Seller");
        }
    }

    /*a.Method name:verify Title
    *b.Author:Sumayya Sultana
    *Description:This Method is for verifying Title
    *Return Type:void
    */

    public void verifyTitle(){
        try {
            asserts.verifyTitleOfPage("omega");
            LoggerHandler.logInfo("Title verified");
            test.log(Status.INFO,"Title verified");
            test.log(Status.PASS, "Title verified");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant verified Title");
            test.log(Status.INFO,"cant verified Title");
            test.log(Status.FAIL, "cant verified Title");
        }
    }

    /*a.Method name:clickOnClosePopUp 
    *b.Author:Sumayya Sultana
    *Description:This Method is for closing pop up
    *Return Type:void
    */
    public void clickOnClosePopUp(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnCross,5);
            helper.clickOnElement(WatchesLocators.clickOnCross);
            LoggerHandler.logInfo("clicked close pop up");
            test.log(Status.INFO,"clicked close pop up");
            test.log(Status.PASS, "clicked close pop up");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant clicked close pop up");
            test.log(Status.INFO,"cant clicked close pop up");
            test.log(Status.FAIL, "cant clicked close pop up");
        }
    }

    /*a.Method name:clickOnForHim 
    *b.Author:Sumayya Sultana
    *Description:This Method is for clicking on For Him
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
            LoggerHandler.logInfo("clicked For Him");
            test.log(Status.INFO,"clicked For Him");
            test.log(Status.PASS, "clicked For Him");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant clicked For Him");
            test.log(Status.INFO,"cant clicked For Him");
            test.log(Status.FAIL, "cant clicked For Him");
        }
    }

    /*a.Method name:clickOnCartier 
    *b.Author:Sumayya Sultana
    *Description:This Method is for clicking on Cartier
    *Return Type:void
    */

    public void clickOnCartier(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnCartier,5);
            helper.clickOnElement(WatchesLocators.clickOnCartier);
            LoggerHandler.logInfo("clicked Cartier");
            test.log(Status.INFO,"clicked Cartier");
            test.log(Status.PASS, "clicked Cartier");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant clicked Cartier");
            test.log(Status.INFO,"cant clicked Cartier");
            test.log(Status.FAIL, "cant clicked Cartier");
        }
    }

    /*a.Method name:clickOnDialColor
    *b.Author:Sumayya Sultana
    *Description:This Method is for clicking on Dial Color
    *Return Type:void
    */

    public void clickOnDialColor(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnDialColor,5);
            helper.clickOnElement(WatchesLocators.clickOnDialColor);
            LoggerHandler.logInfo("clicked Dial Color");
            test.log(Status.INFO,"clicked Dial Color");
            test.log(Status.PASS, "clicked Dial Color");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant clicked Dial Color");
            test.log(Status.INFO,"cant clicked Dial Color");
            test.log(Status.FAIL, "cant clicked Dial Color");
        }
    }

    /*a.Method name:clickOnBlack
    *b.Author:Sumayya Sultana
    *Description:This Method is for clicking on Black
    *Return Type:void
    */

    public void clickOnBlack(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnBlack,5);
            helper.clickOnElement(WatchesLocators.clickOnBlack);
            LoggerHandler.logInfo("clicked on Black");
            test.log(Status.INFO,"clicked on Black");
            test.log(Status.PASS, "clicked on Black");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant clicked on Black");
            test.log(Status.INFO,"cant clicked on Black");
            test.log(Status.FAIL, "cant clicked on Black");
        }
    }

    /*a.Method name:clickOnFirstProduct
    *b.Author:Sumayya Sultana
    *Description:This Method is for clicking on first product
    *Return Type:void
    */


    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnFirstProduct,5);
            helper.clickOnElement(WatchesLocators.clickOnFirstProduct);
            LoggerHandler.logInfo("clicked First Product");
            test.log(Status.INFO,"clicked First Product");
            test.log(Status.PASS, "clicked First Product");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant clicked First Product");
            test.log(Status.INFO,"cant clicked First Product");
            test.log(Status.FAIL, "cant clicked First Product");
        }
    }
    
    /*a.Method name:clickOnAdd
    *b.Author:Sumayya Sultana
    *Description:This Method is for clicking on add to cart
    *Return Type:void
    */
    public void clickOnAdd(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnAdd,5);
            helper.clickOnElement(WatchesLocators.clickOnAdd);
            Screenshot.takeScreenshot("Add To Shopping Bag");
            LoggerHandler.logInfo("clicked add to cart");
            test.log(Status.INFO,"clicked add to cart");
            test.log(Status.PASS, "clicked add to cart");
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.logError("cant clicked add to cart");
            test.log(Status.INFO,"cant clicked add to cart");
            test.log(Status.FAIL, "cant clicked add to cart");
        }
    }

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
