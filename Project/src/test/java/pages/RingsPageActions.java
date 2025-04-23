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

    public RingsPageActions(ExtentTest test) {
        helper = new WebDriverHelper(driver);
        this.test=test;
        asserts = new Assertion(driver);
    }
    public void clickOnSearch(){
        try{

        helper.waitForElementToBeVisible(RingsPageLocators.searchbar, 3);
        helper.clickOnElement(RingsPageLocators.searchbar);
        LoggerHandler.logInfo("Clicked on search");
        test.log(Status.PASS,"Clicked on searchbar");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void inputOnSearchBar(){
        try{
        
        helper.enterText(RingsPageLocators.searchbar, "Rings");
        LoggerHandler.logInfo("Clicked on searchbar");
        test.log(Status.PASS,"Clicked on searchbar");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void enterOnSearchbar(){
        try{
        helper.enterAction(RingsPageLocators.searchbar);
        LoggerHandler.logInfo("Entered on search");
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
        LoggerHandler.logInfo("Clicked on brand");
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
        LoggerHandler.logInfo("Clicked on carlex");
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
        LoggerHandler.logInfo("Clicked on rings");
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
        LoggerHandler.logInfo("Clicked on forher");
        test.log(Status.PASS,"Clicked on forher");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnFirst(){
        try{

        helper.clickOnElement(RingsPageLocators.first);
        LoggerHandler.logInfo("Clicked on first");
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
        LoggerHandler.logInfo("Clicked on live");
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
        LoggerHandler.logInfo("Clicked on accept cookies");
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnClose(){
        try{
        helper.clickOnElement(RingsPageLocators.close);
        LoggerHandler.logInfo("Clicked on searc");
        test.log(Status.PASS,"Clicked on searc");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void verifyRings(){
        try{
        asserts.verifyTitleOfPage("Rings");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    

}