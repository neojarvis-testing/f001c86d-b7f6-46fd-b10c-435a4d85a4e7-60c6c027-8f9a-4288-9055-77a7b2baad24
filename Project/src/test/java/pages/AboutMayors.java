package pages;

import java.time.Duration;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AboutUsPageLocators;
import uistore.JewelryLocators;
import utils.*;

public class AboutMayors extends Base{
    public WebDriverHelper helper;
    public ExtentTest test;
    public Assertion assertt;
   /*
     * Constructor name: JewelryPage
     * Author: Pavan Kumar
     * Description: this contrustor creates a reference for WebDriverHelper variable, Assertion variable and initializes ExtentTest variable
     * Return type: none
     * Parameters: An ExtentTest instance
     */
    public AboutMayors(ExtentTest test,LoggerHandler logs)
    {
        helper = new WebDriverHelper(driver);
        this.test=test;
        assertt = new Assertion(driver,logs);
        this.logs = logs;
    }

    /*
     * Method name: clickOnAboutM
     * Author: Pavan Kumar
     * Description: This method is used to click on  About Mayors option available in footer section
     * Return type: void
     * Parameters: NA
     */

    public void clickOnAboutM()
    {
        try{
        helper.clickOnElement(JewelryLocators.acceptCook);
        test.log(Status.INFO,"scroll down to footer");
        helper.javascriptScroll(AboutUsPageLocators.aboutMayors);
        logs.logInfo("scroll down to footer");
        helper.clickOnElement(AboutUsPageLocators.aboutMayors);
        assertt.verifyURLOfPage("https://www.mayors.com/about-us");
        assertt.verifyTitleOfPage(" About Us ");
        test.log(Status.INFO,"Clicked on About Mayors in footer section");
        test.log(Status.PASS,"Successfully performed About Mayors clicking operations");
        LoggerHandler.logInfo("Successfully performed About Mayors clicking operations");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        catch(Exception e)
        {
            logs.logError("Failed to perform About Mayors clicking operations");
            test.log(Status.FAIL,"Failed to perform About Mayors clicking operations");
            Reporter.attachScreenshotToReport("Failed About Mayors click",test,"");
        }
    }

    /*
     * Method name: clickOnPress
     * Author: Pavan Kumar
     * Description: This method is used to click on  Press Room option available in footer section
     * Return type:  void 
     * Parameters: NA
     */
    public void clickOnPress()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.pressRoom);
        helper.hoverOverElement(AboutUsPageLocators.pressRoom);
        helper.clickOnElement(AboutUsPageLocators.pressRoom);
        assertt.verifyURLOfPage("https://www.mayors.com/press-media-enquiries");
        assertt.verifyTitleOfPage("Press & Media");
        test.log(Status.PASS,"navigate back to home page");
        test.log(Status.INFO,"Clicked on Press in footer section");
        test.log(Status.PASS,"Clicking on Press is a success");
        LoggerHandler.logInfo("Clicking on Press is a success");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform press click operations");
            test.log(Status.FAIL,"Failed to perform press click operations");
            Reporter.attachScreenshotToReport("Failed Press click",test,"");
        }

    }
    /*
     * Method name: clickOnCareer
     * Author: Pavan Kumar
     * Description: This method is used to click on  careers option available in footer section
     * Return type: void
     * Parameters: NA
     */

    public void clickOnCareer()
    {
        try{
        helper.clickOnElement(AboutUsPageLocators.careers);
        assertt.verifyURLOfPage("https://usacareers.thewosgroup.com/jobs/divisions/mayors/");
        assertt.verifyTitleOfPage("Careers");
        test.log(Status.INFO,"Clicked on Carreers");
        test.log(Status.PASS,"Successfully performed careers click operations");
        LoggerHandler.logInfo("Successfully performed careers click operations");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));       
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"Failed to click on Careers in footer section");
            LoggerHandler.logError("Failed to perform careers click operations");
            test.log(Status.FAIL,"Failed to perform careers click operations");
            Reporter.attachScreenshotToReport("Failed careers click",test,"");
        }
    } 

    /*
     * Method name: clickOnSus
     * Author: Pavan Kumar
     * Description: This method is used to click on  Sustainability option available in footer section
     * Return type: void
     * Parameters: NA
     */

    public void clickOnSus()
    {
        try{
        helper.clickOnElement(AboutUsPageLocators.sustainability);
        assertt.verifyURLOfPage("https://www.mayors.com/sustainability");
        assertt.verifyTitleOfPage("Sustainability");
        test.log(Status.INFO,"Clicked on Sustainability in footer section");
        test.log(Status.PASS,"Sucessfully performed clicking on Sustainability operations");
        LoggerHandler.logInfo("Sucessfully performed clicking on Sustainability operations");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));       
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform Sustainability click operations");
            test.log(Status.FAIL,"Failed to perform Sustainability click operations");
            Reporter.attachScreenshotToReport("Failed Sustainability click",test,"");
        }

    }

    /*
     * Method name: clickOnNewsL
     * Author: Pavan Kumar
     * Description: This method is used to click on  NewsLetterSIgnUp option available in footer section
     * Return type: void
     * Parameters: NA
     */

    public void clickOnNewsL()
    {
        try{
        helper.clickOnElement(AboutUsPageLocators.newLet);
        assertt.verifyURLOfPage("https://www.mayors.com/newsletter-sign-up");
        assertt.verifyTitleOfPage("Newsletter");
        test.log(Status.INFO,"Clicked on NewsLetterSignUp");
        test.log(Status.PASS,"Successfully performed News Letter clicking operations");
        LoggerHandler.logInfo("Successfully performed News Letter clicking operations");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));       
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perfrom News Letter clicking operations");
            test.log(Status.FAIL,"Failed to perfrom News Letter clicking operations");
            Reporter.attachScreenshotToReport("Failed NewsLetterSignUp click",test,"");
        }
    }
    /*
     * Method name: clickOnRolexxx
     * Author: Pavan Kumar
     * Description: This method is used to click on  Rolex option available in footer section
     * Return type: void
     * Parameters: NA
     */
    public void clickOnRolexxx()
    {
        try{
        helper.clickOnElement(AboutUsPageLocators.rolexx);
        assertt.verifyURLOfPage("https://www.mayors.com/rolex/discover");
        assertt.verifyTitleOfPage("Rolex");
        test.log(Status.INFO,"Clicked on Roles in footer section");
        test.log(Status.PASS,"Successfully performed rolex clicking operations");
        LoggerHandler.logInfo("Successfully performed rolex clicking operations");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));       
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform rolex clicking operations");
            test.log(Status.FAIL,"Failed to perform rolex clicking operations");
            Reporter.attachScreenshotToReport("Failed Rolex click",test,"");       
        }
    }
    /*
     * Method name: clickOnWedd
     * Author: Pavan Kumar
     * Description: This method is used to click on  wedding option available in footer section
     * Return type: void
     * Parameters: NA
     */
    public void clickOnWedd()
    {
        try{
        helper.clickOnElement(AboutUsPageLocators.wedD);
        assertt.verifyURLOfPage("https://www.mayors.com/wedding");
        assertt.verifyTitleOfPage("Wedding");
        test.log(Status.INFO,"Clicked on wedding in footer section");
        test.log(Status.PASS,"Successfully performed wedding clicking operations");
        LoggerHandler.logInfo("Successfully performed wedding clicking operations");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));       
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform Wedding click operations");
            test.log(Status.FAIL,"Failed to perform Wedding click operations");
            Reporter.attachScreenshotToReport("Failed Wedding click",test,"");           
        }
    }
    /*
     * Method name: clickOnBrandss
     * Author: Pavan Kumar
     * Description: This method is used to click on brands option available in footer section
     * Return type: void
     * Parameters: NA
     */
    public void clickOnBrandss()
    {
        try{
        helper.clickOnElement(AboutUsPageLocators.brandS);
        assertt.verifyURLOfPage("https://www.mayors.com/c/Brands");
        assertt.verifyTitleOfPage("Brands");
        test.log(Status.INFO,"Clicked on brands in footer section");
        test.log(Status.PASS,"Successfully performed Brands clicking operations");
        LoggerHandler.logInfo("Successfully performed Brands clicking operations");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));       
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform Brands clicking operations");
            test.log(Status.FAIL,"Failed to perform Brands clicking operations");
            Reporter.attachScreenshotToReport("Failed Brands click",test,"");
        }
    }
    /*
     * Method name: verifyAndScreenshot
     * Author: Pavan Kumar
     * Description: This method is used to verify About Mayors label and to take a screenshot
     * Return type: void
     * Parameters: NA
     */
    public void verifyAndScreenshot()
    {
        try{
        assertt.verifyTextInPage(AboutUsPageLocators.aboutUsVer,"About Mayors");
        test.log(Status.PASS,"verified About Mayors");
        Screenshot.takeScreenshot("mayors");
        Reporter.attachScreenshotToReport("mayors.png",test,"");
        test.log(Status.INFO,"Verification of About Mayors label is successful");
        test.log(Status.PASS,"Successfully verified and took a screenshot");
        LoggerHandler.logInfo("Successfully verified and took a screenshot");
        driver.navigate().to(Base.prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));       
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to verify and take a screenshot");
            test.log(Status.FAIL,"Failed to verify and take a screenshot");
            Reporter.attachScreenshotToReport("Failed to Verify About Mayors label",test,"");
        }
    }
    /*
     * Method name: test10
     * Author: Pavan Kumar
     * Description: This method clusters all the actions need to be performed under test case 10
     * Return type: void
     * Parameters: NA
     */
    public void test10()
    {
        clickOnAboutM();
        clickOnPress();
        clickOnCareer();
        clickOnSus();
        clickOnNewsL();
        clickOnWedd();
        clickOnRolexxx();
        clickOnBrandss();
        verifyAndScreenshot();
    }
}
