package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SearchLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SearchActions {

    WebDriver driver;
    WebDriverHelper helper;
    Assertion assertion;
    ExtentTest test;
    LoggerHandler logs;
    public SearchActions(WebDriver driver, ExtentTest test,LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        assertion = new Assertion(driver,logs);
        this.logs=logs;
    }

    public void clickOnAccept() {
        try {
            helper.clickOnElement(SearchLocators.acceptAndCookies);
            logs.logInfo("Clicked On Accept and Cookies");
            test.log(Status.PASS, "Clicked On Accept and Cookies");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On Accept and Cookies");
            test.log(Status.FAIL, "Clicked On Accept and Cookies");
        }
    }

    public void searchOperation() {
        try {
            helper.clickOnElement(SearchLocators.searchBar);
            helper.typeInElement(SearchLocators.searchBar, "Earrings");
            helper.enterAction(SearchLocators.searchBar);
            logs.logInfo("Searched For Earings");
            test.log(Status.PASS, "Searched For Earings");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Searched For Earings");
            test.log(Status.FAIL, "Searched For Earings");
        }
    }

    public void verifyEarrings() {
        try {
            assertion.verifyTextInPage(SearchLocators.earRings, "Earrings");
            logs.logInfo("Verified the text Earings");
            test.log(Status.PASS, "Verified the text Earings");
        } catch (Exception e) {
            e.printStackTrace();
            logs.logError("Verified the text Earings");
            test.log(Status.FAIL, "Verified the text Earings");

        }

    }

    public void clickOnDismiss() {
        try {
            helper.clickOnElement(SearchLocators.dismiss);
            logs.logInfo("Clicked On Dismiss");
            test.log(Status.PASS, "Clicked On Dismiss");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On Dismiss");
            test.log(Status.FAIL, "Clicked On Dismiss");

        }
    }

    public void clickOnBrand() {
        try {
            helper.clickOnElement(SearchLocators.brand);
            logs.logInfo("Clicked On Brand");
            test.log(Status.PASS, "Clicked On Brand");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On Brand");
            test.log(Status.FAIL, "Clicked On Brand");
        }
    }

    public void clickOnGucci() {
        try {
            // helper.javascriptScroll(SearchLocators.gucci);
            helper.clickOnElement(SearchLocators.gucci);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            logs.logInfo("Clicked On Gucci");
            test.log(Status.PASS, "Clicked On Gucci");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On Gucci");
            test.log(Status.FAIL, "Clicked On Gucci");
        }
    }

    public void clickOnMetalType() {
        try {
            helper.javascriptScroll(SearchLocators.metalType);
            helper.hoverOverElement(SearchLocators.metalType);
            

            helper.clickOnElement(SearchLocators.metalType);
           
            helper.clickOnElement(SearchLocators.roseGold);
           // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            logs.logInfo("Clicked On RoseGold");
            test.log(Status.PASS, "Clicked On RoseGold");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On RoseGold");
            test.log(Status.FAIL, "Clicked On RoseGold");
        }
    }

    public void clickOnEarRingsStyle() {
        try {
            helper.clickOnElement(SearchLocators.earRingStyle);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            helper.clickOnElement(SearchLocators.dropEarring);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            logs.logInfo("Clicked On DropEarring");
            test.log(Status.PASS, "Clicked On DropEarring");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On DropEarring");
            test.log(Status.FAIL, "Clicked On DropEarring");
        }

    }

    public void clickOnfirstProduct() {
        try {
            helper.clickOnElement(SearchLocators.firstProduct);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            logs.logInfo("Clicked On FirstProduct");
            test.log(Status.PASS, "Clicked On FirstProduct");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On FirstProduct");
            test.log(Status.FAIL, "Clicked On FirstProduct");

        }
    }

    public void clickOnGet() {
        try {
            helper.clickOnElement(SearchLocators.getLiveExpert);
            logs.logInfo("Clicked On getLiveExpert");
            test.log(Status.PASS, "Clicked On getLiveExpert");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On getLiveExpert");
            test.log(Status.FAIL, "Clicked On getLiveExpert");
        }

    }

    public void getScreenshot() {
        try {
            Screenshot.takeScreenshot("Earrings");
            logs.logInfo("Captured Screenshot for Earrings");
            test.log(Status.PASS, "Captured Screenshot for Earrings");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Captured Screenshot for Earrings");
            test.log(Status.FAIL, "Captured Screenshot for Earrings");
        }
    }

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
