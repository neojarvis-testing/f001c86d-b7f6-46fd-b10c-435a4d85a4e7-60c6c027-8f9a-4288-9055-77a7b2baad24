package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.WatchesPage;
import utils.Base;

public class TestRunner extends Base {

    @BeforeMethod
    public void open(){
        openBrowser();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    @Test
    public void case1(){
        WatchesPage obj1=new WatchesPage();
        obj1.testcase1();
    }
}
