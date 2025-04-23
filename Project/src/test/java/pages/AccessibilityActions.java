package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AccessibilityLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class AccessibilityActions {

    WebDriver driver;
    WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;
    LoggerHandler logs;

    /*
     * Method Name : AccessibilityActions
     * Author Name: Muskan Jha
     * Description : This method is a constructor of class AccessibilityActions 
     * Parameters : driver,test,logs
     * Return Type : none
     */
    public AccessibilityActions(WebDriver driver, ExtentTest test, LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        this.logs = logs;
        asserts = new Assertion(driver, logs);
       
    }

    /*
     * Method Name : accessibilityTestCase
     * Author Name: Muskan Jha
     * Description : This method is a cluster method to call all the methods of this class
     * Parameters : N/A
     * Return Type : void
     */
    public void accessibilityTestCase() {
        clickOnAcceptCookies();
        clickOnYourSecurity();
        // verifyTitleYourSecurity();
        // verifyUrlYourSecurity();
        clickOnTermsConditions();
        // verifyTitleTerms();
        // verifyUrlTerms();
        clickOnPrivacyPolicy();
        // verifyTitlePrivacy();
        // verifyUrlPrivacy();
        clickOnCookiePolicy();
        // verifyTitleCookie();
        // verifyUrlCookie();
        clickOnAccessibility();
        // verifyTitleAccessibility();
        // verifyUrlAccessibility();
        clickOnPayByLink();
        // verifyTitlePayByLink();
        // verifyUrlPayByLink();
        clickOnWatches();
        // verifyTitleWatches();
        // verifyUrlWatches();
        clickOnJewellery();
        // verifyTitleJewellery();
        // verifyUrlJewellery();
    }

    /*
     * Method Name : clickOnAcceptCookies
     * Author Name: Muskan Jha
     * Description : This method accepts the cookies on web page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnAcceptCookies() {
        try {
            helper.waitForElementToBeVisible(AccessibilityLocators.acceptCookies, 3);
            helper.clickOnElement(AccessibilityLocators.acceptCookies);
            logs.logInfo("clicked on cookies");
            test.log(Status.INFO, "cookies to be clicked");
            test.log(Status.PASS, "click on cookies performed successfully");
        } catch (Exception e) {
            e.getMessage();
            logs.logError("Did not click on cookies");
            test.log(Status.INFO, "cookies to be clicked");
            test.log(Status.FAIL, "click on cookies failed");
        }
    }

    /*
     * Method Name : clickOnYourSecurity
     * Author Name: Muskan Jha
     * Description : This method clicks on Your Security in footer section of webpage
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnYourSecurity() {
        try {

            helper.javascriptScroll(AccessibilityLocators.yourSecurity);
            helper.waitForElementToBeVisible(AccessibilityLocators.yourSecurity, 3);
            helper.clickOnElement(AccessibilityLocators.yourSecurity);
            driver.navigate().to(Base.prop.getProperty("url"));
            clickOnAcceptCookies();
            logs.logInfo("clicked on Your Security");
            test.log(Status.INFO, "Your Security link to be clicked");
            test.log(Status.PASS, "click on Your Security performed successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("YourSecurityShot");
            Reporter.attachScreenshotToReport("YourSecurityShot.png",test,"");
            logs.logError("Did not click on Your Security");
            test.log(Status.INFO, "Your Security link to be clicked");
            test.log(Status.FAIL, "click on Your Security failed");
        }
    }

    /*
     * Method Name : verifyTitleYourSecurity
     * Author Name: Muskan Jha
     * Description : This method verifies the title of your security page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitleYourSecurity() {
        try {
            asserts.verifyTitleOfPage("Your Security | Mayors");
            logs.logInfo("Title of the page verified");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.PASS, "Title of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify Title Of The Page");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.FAIL, "Did not verify Title of the page");
        }
    }

    /*
     * Method Name : verifyUrlYourSecurity
     * Author Name: Muskan Jha
     * Description : This method verifies the url of your security page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyUrlYourSecurity() {
        try {
            asserts.verifyURLOfPage("https://www.mayors.com/your-security");
            logs.logInfo("URL of the page verified");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.PASS, "URL of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify URL Of The Page");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.FAIL, "Did not verify URL of the page");
        }
    }

    /*
     * Method Name : clickOnTermsConditions
     * Author Name: Muskan Jha
     * Description : This method clicks on Terms and Conditions link in the footer section of the website
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnTermsConditions() {
        try {
            helper.javascriptScroll(AccessibilityLocators.termsConditions);
            helper.waitForElementToBeVisible(AccessibilityLocators.termsConditions, 3);
            helper.clickOnElement(AccessibilityLocators.termsConditions);
            driver.navigate().to(Base.prop.getProperty("url"));
            clickOnAcceptCookies();
            logs.logInfo("clicked on terms and conditions");
            test.log(Status.INFO, "click on terms and conditions to be performed");
            test.log(Status.PASS, "clicked on terms and conditions successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("TermsAndConditionShot");
            Reporter.attachScreenshotToReport("TermsAndConditionShot.png",test,"");
            logs.logError("Did not click terms and conditions");
            test.log(Status.INFO, "click on terms and conditions to be performed");
            test.log(Status.FAIL, "Did not click terms and conditions");
        }
    }

    /*
     * Method Name : verifyTitleTerms
     * Author Name: Muskan Jha
     * Description : This method verifies the title of Terms And Condition
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitleTerms() {
        try {
            asserts.verifyTitleOfPage("Terms & Conditions | Mayors");
            logs.logInfo("Title of the page verified");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.PASS, "Title of the page verified successfully");

        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify Title Of The Page");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.FAIL, "Did not verify Title of the page");
        }
    }

    /*
     * Method Name : verifyUrlTerms
     * Author Name: Muskan Jha
     * Description : This method verifies the url of Terms And Conditions result page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyUrlTerms() {
        try {
            asserts.verifyURLOfPage("https://www.mayors.com/terms-and-conditions");
            logs.logInfo("URL of the page verified");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.PASS, "URL of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify URL Of The Page");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.FAIL, "Did not verify URL of the page");
        }
    }

    /*
     * Method Name : clickOnPrivacyPolicy
     * Author Name: Muskan Jha
     * Description : This method clicks on Privacy Policy in the footer section of website
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnPrivacyPolicy() {
        try {
            helper.javascriptScroll(AccessibilityLocators.privacyPolicy);
            helper.waitForElementToBeVisible(AccessibilityLocators.privacyPolicy, 3);
            helper.clickOnElement(AccessibilityLocators.privacyPolicy);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
            logs.logInfo("clicked on Privacy Policy");
            test.log(Status.INFO, "click on Privacy Policy to be performed");
            test.log(Status.PASS, "clicked on Privacy Policy successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("PrivacyShot");
            Reporter.attachScreenshotToReport("PrivacyShot.png",test,"");
            logs.logError("Did not click Privacy Policy");
            test.log(Status.INFO, "click on Privacy Policy to be performed");
            test.log(Status.FAIL, "Did not click Privacy Policy");
        }
    }

    /*
     * Method Name : verifyTitlePrivacy
     * Author Name: Muskan Jha
     * Description : This method verifies the title of Privacy Policy Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitlePrivacy() {
        try {
            asserts.verifyTitleOfPage("Privacy Policy | Mayors");
            logs.logInfo("Title of the page verified");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.PASS, "Title of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify Title Of The Page");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.FAIL, "Did not verify Title of the page");
        }
    }

    /*
     * Method Name : verifyUrlPrivacy
     * Author Name: Muskan Jha
     * Description : This method verifies the url of Privacy Policy Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyUrlPrivacy() {
        try {
            asserts.verifyURLOfPage("https://www.mayors.com/privacy-policy");
            logs.logInfo("URL of the page verified");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.PASS, "URL of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify URL Of The Page");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.FAIL, "Did not verify URL of the page");
        }
    }

    /*
     * Method Name : clickOnCookiePolicy
     * Author Name: Muskan Jha
     * Description : This method clicks on Cookie Policy in the footer section of website
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnCookiePolicy() {
        try {
            helper.javascriptScroll(AccessibilityLocators.cookiePolicy);
            helper.waitForElementToBeVisible(AccessibilityLocators.cookiePolicy, 3);
            helper.clickOnElement(AccessibilityLocators.cookiePolicy);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
            logs.logInfo("clicked on Cookie Policy");
            test.log(Status.INFO, "click on Cookie Policy to be performed");
            test.log(Status.PASS, "clicked on Cookie Policy successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("CookieShot");
            Reporter.attachScreenshotToReport("CookieShot.png",test,"");
            logs.logError("Did not click Cookie Policy");
            test.log(Status.INFO, "click on Cookie Policy to be performed");
            test.log(Status.FAIL, "Did not click Cookie Policy");
        }
    }

    /*
     * Method Name : verifyTitleCookie
     * Author Name: Muskan Jha
     * Description : This method verifies the title of Cookie Policy Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitleCookie() {
        try {
            asserts.verifyTitleOfPage("Privacy Policy | Mayors");
            logs.logInfo("Title of the page verified");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.PASS, "Title of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify Title Of The Page");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.FAIL, "Did not verify Title of the page");
        }
    }

    /*
     * Method Name : verifyUrlCookie
     * Author Name: Muskan Jha
     * Description : This method verifies the url of Cookie Policy Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyUrlCookie() {
        try {
            asserts.verifyURLOfPage("https://www.mayors.com/privacy-policy#cookies");
            logs.logInfo("URL of the page verified");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.PASS, "URL of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify URL Of The Page");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.FAIL, "Did not verify URL of the page");
        }
    }

    /*
     * Method Name : clickOnAccessibility
     * Author Name: Muskan Jha
     * Description : This method clicks on the Accessibility link in the footer section
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnAccessibility() {
        try {
            helper.javascriptScroll(AccessibilityLocators.accessibility);
            helper.waitForElementToBeVisible(AccessibilityLocators.accessibility, 3);
            helper.clickOnElement(AccessibilityLocators.accessibility);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
            logs.logInfo("clicked on Accessibility link");
            test.log(Status.INFO, "click on Accessibility to be performed");
            test.log(Status.PASS, "clicked onn Pay By Liy successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("AccessibilityShot");
            Reporter.attachScreenshotToReport("AccessibilityShot.png",test,"");
            logs.logError("Did not click Accessibility");
            test.log(Status.INFO, "click on Accessibility to be performed");
            test.log(Status.FAIL, "Did not click Accessibility");
        }
    }

    /*
     * Method Name : verifyTitleAccessibility
     * Author Name: Muskan Jha
     * Description : This method verifies the title of Accessibility Result Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitleAccessibility() {
        try {
            asserts.verifyTitleOfPage("Accessibility | Mayors");
            logs.logInfo("Title of the page verified");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.PASS, "Title of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify Title Of The Page");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.FAIL, "Did not verify Title of the page");
        }
    }

    /*
     * Method Name : verifyUrlAccessibility
     * Author Name: Muskan Jha
     * Description : This method verifies the url of Accessibility Result Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyUrlAccessibility() {
        try {
            asserts.verifyURLOfPage("https://www.mayors.com/accessibility");
            logs.logInfo("URL of the page verified");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.PASS, "URL of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify URL Of The Page");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.FAIL, "Did not verify URL of the page");
        }
    }

    /*
     * Method Name : clickOnPayByLink
     * Author Name: Muskan Jha
     * Description : This method clicks on the PayByLink in footer section
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnPayByLink() {
        try {
            helper.javascriptScroll(AccessibilityLocators.payByLinkTerms);
            helper.waitForElementToBeVisible(AccessibilityLocators.payByLinkTerms, 3);
            helper.clickOnElement(AccessibilityLocators.payByLinkTerms);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
            logs.logInfo("clicked on Pay By Link Terms link");
            test.log(Status.INFO, "click on Pay By Link Terms to be performed");
            test.log(Status.PASS, "clicked on Pay By Link Terms successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("PayByLinkShot");
            Reporter.attachScreenshotToReport("PayByLinkShot.png",test,"");
            logs.logError("Did not click PayByLink Terms");
            test.log(Status.INFO, "click on PayByLink Terms to be performed");
            test.log(Status.FAIL, "Did not click PayByLink Terms");
        }
    }

    /*
     * Method Name : verifyTitlePayByLink
     * Author Name: Muskan Jha
     * Description : This method verifies the PayByLink title 
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitlePayByLink() {
        try {
            asserts.verifyTitleOfPage("PayByLink Terms | Mayors");
            logs.logInfo("Title of the page verified");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.PASS, "Title of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify Title Of The Page");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.FAIL, "Did not verify Title of the page");
        }
    }

    /*
     * Method Name : verifyUrlPayByLink
     * Author Name: Muskan Jha
     * Description : This method verifies the url of PayByLink Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyUrlPayByLink() {
        try {
            asserts.verifyURLOfPage("https://www.mayors.com/paybylink-terms");
            logs.logInfo("URL of the page verified");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.PASS, "URL of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify URL Of The Page");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.FAIL, "Did not verify URL of the page");
        }
    }


    /*
     * Method Name : clickOnWatches
     * Author Name: Muskan Jha
     * Description : This method clicks on watches in footer section
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnWatches() {
        try {
            helper.javascriptScroll(AccessibilityLocators.watches);
            helper.waitForElementToBeVisible(AccessibilityLocators.watches, 3);
            helper.clickOnElement(AccessibilityLocators.watches);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
            logs.logInfo("clicked on Watches link");
            test.log(Status.INFO, "click on Watches to be performed");
            test.log(Status.PASS, "clicked on Watches successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("WatchClickShot");
            Reporter.attachScreenshotToReport("WatchClickShot.png",test,"");
            logs.logError("Did not click Watches");
            test.log(Status.INFO, "click on Watches to be performed");
            test.log(Status.FAIL, "Did not click Watches");
        }
    }

    /*
     * Method Name : verifyTitleWatches
     * Author Name: Muskan Jha
     * Description : This method verifies the title of Watches Result Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitleWatches() {
        try {
            asserts.verifyTitleOfPage("Watches | Mayors");
            logs.logInfo("Title of the page verified");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.PASS, "Title of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify Title Of The Page");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.FAIL, "Did not verify Title of the page");
        }
    }

    /*
     * Method Name : verifyUrlWatches
     * Author Name: Muskan Jha
     * Description : This method verfies the url of Watches Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyUrlWatches() {
        try {
            asserts.verifyURLOfPage("https://www.mayors.com/c/Watches");
            logs.logInfo("URL of the page verified");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.PASS, "URL of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify URL Of The Page");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.FAIL, "Did not verify URL of the page");
        }
    }


    /*
     * Method Name : clickOnJewellery
     * Author Name: Muskan Jha
     * Description : This method clicks on Jewellery link in footer section
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnJewellery() {
        try {
            helper.javascriptScroll(AccessibilityLocators.jewellery);
            helper.waitForElementToBeVisible(AccessibilityLocators.jewellery, 3);
            helper.clickOnElement(AccessibilityLocators.jewellery);
            driver.navigate().to(Base.prop.getProperty("url"));
            // clickOnAcceptCookies();
            logs.logInfo("clicked on Jewellery link");
            test.log(Status.INFO, "click on Jewellery to be performed");
            test.log(Status.PASS, "clicked on Jewellery successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("jewelleryClickShot");
            Reporter.attachScreenshotToReport("jewelleryClickShot.png",test,"");
            logs.logError("Did not click Jewellery");
            test.log(Status.INFO, "click on Jewellery to be performed");
            test.log(Status.FAIL, "Did not click Jewellery");
        }
    }


    /*
     * Method Name : verifyTitleJewellery
     * Author Name: Muskan Jha
     * Description : This method verifies the title of Jewellery Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyTitleJewellery() {
        try {
            asserts.verifyTitleOfPage("Jewelry | Mayors");
            logs.logInfo("Title of the page verified");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.PASS, "Title of the page verified successfully");

        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify Title Of The Page");
            test.log(Status.INFO, "Title of the page to be verified");
            test.log(Status.FAIL, "Did not verify Title of the page");
        }
    }



    /*
     * Method Name : verifyUrlJewellery
     * Author Name: Muskan Jha
     * Description : This method verifies the url of Jewellery result page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyUrlJewellery() {
        try {
            asserts.verifyURLOfPage("https://www.mayors.com/c/Jewelry");
            logs.logInfo("URL of the page verified");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.PASS, "URL of the page verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            logs.logError("Did not verify URL Of The Page");
            test.log(Status.INFO, "URL of the page to be verified");
            test.log(Status.FAIL, "Did not verify URL of the page");
        }
    }



    /*
     * Method Name : verifyKeyword
     * Author Name: Muskan Jha
     * Description : This method verifies the "category" keyword on Jewellery result page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyKeyword() {
        try {
            asserts.verifyTextInPage(AccessibilityLocators.categoryKeyword, "Category");
            logs.logInfo("category Keyword verified");
            test.log(Status.INFO, "category Keyword to be verified");
            test.log(Status.PASS, "category Keyword verified successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("keywordShot");
            Reporter.attachScreenshotToReport("keywordShot.png",test,"");
            logs.logError("Did not verify keyword");
            test.log(Status.INFO, "keyword to be verified");
            test.log(Status.FAIL, "Did not verify keyword");
        }
    }


    
     /* Method Name : takeScreenshotResult
     * Author Name: Muskan Jha
     * Description : This method captures the screenshot of the Jewellery result page
     * result page
     * Parameters : N/A
     * Return Type : void
     */
    public void takeScreenshotResult() {
        try {
            Screenshot.takeScreenshot("AccessibilityShot");
            Reporter.attachScreenshotToReport("AccessibilityShot.png", test, "");
            logs.logInfo("Screenshot captured");
            test.log(Status.INFO, "Screenshot to be captured");
            test.log(Status.PASS, "Screenshot captured successfully");
        } catch (Exception e) {
            e.getStackTrace();
            Screenshot.takeScreenshot("AccessibilityfailedShot");
            Reporter.attachScreenshotToReport("AccessibilityfailedShot.png", test, "");
            logs.logError("Screenshot captured");
            test.log(Status.INFO, "Screenshot to be captured");
            test.log(Status.FAIL, "Did not capture Screenshot");
        }
    }
}
