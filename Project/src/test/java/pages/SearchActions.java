package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SearchLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SearchActions {

    WebDriver driver;
    WebDriverHelper helper;
    Assertion assertion;
    ExtentTest test;

    // public void verifyLogo() {

    // }
    /*Author: Kotha Sai Ragunath
     * Method Name: SearchActions
     * Description: This is a constructor that initializes the driver, helper, test and assertion objects.
     * Parameters: WebDriver driver, ExtentTest test
     * Return Type:NA
    */
    public SearchActions(WebDriver driver, ExtentTest test,LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        assertion = new Assertion(driver,logs);
        this.logs=logs;
    }
     /*Author: Kotha Sai Ragunath
     * Method Name: clickOnAccept
     * Description: This method is used to click On Accept and Cookies.
     * Parameters: WebDriver driver, ExtentTest test
     * Return Type:NA
    */

    public void clickOnAccept() {
        try {
            helper.clickOnElement(SearchLocators.acceptAndCookies);
            test.log(Status.INFO, "Clicked On Accept and Cookies");
            LoggerHandler.logInfo("Clicked On Accept and Cookies");
            test.log(Status.PASS, "Clicked On Accept and Cookies");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On Accept and Cookies");
            test.log(Status.FAIL, "Clicked On Accept and Cookies");
            Reporter.attachScreenshotToReport("Clicked cookies",test,"Accept and Cookies");
        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: searchOperation
     * Description: This method is for performing a search operation using the
       search bar.
     * Parameters: None
     * Return Type: void
     */

    public void searchOperation() {
        try {
            helper.clickOnElement(SearchLocators.searchBar);
            helper.typeInElement(SearchLocators.searchBar, "Earrings");
            helper.enterAction(SearchLocators.searchBar);
            test.log(Status.INFO, "Searched For Earings");
            LoggerHandler.logInfo("Searched For Earings");
            test.log(Status.PASS, "Searched For Earings");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Searched For Earings");
            test.log(Status.FAIL, "Searched For Earings");
            Reporter.attachScreenshotToReport("EARRINGS",test,"Searched For Earings");
        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: verifyEarrings
     * Description: This method is for verifying the text "Earrings" on the page.
     * Parameters: None
     * Return Type: void
     */

    public void verifyEarrings() {
        try {
            assertion.verifyTextInPage(SearchLocators.earRings, "Earrings");
            test.log(Status.INFO, "Verified the text Earings");
            LoggerHandler.logInfo("Verified the text Earings");
            test.log(Status.PASS, "Verified the text Earings");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("Verified the text Earings");
            test.log(Status.FAIL, "Verified the text Earings");
            Reporter.attachScreenshotToReport("VERIFYEARRINGS",test,"Verified the text Earings");

        }

    }
        /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnDismiss
     * Description: This method is for clicking the "Dismiss" button.
     * Parameters: None
     * Return Type: void
     */

    public void clickOnDismiss() {
        try {
            helper.clickOnElement(SearchLocators.dismiss);
            logs.logInfo("Clicked On Dismiss");
            test.log(Status.PASS, "Clicked On Dismiss");
        } catch (Exception e) {
            test.log(Status.INFO, "Clicked On Dismiss");
            LoggerHandler.logError("Clicked On Dismiss");
            System.out.println(e.getMessage());
            logs.logError("Clicked On Dismiss");
            test.log(Status.FAIL, "Clicked On Dismiss");
            Reporter.attachScreenshotToReport("Dismiss",test,"Clicked On Dismiss");
            

        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnBrand
     * Description: This method is for clicking the "Brand" button.
     * Parameters: None
     * Return Type: void
     */

    public void clickOnBrand() {
        try {
            helper.clickOnElement(SearchLocators.brand);
            test.log(Status.INFO, "Clicked On Brand");
            LoggerHandler.logInfo("Clicked On Brand");
            test.log(Status.PASS, "Clicked On Brand");

        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On Brand");
            test.log(Status.FAIL, "Clicked On Brand");
            Reporter.attachScreenshotToReport("Brand",test,"Clicked On Brand");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnGucci
     * Description: This method is for clicking the "Gucci" element and setting a
     * page load timeout.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnGucci() {
        try {
            helper.clickOnElement(SearchLocators.gucci);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            test.log(Status.INFO, "Clicked On Gucci");
            LoggerHandler.logInfo("Clicked On Gucci");
            test.log(Status.PASS, "Clicked On Gucci");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On Gucci");
            test.log(Status.FAIL, "Clicked On Gucci");
            Reporter.attachScreenshotToReport("Gucci",test,"Failed to click On Gucci");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnMetalType
     * Description: This method is for selecting the "Rose Gold" option under the
     * metal type category.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnMetalType() {
        try {
            helper.javascriptScroll(SearchLocators.metalType);
            helper.hoverOverElement(SearchLocators.metalType);
            helper.clickOnElement(SearchLocators.metalType);
           
            helper.clickOnElement(SearchLocators.roseGold);
            test.log(Status.INFO, "Clicked On RoseGold");
            LoggerHandler.logInfo("Clicked On RoseGold");
            test.log(Status.PASS, "Clicked On RoseGold");

        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On RoseGold");
            test.log(Status.FAIL, "Clicked On RoseGold");
            Reporter.attachScreenshotToReport("RoseGold",test,"Failed to click On RoseGold");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnEarRingsStyle
     * Description: This method is for selecting the "Drop Earring" style from the
     * earrings category.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnEarRingsStyle() {
        try {
            helper.hoverOverElement(SearchLocators.earRingStyle);
            helper.clickOnElement(SearchLocators.earRingStyle);
            
            helper.clickOnElement(SearchLocators.dropEarring);
            helper.clickOnElement(SearchLocators.dropEarring);
            test.log(Status.INFO, "Clicked On DropEarring");
            LoggerHandler.logInfo("Clicked On DropEarring");
            test.log(Status.PASS, "Clicked On DropEarring");

        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On DropEarring");
            test.log(Status.FAIL, "Clicked On DropEarring");
            Reporter.attachScreenshotToReport("Earring",test,"Failed to click On DropEarring");
        }

    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnfirstProduct
     * Description: This method is for clicking on the first product displayed on
     * the page.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnfirstProduct() {
        try {
            helper.clickOnElement(SearchLocators.firstProduct);
           test.log(Status.INFO, "Clicked On FirstProduct");
            LoggerHandler.logInfo("Clicked On FirstProduct");
            test.log(Status.PASS, "Clicked On FirstProduct");

        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On FirstProduct");
            test.log(Status.FAIL, "Clicked On FirstProduct");
            Reporter.attachScreenshotToReport("First_Product",test,"Failed to click On the Product");

        }
    }
    /*
     * Author: Kotha Sai Ragunath
     * Method Name: clickOnGet
     * Description: This method is for clicking the "getLiveExpert" button.
     * Parameters: None
     * Return Type: void
     */


    public void clickOnGet() {
        try {
            helper.clickOnElement(SearchLocators.getLiveExpert);
            test.log(Status.INFO, "Clicked On getLiveExpert");
            LoggerHandler.logInfo("Clicked On getLiveExpert");
            test.log(Status.PASS, "Clicked On getLiveExpert");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On getLiveExpert");
            test.log(Status.FAIL, "Clicked On getLiveExpert");
            Reporter.attachScreenshotToReport("getLiveExpert",test,"Failed to click On getLiveExpert");
        }

    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: getScreenshot
     * Description: This method is for capturing a screenshot labeled "Earrings."
     * Parameters: None
     * Return Type: void
     */


    public void getScreenshot() {
        try {
            Screenshot.takeScreenshot("Earrings");
            test.log(Status.INFO, "Captured Screenshot for Earrings");
            LoggerHandler.logInfo("Captured Screenshot for Earrings");
            test.log(Status.PASS, "Captured Screenshot for Earrings");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Captured Screenshot for Earrings");
            test.log(Status.FAIL, "Captured Screenshot for Earrings");
            Reporter.attachScreenshotToReport("EarringsScreenshot",test,"Failed to capture Earrings Screenshot");
        }
    }

    /*
     * Author: Kotha Sai Ragunath
     * Method Name: search
     * Description: This method performs a sequence of actions for navigating
     * through various search functionalities, including element clicks, selections,
     * and capturing a final screenshot.
     * Parameters: None
     * Return Type: void
     */

    public void search() {
        clickOnAccept();
        searchOperation();
        clickOnDismiss();
        clickOnBrand();
        clickOnGucci();
        clickOnMetalType();
        clickOnEarRingsStyle();
        clickOnfirstProduct();
        clickOnGet();
        getScreenshot();

    }
}
