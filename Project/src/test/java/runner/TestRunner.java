package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.ContactPageActions;
import pages.RingsPageActions;
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
        c1.clickOnAffrim();
        c1.clickOnFeedback();
        c1.clusterVerification();
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
