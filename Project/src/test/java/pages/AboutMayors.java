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
    LoggerHandler logs;
    public AboutMayors(ExtentTest test,LoggerHandler logs)
    {
        helper = new WebDriverHelper(driver);
        this.test=test;
        assertt = new Assertion(driver,logs);
        this.logs = logs;
    }

    public void clickOnAboutM()
    {
        try{
        helper.clickOnElement(JewelryLocators.acceptCook);
        helper.javascriptScroll(AboutUsPageLocators.aboutMayors);
        test.log(Status.INFO,"scroll down to footer");
        logs.logInfo("scroll down to footer");
        

        helper.clickOnElement(AboutUsPageLocators.aboutMayors);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        assertt.verifyURLOfPage("https://www.mayors.com/about-us");
        assertt.verifyTitleOfPage(" About Us ");
        Base.driver.navigate().back();
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Successfully performed About Mayors clicking operations");
        logs.logInfo("Successfully performed About Mayors clicking operations");
        }
        catch(Exception e)
        {
            logs.logError("Failed to perform About Mayors clicking operations");
            test.log(Status.FAIL,"Failed to perform About Mayors clicking operations");
        }
    }

    public void clickOnPress()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.pressRoom);
        helper.clickOnElement(AboutUsPageLocators.pressRoom);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        assertt.verifyURLOfPage("https://www.mayors.com/press-media-enquiries");
        assertt.verifyTitleOfPage("Press & Media");
        Base.driver.navigate().back();
        test.log(Status.PASS,"navigate back to home page");
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Clicking on Press is a success");
        logs.logInfo("Clicking on Press is a success");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform press click operations");
            test.log(Status.FAIL,"Failed to perform press click operations");
        }

    }

    public void clickOnCareer()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.careers);

        helper.clickOnElement(AboutUsPageLocators.careers);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        assertt.verifyURLOfPage("https://usacareers.thewosgroup.com/jobs/divisions/mayors/");
        assertt.verifyTitleOfPage("Careers");
        Base.driver.navigate().back();
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Successfully performed career click operations");
        logs.logInfo("Successfully performed career click operations");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform career click operations");
            test.log(Status.FAIL,"Failed to perform career click operations");
        }
    } 

    public void clickOnSus()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.sustainability);
        helper.clickOnElement(AboutUsPageLocators.sustainability);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        assertt.verifyURLOfPage("https://www.mayors.com/sustainability");
        assertt.verifyTitleOfPage("Sustainability");
        Base.driver.navigate().back();
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Sucessfully performed clicking on Sustainability operations");
        logs.logInfo("Sucessfully performed clicking on Sustainability operations");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform Sustainability click operations");
            test.log(Status.FAIL,"Failed to perform Sustainability click operations");
        }

    }

    public void clickOnNewsL()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.newLet);
        helper.clickOnElement(AboutUsPageLocators.newLet);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        assertt.verifyURLOfPage("https://www.mayors.com/newsletter-sign-up");
        assertt.verifyTitleOfPage("Newsletter");
        Base.driver.navigate().back();
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Successfully performed News Letter clicking operations");
        logs.logInfo("Successfully performed News Letter clicking operations");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perfrom News Letter clicking operations");
            test.log(Status.FAIL,"Failed to perfrom News Letter clicking operations");
        }
    }

    public void clickOnRolexxx()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.rolexx);

        helper.clickOnElement(AboutUsPageLocators.rolexx);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        assertt.verifyURLOfPage("https://www.mayors.com/rolex/discover");
        assertt.verifyTitleOfPage("Rolex");
        Base.driver.navigate().back();
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Successfully performed rolex clicking operations");
        logs.logInfo("Successfully performed rolex clicking operations");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform rolex clicking operations");
            test.log(Status.FAIL,"Failed to perform rolex clicking operations");
        }
    }

    public void clickOnWedd()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.wedD);

        helper.clickOnElement(AboutUsPageLocators.wedD);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        assertt.verifyURLOfPage("https://www.mayors.com/wedding");
        assertt.verifyTitleOfPage("Wedding");
        Base.driver.navigate().back();
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Successfully performed wedding clicking operations");
        logs.logInfo("Successfully performed wedding clicking operations");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform Wedding click operations");
            test.log(Status.FAIL,"Failed to perform Wedding click operations");
        }
    }

    public void clickOnBrandss()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.brandS);

        helper.clickOnElement(AboutUsPageLocators.brandS);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        assertt.verifyURLOfPage("https://www.mayors.com/c/Brands");
        assertt.verifyTitleOfPage("Brands");
        Base.driver.navigate().back();
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Successfully performed Brands clicking operations");
        logs.logInfo("Successfully performed Brands clicking operations");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to perform Brands clicking operations");
            test.log(Status.FAIL,"Failed to perform Brands clicking operations");
        }
    }

    public void verifyAndScreenshot()
    {
        try{
        helper.javascriptScroll(AboutUsPageLocators.aboutUsVer);

        assertt.verifyTextInPage(AboutUsPageLocators.aboutUsVer,"About Mayors");
        test.log(Status.PASS,"verified About Mayors");
        Screenshot.takeScreenshot("mayors");
        Reporter.attachScreenshotToReport("mayors", test, "mayors");
        test.log(Status.INFO,"");

        test.log(Status.PASS,"Successfully verified and took a screenshot");
        logs.logInfo("Successfully verified and took a screenshot");
        }
        catch(Exception e)
        {
            test.log(Status.INFO,"");

            logs.logError("Failed to verify and take a screenshot");
            test.log(Status.FAIL,"Failed to verify and take a screenshot");
        }
    }

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
