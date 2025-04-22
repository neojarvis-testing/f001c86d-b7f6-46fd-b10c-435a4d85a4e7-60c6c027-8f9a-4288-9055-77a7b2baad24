package pages;

import uistore.HomePageLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.Assertion;
import utils.ExcelReader;
import utils.LoggerHandler;

public class HomePage extends Base{
    public WebDriverHelper helper;
    public HomePage(){
        helper = new WebDriverHelper(Base.driver);
    }

    public void clickOnCookies(){
        try {
            helper.clickOnElement(HomePageLocators.cookies);
            LoggerHandler.logInfo("Clicked on Cookies");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.logError("Clicked on Cookies");
        }
    }
    public void clickOnRolex(){
        try {
            helper.hoverOverElement(HomePageLocators.rolex);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void deepSea(){
        try {
            helper.hoverOverElement(HomePageLocators.deepSea);
            helper.clickOnElement(HomePageLocators.deepSea);
            Assertion.verifyTitleOfPage("Deepsea");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void clickOnRolexWatches(){
        try {
            helper.clickOnElement(HomePageLocators.rolexWatches);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickOnDiscoverWatches(){
        try {
            helper.clickOnElement(HomePageLocators.discoverWatches);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickWatchMaking(){
        try {
            helper.clickOnElement(HomePageLocators.watchMaking);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void verifyRolex(){
        try {
            String da = ExcelReader.excelReader(System.getProperty("user.dir")+"/testdata/Excel.xlsx",0,0,0);
            Assertion.verifyTextInPage(HomePageLocators.rolexText,da);
            // Screenshot.takeScreenshot("Rolex Watch");
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
