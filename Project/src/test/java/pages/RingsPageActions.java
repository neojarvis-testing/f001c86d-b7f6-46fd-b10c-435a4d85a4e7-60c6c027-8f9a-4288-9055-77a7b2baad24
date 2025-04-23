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
    public void clickOnSearch(){
        try{

        helper.waitForElementToBeVisible(RingsPageLocators.searchbar, 3);
        helper.clickOnElement(RingsPageLocators.searchbar);
        logs.logInfo("Clicked on search");
        test.log(Status.PASS,"Clicked on searchbar");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void inputOnSearchBar(){
        try{
        
        helper.enterText(RingsPageLocators.searchbar, "Rings");
        logs.logInfo("Clicked on searchbar");
        test.log(Status.PASS,"Clicked on searchbar");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void enterOnSearchbar(){
        try{
        helper.enterAction(RingsPageLocators.searchbar);
        logs.logInfo("Entered on search");
        test.log(Status.PASS,"Entered on search"); 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    
    public void clickOnBrand(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.brand, 3);
        helper.clickOnElement(RingsPageLocators.brand);
        logs.logInfo("Clicked on brand");
        test.log(Status.PASS,"Clicked on brand"); 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnCarlex(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.carlex, 3);
        helper.clickOnElement(RingsPageLocators.carlex);
        logs.logInfo("Clicked on carlex");
        test.log(Status.PASS,"Clicked on carlex"); 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnRings(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.rings, 3);
        helper.clickOnElement(RingsPageLocators.rings);
        logs.logInfo("Clicked on rings");
        test.log(Status.PASS,"Clicked on rings");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnForher(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.forher, 3);
        helper.clickOnElement(RingsPageLocators.forher);
        logs.logInfo("Clicked on forher");
        test.log(Status.PASS,"Clicked on forher");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnFirst(){
        try{

        helper.clickOnElement(RingsPageLocators.first);
        logs.logInfo("Clicked on first");
        test.log(Status.PASS,"Clicked on first");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
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
            System.out.println(e.getMessage());
        }
    }
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        logs.logInfo("Clicked on accept cookies");
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnClose(){
        try{
        helper.clickOnElement(RingsPageLocators.close);
        logs.logInfo("Clicked on searc");
        test.log(Status.PASS,"Clicked on searc");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void verifyRings(){
        asserts.verifyTitleOfPage("Rings");
        
    }
    
    
    

}