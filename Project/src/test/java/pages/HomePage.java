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

    public void clickOnCookies(){
        try {
            helper.clickOnElement(HomePageLocators.cookies);
            LoggerHandler.logInfo("Clicked on Cookies");
            test.log(Status.PASS, "Clicked on Cookies");
            Screenshot.takeScreenshot("Cookies");
            Reporter.attachScreenshotToReport("Cookies", test, "Cookies attached");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on Cookies");
            test.log(Status.FAIL,"Not clicked on Cookies");
            Screenshot.takeScreenshot("Cookies");
            Reporter.attachScreenshotToReport("Cookies", test, "Cookies attached");
        }
    }
    public void clickOnRolex(){
        try {
            helper.hoverOverElement(HomePageLocators.rolex);
            LoggerHandler.logInfo("Clicked on Rolex");
            test.log(Status.PASS,"Clicked on Rolex");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on Rolex");
            test.log(Status.FAIL,"Clicked on Rolex");
            Screenshot.takeScreenshot("Clicked on Rolex");
            Reporter.attachScreenshotToReport("Cookies", test, "Clicked on Rolex");
        }
    }
    public void deepSea(){
        try {
            helper.hoverOverElement(HomePageLocators.deepSea);
            helper.clickOnElement(HomePageLocators.deepSea);
            LoggerHandler.logInfo("Clicked on DeepSea");
            test.log(Status.PASS,"Clicked on DeepSea");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on DeepSea");
            test.log(Status.FAIL,"Clicked on DeepSea");
            Screenshot.takeScreenshot("Clicked on DeepSea");
            Reporter.attachScreenshotToReport("Cookies", test, "Clicked on DeepSea");
        }
    }
    public void clickOnRolexWatches(){
        try {
            helper.clickOnElement(HomePageLocators.rolexWatches);
            LoggerHandler.logInfo("Clicked on Rolex Watches");
            test.log(Status.PASS,"Clicked on Rolex Watches");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on Rolex Watches");
            test.log(Status.FAIL,"Clicked on Rolex Watches");
        }
    }

    public void clickOnDiscoverWatches(){
        try {
            String text = ExcelReader.excelReader(System.getProperty("user.dir")+"/testdata/Excel.xlsx",0,1,0);
            asserts.verifyURLOfPage(text);
            helper.clickOnElement(HomePageLocators.discoverWatches);
            LoggerHandler.logInfo("Clicked on Discover Watches");
            test.log(Status.PASS,"Clicked on Discover Watches");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on Discover Watches");
            test.log(Status.FAIL,"Clicked on Discover Watches");
        }
    }

    public void clickWatchMaking(){
        try {
            helper.clickOnElement(HomePageLocators.watchMaking);
            LoggerHandler.logInfo("Clicked on making Watches");
            test.log(Status.PASS,"Clicked on making Watches");
        } catch (Exception e) {
            LoggerHandler.logError("Clicked on making Watches");
            test.log(Status.FAIL,"Clicked on making Watches");
        }
    }
    public void verifyRolex(){
        try {
            String da = ExcelReader.excelReader(System.getProperty("user.dir")+"/testdata/Excel.xlsx",0,0,0);
            asserts.verifyTextInPage(HomePageLocators.rolexText,da);
            Screenshot.takeScreenshot("Rolex Watch");
            LoggerHandler.logInfo("Verified Rolex text");
            test.log(Status.PASS,"Verified Rolex text");
        } catch (Exception e) {
            LoggerHandler.logError("Verified Rolex text");
            test.log(Status.FAIL,"Verified Rolex text");
        }
    }

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
