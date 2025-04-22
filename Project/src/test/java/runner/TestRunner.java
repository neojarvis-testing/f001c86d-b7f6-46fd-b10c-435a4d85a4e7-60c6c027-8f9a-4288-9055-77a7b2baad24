package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import pages.BraceletsActions;
import pages.*;
import pages.HomePage;
import pages.MensWatchActions;
import pages.RingsPageActions;
import utils.Base;
import utils.Reporter;
import pages.SearchActions;

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
    @Test(priority = 4)
    public void execute1(){
        test = reports.createTest("testCase04");
        RingsPageActions p1 = new RingsPageActions(test);
        p1.clickOnAccept();
        p1.clickOnSearch();
        p1.inputOnSearchBar();
        p1.enterOnSearchbar();
        
        p1.clickOnClose();
        p1.clickOnRings();
        p1.clickOnForher();
        p1.clickOnForher();
        p1.clickOnBrand();
        p1.clickOnCarlex();
        p1.clickOnFirst();
        p1.clickOnLive();
    }
    @Test (priority = 1)
    public void Rolex(){
        test = reports.createTest("TestCase02");
        HomePage obj = new HomePage(test);
        obj.rolex();
    }
    @Test(priority = 2)
    public void testCasethree()
    {
        test = reports.createTest("TestCase03");
        MensWatchActions mensWatch = new MensWatchActions(driver, test);
        mensWatch.MensWatchTestCase();
    }
    @Test(priority = 3)
    public void testCase4()
    {
        test = reports.createTest("Test case 4");
        JewelryPage jew  = new JewelryPage(test);
        jew.test4();
    }

    @Test(priority = 7)
    public void testCase10()
    {
        test = reports.createTest("Test case 10");
        AboutMayors abtMay = new AboutMayors(test);
        abtMay.test10();
    }
    @Test(priority = 6)
    public void test(){
        test = reports.createTest("TestCase-07");
        SearchActions sa = new SearchActions(driver,test);
        
        sa.search();

    }
    @Test(priority = 5)
    public void testBracelets(){
        test = reports.createTest("TestCase-05");
        BraceletsActions ba = new BraceletsActions(driver,test);
        ba.braceletsTest();
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