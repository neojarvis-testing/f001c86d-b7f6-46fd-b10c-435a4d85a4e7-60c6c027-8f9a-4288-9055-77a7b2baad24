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
    LoggerHandler logs;
    public WatchesPage(ExtentTest test,LoggerHandler logs){
        helper=new WebDriverHelper(driver);
        this.test = test;
        asserts = new Assertion(driver,logs);
        this.logs=logs;
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
             logs.logInfo("Clicked cookies");
            test.log(Status.PASS, "Clicked cookies");
        } catch (Exception e) {
            logs.logError("Clicked cookies");
            test.log(Status.FAIL, "Clicked cookies");
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
            logs.logInfo("Hover on watches");
            test.log(Status.PASS, "Hover on watches");
           
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant Hover on watches");
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
            logs.logInfo("clicked Best Seller");
            test.log(Status.PASS, "clicked Best Seller");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant clicked Best Seller");
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
            logs.logInfo("Title verified");
            test.log(Status.PASS, "Title verified");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant verified Title");
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
            logs.logInfo("clicked cross");
            test.log(Status.PASS, "clicked cross");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant clicked cross");
            test.log(Status.FAIL, "cant clicked cross");
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
            logs.logInfo("clicked For Him");
            test.log(Status.PASS, "clicked For Him");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant clicked For Him");
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
            logs.logInfo("clicked Cartier");
            test.log(Status.PASS, "clicked Cartier");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant clicked Cartier");
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
            logs.logInfo("clicked Dial Color");
            test.log(Status.PASS, "clicked Dial Color");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant clicked Dial Color");
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
            logs.logInfo("clicked on Black");
            test.log(Status.PASS, "clicked on Black");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant clicked on Black");
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
            logs.logInfo("clicked First Product");
            test.log(Status.PASS, "clicked First Product");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant clicked First Product");
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
            logs.logInfo("clicked add to cart");
            test.log(Status.PASS, "clicked add to cart");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("cant clicked add to cart");
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
