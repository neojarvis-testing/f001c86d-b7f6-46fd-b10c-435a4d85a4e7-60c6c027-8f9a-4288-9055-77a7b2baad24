package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.Assertion;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;

public class HomePage extends Base{
    public WebDriverHelper helper;
    ExtentTest test;
    Assertion asserts;

    public HomePage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test = test;
        asserts = new Assertion(driver);
    }
    /*
     * Method Name : clickOnCookies
     * Author Name : Praneeth
     * Description : This method clicks on cookies on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnCookies(){
        try {
            helper.clickOnElement(HomePageLocators.cookies);
            LoggerHandler.logInfo("Clicked on Cookies");
            test.log(Status.INFO,"Click on cookies");
            test.log(Status.PASS, "Cookies clicked");
            Screenshot.takeScreenshot("mayors");
            Reporter.attachScreenshotToReport("mayors", test, "mayors");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on Cookies");
            test.log(Status.FAIL,"Not clicked on Cookies");
            Screenshot.takeScreenshot("Cookies");
            Reporter.attachScreenshotToReport("Brands", test, "Cookies attached");
        }
    }
    /*
     * Method Name : clickOnRolex
     * Author Name : Praneeth
     * Description : This method hovers on rolex on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnRolex(){
        try {
            helper.hoverOverElement(HomePageLocators.rolex);
            LoggerHandler.logInfo("Clicked on Rolex");
            test.log(Status.INFO,"Click on Rolex");
            test.log(Status.PASS,"Clicked on Rolex");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on Rolex");
            test.log(Status.FAIL,"Clicked on Rolex");
            Screenshot.takeScreenshot("Clicked on Rolex");
            Reporter.attachScreenshotToReport("Brands", test, "Clicked on Rolex");
        }
    }
    /*
     * Method Name : clickOnCookies
     * Author Name : Praneeth
     * Description : This method clicks on deepsea on the home page
     * Parameters : N/A
     * Return Type : void
     */
    public void deepSea(){
        try {
            helper.hoverOverElement(HomePageLocators.deepSea);
            helper.clickOnElement(HomePageLocators.deepSea);
            LoggerHandler.logInfo("Clicked on DeepSea");
            test.log(Status.INFO,"Click on DeepSea");
            test.log(Status.PASS,"Clicked on DeepSea");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on DeepSea");
            test.log(Status.FAIL,"Clicked on DeepSea");
            Screenshot.takeScreenshot("Clicked on DeepSea");
            Reporter.attachScreenshotToReport("Brands", test, "Clicked on DeepSea");
        }
    }
    /*
     * Method Name : clickOnRolexWatches
     * Author Name : Praneeth
     * Description : This method clicks on rolex watches
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnRolexWatches(){
        try {
            helper.clickOnElement(HomePageLocators.rolexWatches);
            LoggerHandler.logInfo("Clicked on Rolex Watches");
            test.log(Status.INFO,"Click on Rolex watches");
            test.log(Status.PASS,"Clicked on Rolex Watches");
            LoggerHandler.logInfo("scroll down to footer");
            test.log(Status.PASS,"navigate back to home page");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on Rolex Watches");
            test.log(Status.FAIL,"Clicked on Rolex Watches");
            Screenshot.takeScreenshot("Cookies");
            Reporter.attachScreenshotToReport("Brands", test, "Cookies attached");
        }
    }
    /*
     * Method Name : clickOnDiscoverWatches
     * Author Name : Praneeth
     * Description : This method clicks on discover watches
     * Parameters : N/A
     * Return Type : void
     */
    public void clickOnDiscoverWatches(){
        try {
            String text = ExcelReader.excelReader(System.getProperty("user.dir")+"/testdata/Excel.xlsx",0,1,0);
            asserts.verifyURLOfPage(text);
            helper.clickOnElement(HomePageLocators.discoverWatches);
            LoggerHandler.logInfo("Clicked on Discover Watches");
            test.log(Status.INFO,"Click on discover watches");
            test.log(Status.PASS,"Clicked on Discover Watches");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on Discover Watches");
            test.log(Status.FAIL,"Clicked on Discover Watches");
            Screenshot.takeScreenshot("Discover watches");
            Reporter.attachScreenshotToReport("Brands", test, "Discover watches");
        }
    }
    /*
     * Method Name : clickWatchMaking
     * Author Name : Praneeth
     * Description : This method clicks on watch making
     * Parameters : N/A
     * Return Type : void
     */
    public void clickWatchMaking(){
        try {
            helper.clickOnElement(HomePageLocators.watchMaking);
            LoggerHandler.logInfo("Clicked on making Watches");
            test.log(Status.INFO,"Click on making watches");
            test.log(Status.PASS,"Clicked on making Watches");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on making Watches");
            test.log(Status.FAIL,"Clicked on making Watches");
            Screenshot.takeScreenshot("makingWatches");
            Reporter.attachScreenshotToReport("Brands", test, "makingWatches");
        }
    }
    /*
     * Method Name : verifyRolex
     * Author Name : Praneeth
     * Description : This method is used to verify the text role on the result page
     * Parameters : N/A
     * Return Type : void
     */
    public void verifyRolex(){
        try {
            String da = ExcelReader.excelReader(System.getProperty("user.dir")+"/testdata/Excel.xlsx",0,0,0);
            asserts.verifyTextInPage(HomePageLocators.rolexText,da);
            Screenshot.takeScreenshot("Rolex Watch");
            LoggerHandler.logInfo("Verified Rolex text");
            test.log(Status.INFO,"Verify Rolex text");
            test.log(Status.PASS,"Verified Rolex text");
        } catch (Exception e) {
            LoggerHandler.logError("Verified Rolex text");
            test.log(Status.FAIL,"Verified Rolex text");
            Screenshot.takeScreenshot("Rolex text");
            Reporter.attachScreenshotToReport("Brands", test, "Rolex Text");
        }
    }
    /*
     * Method Name : rolex
     * Author Name : Praneeth
     * Description : This method is cluster method of all the above actions
     * Parameters : N/A
     * Return Type : void
     */
    public void rolex(){
        clickOnCookies();
        clickOnRolex();
        deepSea();
        clickOnRolexWatches();
        clickOnDiscoverWatches();
        clickWatchMaking();
        verifyRolex();
    }

}
