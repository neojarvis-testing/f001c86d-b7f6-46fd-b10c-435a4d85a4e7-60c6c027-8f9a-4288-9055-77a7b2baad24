package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.SearchActions;
import utils.Base;
public class TestRunner  extends Base{
 
    // ExtentReports report;
    // ExtentTest test;

    // @BeforeClass
    // public void gen(){
    //     report = Reporter.
    // }

    @BeforeMethod
    public void launch(){
        openBrowser();
    }

    @Test
    public void test(){
        SearchActions sa = new SearchActions();
        sa.search();

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
       
    }

    
}
