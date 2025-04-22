package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.*;
import utils.Base;
import utils.Reporter;

public class TestRunner extends Base{
    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void configReport(){
        reports = Reporter.createReport("Mayors_Report");
    }

    @BeforeMethod
    public void configBrowser(){
        openBrowser();
    }

    @Test
    public void Rolex(){
        HomePage obj = new HomePage(test);
        test = reports.createTest("TestCase02");
        obj.rolex();
    }
    @Test
    public void testCasethree()
    {
        MensWatchActions mensWatch = new MensWatchActions(driver);
        test = reports.createTest("testCase03");
        mensWatch.clickOnAcceptCookies();
        mensWatch.hoverOverBrands();
        mensWatch.clickOnOmega();
        mensWatch.verifyOmegaTitle();
        mensWatch.clickOnMensWatches();
        mensWatch.clickOnSeaMaster();
        mensWatch.clickOnBlue();
        mensWatch.clickOnFirstProduct();
        mensWatch.clickOnAddToShoppingBag();
        mensWatch.verifyKeyword();
        mensWatch.takeScreenshot();
    }
    @Test
    public void testCase4()
    {
        test = reports.createTest("Test case 4");
        JewelryPage jew  = new JewelryPage(test);
        jew.test4();
    }

    @Test
    public void testCase10()
    {
        test = reports.createTest("Test case 10");
        AboutMayors abtMay = new AboutMayors(test);
        abtMay.test10();
    }


    @AfterMethod
    public void teardown(){
        if(driver!=null){
            driver.quit();
        }

    }

    @AfterClass
    public void flushReport()
    {
        reports.flush();
    }

}
