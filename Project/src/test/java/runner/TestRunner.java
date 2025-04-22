package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePage;
import pages.WatchesPage;
import pages.MensWatchActions;
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
    public void case1(){
        test=reports.createTest("case1");
        WatchesPage obj1=new WatchesPage(test);
        
        obj1.testcase1();
    }
    // @Test
    // public void Rolex(){
    //     HomePage obj = new HomePage(test);
    //     test = reports.createTest("TestCase02");
    //     obj.rolex();
    // }
    // @Test
    // public void testCasethree()
    // {
    //     MensWatchActions mensWatch = new MensWatchActions(driver);
    //     test = reports.createTest("testCase03");
    //     mensWatch.clickOnAcceptCookies();
    //     mensWatch.hoverOverBrands();
    //     mensWatch.clickOnOmega();
    //     mensWatch.verifyOmegaTitle();
    //     mensWatch.clickOnMensWatches();
    //     mensWatch.clickOnSeaMaster();
    //     mensWatch.clickOnBlue();
    //     mensWatch.clickOnFirstProduct();
    //     mensWatch.clickOnAddToShoppingBag();
    //     mensWatch.verifyKeyword();
    //     mensWatch.takeScreenshot();
    // }


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
