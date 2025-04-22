package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.RingsPageActions;
import utils.Base;
import utils.LoggerHandler;

public class TestRunner extends Base{
    @BeforeMethod
    public void launch(){
        openBrowser();
    }
    @Test
    public void execute1(){
        RingsPageActions p1 = new RingsPageActions();
        p1.clickOnAccept();
        p1.clickOnSearch();
        p1.inputOnSearchBar();
        p1.enterOnSearchbar();
        
        p1.clickOnClose();
        p1.clickOnRings();
        p1.clickOnForher();
        p1.clickOnBrand();
        p1.clickOnCarlex();
        p1.clickOnFirst();
        p1.clickOnLive();
        LoggerHandler.logInfo("hi");
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    
}
