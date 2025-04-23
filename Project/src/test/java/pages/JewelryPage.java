package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.JewelryLocators;
import utils.*;

public class JewelryPage extends Base{
    public WebDriverHelper helper;
    public Assertion asserts;
    public ExtentTest test;
    /*
     * Constructor name: JewelryPage
     * Author: Pavan Kumar
     * Description: this contrustor creates a reference for WebDriverHelper variable, Assertion variable and initializes ExtentTest variable
     * Return type: none
     * Parameters: ExtentTest instance
     */

    public JewelryPage(ExtentTest test,LoggerHandler logs)
    {
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
        asserts = new Assertion(Base.driver,logs);
        this.logs = logs;
    }

    /*
     * Method name: jewelryHoverAndChanelClick
     * Author: Pavan Kumar
     * Description: This method hovers over the jewelry option and click on chanel under jewelry
     * Return type: void
     * Parameters: NA
     */

    public void jewelryHoverAndChanelClick()
    {
        try{
        helper.hoverOverElement(JewelryLocators.acceptCook);
        helper.clickOnElement(JewelryLocators.acceptCook);
        helper.hoverOverElement(JewelryLocators.jewelry);
        helper.hoverOverElement(JewelryLocators.chanel);
        helper.clickOnElement(JewelryLocators.chanel);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.INFO,"Hovered over Jewelry and clicked on Chanel");
        test.log(Status.PASS,"Successfully clicked on chanel under Jewelry");
        LoggerHandler.logInfo("Successfully clicked on chanel under Jewelry");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to hover over jewelry and click on chanel");
            test.log(Status.FAIL,"Hovering over Jewelry and clicking on chanel is a failure");
            LoggerHandler.logError("Hovering over Jewelry and clicking on chanel is a failure");
            Reporter.attachScreenshotToReport("Failed to hover over jewelry and click on chanel",test,"");
        }

    }

    /*
     * Method name: verifyChanel
     * Author: Pavan Kumar
     * Description: This method is used to veriy the title of Chanel page
     * Return type: void
     * Parameters: NA
     */
    public void verifyChanel()
    {
        try{
        asserts.verifyTitleOfPage("Chanel");
        test.log(Status.INFO,"Verified chanel page");
        test.log(Status.PASS,"Chanel page title verification is successful");
        LoggerHandler.logInfo("Chanel page title verification is successful");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Chanel page title verification has failed");
            test.log(Status.FAIL,"Verification of title of chanel page is a failure");
            LoggerHandler.logError("Verification of title of chanel page is a failure");
            Reporter.attachScreenshotToReport("Failed to verify Chanel page title",test,"");
        }
    }

    /*
     * Method name: clickOnRings
     * Author: Pavan Kumar
     * Description: This method is used to click on rings option under category
     * Return type: void
     * Parameters: NA
     */

    public void clickOnRings()
    {
        try{
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        helper.clickOnElement(JewelryLocators.closePop);
        helper.hoverOverElement(JewelryLocators.rings);
        helper.clickOnElement(JewelryLocators.rings);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.INFO,"Applied filter for rings");
        test.log(Status.PASS,"Filtering based on rings is successful");
        LoggerHandler.logInfo("Filtering based on rings is successful");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to filter based on rings");
           test.log(Status.FAIL,"Filtering based on rings is a failure");
            LoggerHandler.logError("Filtering based on rings is a failure");
            Reporter.attachScreenshotToReport("Failed to click on rings",test,"");
        }
    }

    /*
     * Method name: clickOnBrandAndCoco
     * Author: Pavan Kumar
     * Description: This method is used to click on brand type column and to click on coco brush option under Brandtype
     * Return type: void
     * Parameters: NA
     */

    public void clickOnBrandAndCoco()
    {
        try{
        helper.javascriptScroll(JewelryLocators.brandType);
        helper.clickOnElement(JewelryLocators.brandType);
        helper.hoverOverElement(JewelryLocators.cocoRush);
        helper.clickOnElement(JewelryLocators.cocoRush);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.INFO,"Applied filter for Brand type as coco brush");
        test.log(Status.PASS,"Filtering for coco brush for brand type is a success");
        LoggerHandler.logInfo("Filtering for coco brush for brand type is a success");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to apply filter based on coco brush brand");
            test.log(Status.FAIL,"Filtering for coco brush for brand type is a failure");
            LoggerHandler.logError("Filtering for coco brush for brand type is a failure");
            Reporter.attachScreenshotToReport("Failed to click on coco brush",test,"");
        }

    }

   /*
     * Method name: clickOnMetalType
     * Author: Pavan Kumar
     * Description: This method is used to click on metal type and white gold option under metal type 
     * Return type: void 
     * Parameters: NA
     */

    public void clickOnMetalType()
    {
        try{
        helper.javascriptScroll(JewelryLocators.dial);
        helper.clickOnElement(JewelryLocators.dial);
        helper.hoverOverElement(JewelryLocators.whiteGold);
        helper.clickOnElement(JewelryLocators.whiteGold);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        test.log(Status.INFO,"Filter applied as white gold for metal type");
        test.log(Status.PASS,"Successfully applied filter as white gold for metal type");
        LoggerHandler.logInfo("Successfully applied filter as white gold for metal type");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to filter based on metal type");
            test.log(Status.FAIL,"Filtering for metal type is a failure");
            LoggerHandler.logError("Filtering for metal type is a failure");
            Reporter.attachScreenshotToReport("Failed to click on white gold",test,"");
        }

    }

    /*
     * Method name: clickOnFirst
     * Author: Pavan Kumar
     * Description: This method is used to click on first product available after applying appropriate filters
     * Return type: void
     * Parameters: NA
     */

    public void clickOnFirst()
    {
        try{
        helper.hoverOverElement(JewelryLocators.firstPro);
        helper.clickOnElement(JewelryLocators.firstPro);
        test.log(Status.INFO,"Clicked on first product after applying appropriate filters");
        test.log(Status.PASS,"Successfully clicked on first product after applying appropriate filters");
        LoggerHandler.logInfo("Successfully clicked on first product after applying appropriate filters");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Could not click on first product");
            test.log(Status.FAIL,"Failed to apply appropriate filters and to click on first product");
            LoggerHandler.logError("Failed to apply appropriate filters and to click on first product");
            Reporter.attachScreenshotToReport("Failed to click on frist product",test,"");
        }

    }

    /*
     * Method name: test4
     * Author: Pavan Kumar
     * Description: This method clusters all the actions to be performed under testcase4 
     * Return type: void 
     * Parameters: NA
     */

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
