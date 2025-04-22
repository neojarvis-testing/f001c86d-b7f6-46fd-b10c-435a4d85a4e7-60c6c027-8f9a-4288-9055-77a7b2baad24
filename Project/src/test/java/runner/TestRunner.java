package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.AccessibilityActions;
import pages.HomePage;
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

    @Test (priority = 1)
    public void Rolex(){
        test = reports.createTest("TestCase02");
        HomePage obj = new HomePage(test);
        
        obj.rolex();
    }
    @Test (priority = 2)
    public void testCasethree()
    {
        test = reports.createTest("TestCase03");
        MensWatchActions mensWatch = new MensWatchActions(driver, test);
        mensWatch.MensWatchTestCase();
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
