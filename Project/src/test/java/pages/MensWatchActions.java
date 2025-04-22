package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MensWatchLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MensWatchActions extends Base{
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;

    public MensWatchActions(ExtentTest test) {
        helper = new WebDriverHelper(driver);
        this.test=test;
        asserts = new Assertion(driver);
    }

    public void clickOnAcceptCookies(){
        try {
            helper.clickOnElement(MensWatchLocators.acceptCookies);
            LoggerHandler.logInfo("clicked cookies");
            test.log(Status.PASS,"clicked cookies");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("cant clicked cookies");
            test.log(Status.FAIL,"cant clicked cookies");
        }
    }

    public void hoverOverBrands() {
        try {
            helper.hoverOverElement(MensWatchLocators.brands);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void clickOnOmega() {
        try {
            helper.clickOnElement(MensWatchLocators.omega);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void verifyOmegaTitle() {
        try {
            asserts.verifyTitleOfPage("omega");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void clickOnMensWatches() {
        try {
            helper.clickOnElement(MensWatchLocators.mensWatches);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void clickOnSeaMaster() {
        try {
            helper.clickOnElement(MensWatchLocators.seaMasterFilter);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void clickOnBlue() {
        try {
            helper.clickOnElement(MensWatchLocators.blueFilter);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void clickOnFirstProduct() {
        try {
            helper.clickOnElement(MensWatchLocators.firstProduct);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void clickOnAddToShoppingBag() {
        try {
            helper.clickOnElement(MensWatchLocators.addToCart);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void verifyKeyword(){
        try {
            asserts.verifyTextInPage(MensWatchLocators.textVerify, "stores");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void takeScreenshot(){
        try {
            Screenshot.takeScreenshot("AddToCart_Screenshot");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
