package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AccessibilityLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class AccessibilityActions {


    WebDriver  driver;
    WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;


    public AccessibilityActions(WebDriver driver, ExtentTest test){
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        asserts = new Assertion(driver);
    }


    public void accessibilityTestCase(){
        clickOnYourSecurity();
        clickOnTermsConditions();
        clickOnPrivacyPolicy();
        clickOnCookiePolicy();
        clickOnAccessibility();
        clickOnPayByLink();
        clickOnWatches();
        clickOnJewellery();
    }


    public void clickOnAcceptCookies() {
        try {
            helper.waitForElementToBeVisible(AccessibilityLocators.acceptCookies,3);
            helper.clickOnElement(AccessibilityLocators.acceptCookies);
            LoggerHandler.logInfo("clicked on cookies");
            test.log(Status.PASS, "clicked on cookies");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("clicked on cookies");
            test.log(Status.FAIL, "clicked on cookies");
        }
    }


    public void clickOnYourSecurity(){
        try {

            helper.javascriptScroll(AccessibilityLocators.yourSecurity);
            helper.waitForElementToBeVisible(AccessibilityLocators.yourSecurity,3);
            helper.clickOnElement(AccessibilityLocators.yourSecurity);
            driver.navigate().to(Base.prop.getProperty("url"));
            clickOnAcceptCookies();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void clickOnTermsConditions(){
        try {
            helper.javascriptScroll(AccessibilityLocators.termsConditions);
            helper.waitForElementToBeVisible(AccessibilityLocators.termsConditions, 3);
            helper.clickOnElement(AccessibilityLocators.termsConditions);
            driver.navigate().to(Base.prop.getProperty("url"));
            clickOnAcceptCookies();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void clickOnPrivacyPolicy(){
        try {
            helper.javascriptScroll(AccessibilityLocators.privacyPolicy);
            helper.waitForElementToBeVisible(AccessibilityLocators.privacyPolicy,3);
            helper.clickOnElement(AccessibilityLocators.privacyPolicy);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void clickOnCookiePolicy(){
        try {
            helper.javascriptScroll(AccessibilityLocators.cookiePolicy);
            helper.waitForElementToBeVisible(AccessibilityLocators.cookiePolicy,3);
            helper.clickOnElement(AccessibilityLocators.cookiePolicy);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void clickOnAccessibility(){
        try {
            helper.javascriptScroll(AccessibilityLocators.accessibility);
            helper.waitForElementToBeVisible(AccessibilityLocators.accessibility, 3);
            helper.clickOnElement(AccessibilityLocators.accessibility);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    public void clickOnPayByLink(){
        try {
            helper.javascriptScroll(AccessibilityLocators.payByLinkTerms);
            helper.waitForElementToBeVisible(AccessibilityLocators.payByLinkTerms, 3);
            helper.clickOnElement(AccessibilityLocators.payByLinkTerms);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    public void clickOnWatches(){
        try {
            helper.javascriptScroll(AccessibilityLocators.watches);
            helper.waitForElementToBeVisible(AccessibilityLocators.watches, 3);
            helper.clickOnElement(AccessibilityLocators.watches);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    public void clickOnJewellery(){
        try {
            helper.javascriptScroll(AccessibilityLocators.jewellery);
            helper.waitForElementToBeVisible(AccessibilityLocators.jewellery,3);
            helper.clickOnElement(AccessibilityLocators.jewellery);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
