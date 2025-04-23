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
    public void case1(){
        test=reports.createTest("case1");
        WatchesPage obj1=new WatchesPage(test);
        obj1.testcase1();
    }
    @Test
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
        p1.verifyRings();
    }
    @Test
    public void contactExecute(){
        ContactPageActions c1 = new ContactPageActions(test);
        c1.clickOnAccept();
        c1.clickOnContact();
        c1.clickOnLuxury();
        c1.clickOnStore();
        c1.clickOnDelivery();
        c1.clickOnclick();
        c1.clickOnReturn();
    }
    /*
     * Method Name : Rolex
     * Author Name : Praneeth
     * Description : This method used to run the home page actions
     * Parameters : NA
     * Return Type : void
     */
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

    @Test
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

    @Test (priority = 3)
    public void testCaseNine(){
        test = reports.createTest("TestCase09");
        AccessibilityActions accessy = new AccessibilityActions(driver,test);
        accessy.accessibilityTestCase();
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