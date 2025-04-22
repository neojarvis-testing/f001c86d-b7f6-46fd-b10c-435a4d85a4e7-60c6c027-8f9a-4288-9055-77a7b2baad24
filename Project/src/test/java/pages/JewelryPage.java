package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.JewelryLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class JewelryPage extends Base{
    public WebDriverHelper helper;
    public Assertion asserts;
    public ExtentTest test;

    public JewelryPage(ExtentTest test)
    {
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
        asserts = new Assertion(Base.driver);
    }

    // public void verifyLogo()
    // {
    //     try{
    //        asserts.verifyTextInPage(JewelryLocators.logo,"MAYOR");
    //     }
    //     catch(Exception e)
    //     {
            
    //     }
    // }

    public void jewelryHoverAndChanelClick()
    {
        try{
        helper.hoverOverElement(JewelryLocators.acceptCook);
        helper.clickOnElement(JewelryLocators.acceptCook);
        helper.hoverOverElement(JewelryLocators.jewelry);
        helper.hoverOverElement(JewelryLocators.chanel);
        helper.clickOnElement(JewelryLocators.chanel);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.INFO,"");
        test.log(Status.PASS,"");
        LoggerHandler.logInfo("");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");
            test.log(Status.FAIL,"");
            LoggerHandler.logError("");
        }

    }
    public void verifyChanel()
    {
        try{
        asserts.verifyTitleOfPage("Chanel");
        test.log(Status.INFO,"");

        test.log(Status.PASS,"");
        LoggerHandler.logInfo("");
        }
        catch(Exception e)
        {
            test.log(Status.FAIL,"");
            LoggerHandler.logError("");
        }
    }

    public void clickOnRings()
    {
        try{
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        helper.clickOnElement(JewelryLocators.closePop);
        helper.hoverOverElement(JewelryLocators.rings);
        helper.clickOnElement(JewelryLocators.rings);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.INFO,"");

        test.log(Status.PASS,"");
        LoggerHandler.logInfo("");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            test.log(Status.FAIL,"");
            LoggerHandler.logError("");
        }
    }
    public void clickOnBrandAndCoco()
    {
        try{
        helper.javascriptScroll(JewelryLocators.brandType);
        helper.clickOnElement(JewelryLocators.brandType);
        helper.hoverOverElement(JewelryLocators.cocoRush);
        helper.clickOnElement(JewelryLocators.cocoRush);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.PASS,"");
        LoggerHandler.logInfo("");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            test.log(Status.FAIL,"");
            LoggerHandler.logError("");
        }

    }

    public void clickOnMetalType()
    {
        try{
        helper.javascriptScroll(JewelryLocators.dial);
        helper.clickOnElement(JewelryLocators.dial);
        helper.hoverOverElement(JewelryLocators.whiteGold);
        helper.clickOnElement(JewelryLocators.whiteGold);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.INFO,"");

        test.log(Status.PASS,"");
        LoggerHandler.logInfo("");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            test.log(Status.FAIL,"");
            LoggerHandler.logError("");
        }

    }

    public void clickOnFirst()
    {
        try{
        helper.hoverOverElement(JewelryLocators.firstPro);
        helper.clickOnElement(JewelryLocators.firstPro);
        test.log(Status.INFO,"");

        test.log(Status.PASS,"");
        LoggerHandler.logInfo("");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            test.log(Status.FAIL,"");
            LoggerHandler.logError("");
        }

    }

    public void test4()
    {
        jewelryHoverAndChanelClick();
        verifyChanel();
        clickOnRings();
        clickOnBrandAndCoco();
        clickOnMetalType();
        clickOnFirst();
    }
}
