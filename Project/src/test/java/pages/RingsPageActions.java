package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import uistore.RingsPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.Assertion;

public class RingsPageActions extends Base{
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    LoggerHandler logs;
    public RingsPageActions(ExtentTest test,LoggerHandler logs) {
        helper = new WebDriverHelper(driver);
        this.test=test;
        asserts = new Assertion(driver,logs);
        this.logs=logs;
    }
    /*a.Method name:clickOnSearch
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on Search
    *Return Type:void
    */
    public void clickOnSearch(){
        try{

        helper.waitForElementToBeVisible(RingsPageLocators.searchbar, 3);
        helper.clickOnElement(RingsPageLocators.searchbar);
        logs.logInfo("Clicked on search");
        test.log(Status.PASS,"Clicked on searchbar");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on search");
            test.log(Status.FAIL, "Clicked on search");
    
        }
    }
    /*a.Method name:inputOnSearchBar
    *b.Author:Krishna Reddy
    *Description:This Method is for giving input in searchbar
    *Return Type:void
    */
    public void inputOnSearchBar(){
        try{
        String text = helper.excelReading(0, 2, 0);
        helper.enterText(RingsPageLocators.searchbar, text);
        logs.logInfo("Clicked on searchbar");
        helper.enterText(RingsPageLocators.searchbar, "Rings");
        logs.logInfo("Clicked on searchbar");
        test.log(Status.PASS,"Clicked on searchbar");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on searchbar");
            test.log(Status.FAIL, "Clicked on searchbar");
    
        }
    }
    /*a.Method name:enterOnSearchbar
    *b.Author:Krishna Reddy
    *Description:This Method is for enter on searchbar
    *Return Type:void
    */
    public void enterOnSearchbar(){
        try{
        helper.enterAction(RingsPageLocators.searchbar);
        logs.logInfo("Entered on search");
        test.log(Status.PASS,"Entered on search"); 
        }
        catch(Exception e){
            LoggerHandler.logError("Entered on search");
            test.log(Status.FAIL, "Entered on search");
    
        }
    }
    /*a.Method name:clickOnBrand
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on Brand
    *Return Type:void
    */
    
    public void clickOnBrand(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.brand, 3);
        helper.clickOnElement(RingsPageLocators.brand);
        logs.logInfo("Clicked on brand");
        test.log(Status.PASS,"Clicked on brand"); 
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on brand");
            test.log(Status.FAIL, "Clicked on brand");
    
        }
    }
    /*a.Method name:clickOnCarlex
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on Carlex
    *Return Type:void
    */
    
    public void clickOnCarlex(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.carlex, 3);
        helper.clickOnElement(RingsPageLocators.carlex);
        logs.logInfo("Clicked on carlex");
        test.log(Status.PASS,"Clicked on carlex"); 
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on carlex");
            test.log(Status.FAIL, "Clicked on carlex");
    
        }
    }
     /*a.Method name:clickOnRings
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on Rings
    *Return Type:void
    */
    public void clickOnRings(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.rings, 3);
        helper.clickOnElement(RingsPageLocators.rings);
        logs.logInfo("Clicked on rings");
        test.log(Status.PASS,"Clicked on rings");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on Rings");
            test.log(Status.FAIL, "Clicked on Rings");
    
        }
    }
    /*a.Method name:clickOnForHer
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on Forher
    *Return Type:void
    */
    public void clickOnForher(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.forher, 3);
        helper.clickOnElement(RingsPageLocators.forher);
        logs.logInfo("Clicked on forher");
        test.log(Status.PASS,"Clicked on forher");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on forher");
            test.log(Status.FAIL, "Clicked on forher");
    
        }
    }
    /*a.Method name:clickOnFirst
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on First
    *Return Type:void
    */
    public void clickOnFirst(){
        try{

        helper.clickOnElement(RingsPageLocators.first);
        logs.logInfo("Clicked on first");
        test.log(Status.PASS,"Clicked on first");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on first");
            test.log(Status.FAIL, "Clicked on first");
    
        }
    }
    /*a.Method name:clickOnLive
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on Live
    *Return Type:void
    */
    public void clickOnLive(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.live, 3);
        helper.clickOnElement(RingsPageLocators.live);
        logs.logInfo("Clicked on live");
        test.log(Status.PASS,"Clicked on live");
        Screenshot.takeScreenshot("src1");
        Reporter.attachScreenshotToReport("src1.png", test, "");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on live");
            test.log(Status.FAIL, "Clicked on live");
    
        }
    }
    /*a.Method name:clickOnAccept
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on Accept cookies
    *Return Type:void
    */
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        logs.logInfo("Clicked on accept cookies");
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on accept cookies");
            test.log(Status.FAIL, "Clicked on accept cookies");
    
        }
    }
    /*a.Method name:clickOnClose
    *b.Author:Krishna Reddy
    *Description:This Method is for clicking on Close
    *Return Type:void
    */
    public void clickOnClose(){
        try{
        helper.clickOnElement(RingsPageLocators.close);
        LoggerHandler.logInfo("Clicked on close");
        test.log(Status.PASS,"Clicked on close");
        logs.logInfo("Clicked on searc");
        test.log(Status.PASS,"Clicked on searc");
        }
        catch(Exception e){
            LoggerHandler.logError("Clicked on close");
            test.log(Status.FAIL, "Clicked on close");
    
        }
    }
    /*a.Method name:verifyRings
    *b.Author:Krishna Reddy
    *Description:This Method is for Verifying the rings
    *Return Type:void
    */
    public void verifyRings(){
        try{
        asserts.verifyTitleOfPage("Rings");
        }
        catch(Exception e){
            LoggerHandler.logError("Verify Rings");
            test.log(Status.FAIL, "Verify Rings");
    
        }
        
    }
    public void ringsExecute(){
        clickOnAccept();
        clickOnSearch();
        inputOnSearchBar();
        enterOnSearchbar();
        clickOnClose();
        clickOnRings();
        clickOnForher();
        clickOnForher();
        clickOnBrand();
        clickOnCarlex();
        clickOnFirst();
        clickOnLive();
        verifyRings();
    }
    
    
    

}