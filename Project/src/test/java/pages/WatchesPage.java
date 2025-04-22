package pages;

import uistore.WatchesLocators;
import utils.Assertion;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class WatchesPage {
    public WebDriverHelper helper;
    public WatchesPage(){
        helper=new WebDriverHelper(Base.driver);
    }

    public void acceptOnCookies(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.acceptOnCookies,5);
            helper.clickOnElement(WatchesLocators.acceptOnCookies);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverOnWatches(){
        try {
            acceptOnCookies();
            helper.waitForElementToBeVisible(WatchesLocators.hoverOnWatches,5);
            helper.hoverOverElement(WatchesLocators.hoverOnWatches);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickOnBestSellers(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnBestSellers,5);
            helper.clickOnElement(WatchesLocators.clickOnBestSellers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public void verifyContains(){
    //     Assertion assertion = new Assertion(Base.driver);
    //     assertion.verifyTitleOfPage("Best Sellers");
    // }

    public void clickOnCross(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnCross,5);
            helper.clickOnElement(WatchesLocators.clickOnCross);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickOnForHim(){
        try {
            try {
                clickOnCross();
            } catch (Exception e) {
            }
            helper.waitForElementToBeVisible(WatchesLocators.clickOnForHim,5);
            helper.clickOnElement(WatchesLocators.clickOnForHim);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnCartier(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnCartier,5);
            helper.clickOnElement(WatchesLocators.clickOnCartier);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnDialColor(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnDialColor,5);
            helper.clickOnElement(WatchesLocators.clickOnDialColor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnBlack(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnBlack,5);
            helper.clickOnElement(WatchesLocators.clickOnBlack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnFirstProduct,5);
            helper.clickOnElement(WatchesLocators.clickOnFirstProduct);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnAdd(){
        try {
            helper.waitForElementToBeVisible(WatchesLocators.clickOnAdd,5);
            helper.clickOnElement(WatchesLocators.clickOnAdd);
            Screenshot.takeScreenshot("Add To Shopping Bag");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testcase1(){
        hoverOnWatches();
        clickOnBestSellers();
       // verifyContains();
        clickOnForHim();
        clickOnCartier();
        clickOnDialColor();
        clickOnBlack();
        clickOnFirstProduct();
        clickOnAdd();

    }

    






    
}
