package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BraceletsLocators;
import uistore.SearchLocators;
import utils.Assertion;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BraceletsActions {

     WebDriver driver;
    WebDriverHelper helper;
    Assertion assertion;
    ExtentTest test;
    LoggerHandler logs;
    public BraceletsActions(WebDriver driver, ExtentTest test, LoggerHandler logs) {
        this.driver = driver;
        helper = new WebDriverHelper(driver);
        this.test = test;
        assertion = new Assertion(driver, logs);
        this.logs = logs;
    }

     public void clickOnAccept(){
        try{
        helper.clickOnElement(BraceletsLocators.acceptAndCookies);
         logs.logInfo("Clicked On Accept and Cookies");
            test.log(Status.PASS, "Clicked On Accept and Cookies");
        }catch(Exception e){
            System.out.println(e.getMessage());
            logs.logError("Clicked On Accept and Cookies");
            test.log(Status.FAIL, "Clicked On Accept and Cookies");
        }
    }


    public void hoverOnWedding(){
        try {
            helper.hoverOverElement(BraceletsLocators.wedding);
            logs.logInfo("Hovered over wedding");
            test.log(Status.PASS, "Hovered over wedding");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Hovered over wedding");
            test.log(Status.FAIL, "Hovered over wedding");
        }

    }

    public void clickOnBracelets(){
        try{
            helper.clickOnElement(BraceletsLocators.bracelets);
            logs.logInfo("Clicked On Bracelets");
            test.log(Status.PASS, "Clicked On Bracelets");
           

        }catch(Exception e){
            System.out.println(e.getMessage());
            logs.logError("Clicked On Bracelets");
            test.log(Status.FAIL,"Clicked On Bracelets");
        }
    }
    public void verifyJew(){
        try {
            assertion.verifyTextInPage(BraceletsLocators.verJewelry,"jewelry");
            logs.logInfo("Verified the text Jewelry");
            test.log(Status.PASS, "Verified the text Jewelry");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Verified the text Jewelry");
            test.log(Status.FAIL, "Verified the text Jewelry");
        }
    }
    public void clickOnDismiss(){
        try{
        helper.clickOnElement(SearchLocators.dismiss);
        logs.logInfo("Clicked On Dismiss");
        test.log(Status.PASS, "Clicked On Dismiss");
    }catch(Exception e){
        System.out.println(e.getMessage());
        logs.logError("Clicked On Dismis");
        test.log(Status.FAIL, "Clicked On Dismiss");
    }
    }

    public void clickOnYellowGold(){
        try{
            helper.clickOnElement(BraceletsLocators.metalType);
            helper.clickOnElement(BraceletsLocators.yellowGold);
            logs.logInfo("Clicked On Yellow Gold");
        test.log(Status.PASS, "Clicked On Yellow Gold");

        }catch (Exception e) {
            System .out.println(e.getMessage());
            logs.logError("Clicked On Yellow Gold");
            test.log(Status.FAIL, "Clicked On Yellow Gold");
        }
    }

    public void clickOnDiamond(){
        try{
            helper.clickOnElement(BraceletsLocators.gemstone);
            helper.clickOnElement(BraceletsLocators.diamond);
            logs.logInfo("Clicked On Diamond");
        test.log(Status.PASS, "Clicked On Diamond");

            
        }catch (Exception e) {
            System .out.println(e.getMessage());
            logs.logError("Clicked On Diamond");
        test.log(Status.FAIL, "Clicked On Diamond");
        }
    }

    public void clickOnBraceletInStyle(){
        try {
            helper.clickOnElement(BraceletsLocators.braceletStyle);
            helper.clickOnElement(BraceletsLocators.brace);
            logs.logInfo("Clicked On Bracelets Under BraceletStyles");
        test.log(Status.PASS, "Clicked On Bracelets Under BraceletStyles");

            
        } catch (Exception e) {
            System .out.println(e.getMessage());
            logs.logError("Clicked On Bracelets Under BraceletStyles");
        test.log(Status.FAIL, "Clicked On Bracelets Under BraceletStyles");
        }
    }

    public void clickOnfirstPro(){
        try{
            helper.clickOnElement(BraceletsLocators.firstPro);
            logs.logInfo("Clicked On First Product");
        test.log(Status.PASS, "Clicked On First Product");

        }catch(Exception e){
            System.out.println(e.getMessage());
            logs.logError("Clicked On First Product");
        test.log(Status.FAIL, "Clicked On First Product");
        }
    }

    public void clickOnAddToShopping(){
        try {
            helper.clickOnElement(BraceletsLocators.addToShopping);
            logs.logInfo("Clicked On AddToShopping");
        test.log(Status.PASS, "Clicked On AddToShopping");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logs.logError("Clicked On AddToShopping");
        test.log(Status.FAIL, "Clicked On AddToShopping");
        }

    }

    public void getScreenshot() {
        try{
        Screenshot.takeScreenshot("Bracelets");
        logs.logInfo("Captured Bracelets Screenshot");
        test.log(Status.PASS, "Clicked On Bracelets Screenshot");
    }catch(Exception e){
        System.out.println(e.getMessage());
        logs.logError("Captured Bracelets Screenshot");
        test.log(Status.FAIL, "Clicked On Bracelets Screenshot");
    }
    }

    public void braceletsTest(){
        clickOnAccept();
        hoverOnWedding();
        clickOnBracelets();
        verifyJew();
        clickOnDismiss();
        clickOnYellowGold();
        clickOnDiamond();
       clickOnBraceletInStyle();;
        clickOnfirstPro();
        clickOnAddToShopping();
        getScreenshot();
    }


}
