package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.MensWatchLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class MensWatchActions {

    WebDriver driver;
    WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;

    /*
     * Method Name: MensWatchActions
     * Author Name: Muskan Jha
     * Description : This method is a constructor of class MensWatchActions 
     * which initialises the instance variables of the class
     * Parameters : driver, test
     * Return Type : none
     */
    public MensWatchActions(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        asserts = new Assertion(driver);
    }

    /*
     * Method Name: MensWatchTestCase
     * Author Name: Muskan Jha
     * Description : This method is a cluster method for this class which calls all the method in it.
     * Parameters : N/A
     * Return Type : void
     */
    public void MensWatchTestCase() {

        clickOnAcceptCookies();
        hoverOverBrands();
        clickOnOmega();
        verifyOmegaTitle();
        clickOnMensWatches();
        clickOnSeaMaster();
        clickOnBlue();
        clickOnFirstProduct();
        clickOnAddToShoppingBag();
        verifyKeyword();
        takeScreenshot();
    }

    /*
     * Method Name: clickOnAcceptCookies
     * Author Name: Muskan Jha
     * Description : This method accepts the cookies on the website
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnAcceptCookies() {
        try {
            helper.clickOnElement(MensWatchLocators.acceptCookies);
            LoggerHandler.logInfo("clicked on cookies");
            test.log(Status.PASS, "clicked on cookies");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("clicked on cookies");
            test.log(Status.FAIL, "clicked on cookies");
        }
    }

    /*
     * Method Name: clickOnAcceptCookies
     * Author Name: Muskan Jha
     * Description : This method hovers on Brands on the Navigation Bar on Mayors
     * Homepage
     * Parameters : N/A
     * Return Type : void
     */
    public void hoverOverBrands() {
        try {
            helper.waitForElementToBeVisible(MensWatchLocators.brands, 3);
            helper.hoverOverElement(MensWatchLocators.brands);
            LoggerHandler.logInfo("hovered over brands");
            test.log(Status.PASS, "hovered over brands");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("hovered over brands");
            test.log(Status.FAIL, "hovered over brands");
        }
    }

    /*
     * Method Name: clickOnOmega()
     * Author Name: Muskan Jha
     * Description : This method clicks on Omega
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnOmega() {
        try {
            helper.clickOnElement(MensWatchLocators.omega);
            LoggerHandler.logInfo("clicked on omega");
            test.log(Status.PASS, "clicked on omega");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("clicked on omega");
            test.log(Status.FAIL, "clicked on omega");
        }
    }

    /*
     * Method Name : verifyOmegaTitle
     * Author Name : Muskan Jha
     * Description : This method verifies the title of the Omega Result Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyOmegaTitle() {
        try {
            asserts.verifyTitleOfPage("omega");
            LoggerHandler.logInfo("title verified");
            test.log(Status.PASS, "title verified");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("title verified");
            test.log(Status.FAIL, "title verified");

        }
    }

    /*
     * Method Name : clickOnMensWatches
     * Author Name : Muskan Jha
     * Description : This method clicks on Mens Watches on the result page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnMensWatches() {
        try {
            helper.clickOnElement(MensWatchLocators.mensWatches);
            LoggerHandler.logInfo("clicked on mens watches");
            test.log(Status.PASS, "clicked on mens watches");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("clicked on mens watches");
            test.log(Status.FAIL, "clicked on mens watches");
        }
    }

    /*
     * Method Name : clickOnSeaMaster
     * Author Name : Muskan Jha
     * Description : This method clicks Sea Master in the Brands Collection Filter
     * Category
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnSeaMaster() {
        try {
            helper.clickOnElement(MensWatchLocators.seaMasterFilter);
            LoggerHandler.logInfo("clicked on sea master");
            test.log(Status.PASS, "clicked on sea master");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("clicked on sea master");
            test.log(Status.FAIL, "clicked on mens watches");
        }
    }

    /*
     * Method Name : clickOnBlue
     * Author Name: Muskan Jha
     * Description : This method clicks Blue in the Dial Color Filter Category
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnBlue() {
        try {
            helper.clickOnElement(MensWatchLocators.blueFilter);
            LoggerHandler.logInfo("clicked on blue filter");
            test.log(Status.PASS, "clicked on blue filter");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("clicked on blue filter");
            test.log(Status.FAIL, "clicked on blue filter");
        }
    }

    /*
     * Method Name : clickOnFirstProduct
     * Author Name: Muskan Jha
     * Description : This method clicks on the label
     * of the first product on the result page after applying filters
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnFirstProduct() {
        try {
            helper.clickOnElement(MensWatchLocators.firstProduct);
            LoggerHandler.logInfo("clicked on first product");
            test.log(Status.PASS, "clicked on first product");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("clicked on first product");
            test.log(Status.FAIL, "clicked on first product");
        }
    }

    /*
     * Method Name : clickOnAddToShoppingBag
     * Author Name: Muskan Jha
     * Description : This method clicks on the Add To Shopping Bag on the product
     * result page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnAddToShoppingBag() {
        try {
            helper.clickOnElement(MensWatchLocators.addToCart);
            LoggerHandler.logInfo("clicked on first product");
            test.log(Status.PASS, "clicked on first product");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("clicked on first product");
            test.log(Status.FAIL, "clicked on first product");

        }
    }

    /*
     * Method Name : verifyKeyword
     * Author Name: Muskan Jha
     * Description : This method verifies the Keyword "stores" on Add To Shopping
     * Page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyKeyword() {
        try {
            asserts.verifyTextInPage(MensWatchLocators.textVerify, "stores");
            LoggerHandler.logInfo("stores keyword verified");
            test.log(Status.PASS, "stores keyword verified");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("stores keyword verified");
            test.log(Status.FAIL, "stores keyword verified");
        }
    }

    /*
     * Method Name : takeScreenshot
     * Author Name: Muskan Jha
     * Description : This method captures the screenshot and attach it to the report
     * Parameters : N/A
     * Return Type : void
     */
    public void takeScreenshot() {
        try {
            Screenshot.takeScreenshot("AddToCart_Screenshot");
            Reporter.attachScreenshotToReport("AddToCart.png", test, "");
            LoggerHandler.logInfo("screenshot taken");
            test.log(Status.PASS, "screenshot taken");
        } catch (Exception e) {
            e.getMessage();
            LoggerHandler.logError("screenshot taken");
            test.log(Status.FAIL, "screenshot taken");
        }
    }
}
