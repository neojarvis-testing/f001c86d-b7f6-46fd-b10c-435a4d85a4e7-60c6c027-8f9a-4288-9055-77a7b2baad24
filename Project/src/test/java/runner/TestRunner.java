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
import utils.EmailTrigger;
import utils.LoggerHandler;
import utils.Reporter;

public class TestRunner extends Base{
    ExtentReports reports;
    ExtentTest test;
    LoggerHandler logs = new LoggerHandler();

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
        WatchesPage obj1=new WatchesPage(test, logs);
        obj1.testcase1();
    }
    @Test(priority = 2)
    public void execute1(){
        test = reports.createTest("testCase04");
        RingsPageActions p1 = new RingsPageActions(test, logs);
        p1.ringsExecute();
    }

    @Test(priority = 1)
    public void contactExecute(){

        test  = reports.createTest("test case 9");
        ContactPageActions c1 = new ContactPageActions(driver, test, logs);
        c1.runContact();
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
        HomePage obj = new HomePage(test,logs);
        obj.rolex();
    }


    @Test(priority = 2)
    public void testCasethree()
    {
        test = reports.createTest("TestCase03");
        MensWatchActions mensWatch = new MensWatchActions(driver, test, logs);
        mensWatch.MensWatchTestCase();
    }
    @Test(priority = 3)
    public void testCase4()
    {
        test = reports.createTest("Test case 4");
        JewelryPage jew  = new JewelryPage(test,logs);
        jew.test4();
    }

    @Test
    public void testCase10()
    {
        test = reports.createTest("Test case 10");
        AboutMayors abtMay = new AboutMayors(test, logs);
        abtMay.test10();
    }

    @Test(priority = 6)
    public void test(){
        test = reports.createTest("TestCase-07");
        SearchActions sa = new SearchActions(driver,test,logs);
        sa.search();

    }

    @Test(priority = 5)
    public void testBracelets(){
        test = reports.createTest("TestCase-05");
        BraceletsActions ba = new BraceletsActions(driver,test, logs);
        ba.braceletsTest();

    }

    @Test (priority = 3)
    public void testCaseNine(){
        test = reports.createTest("TestCase09");
        AccessibilityActions accessy = new AccessibilityActions(driver,test,logs);
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
               EmailTrigger sender = new EmailTrigger();
       sender.sendEmail(
           "inturipranith2456@gmail.com",
           "Selenium Test Report",
           "Please find the attached Extent report.",
           System.getProperty("user.dir")+"/reports/Mayors_Report_2025.04.23.22.30.42.html"
       );
    }

}