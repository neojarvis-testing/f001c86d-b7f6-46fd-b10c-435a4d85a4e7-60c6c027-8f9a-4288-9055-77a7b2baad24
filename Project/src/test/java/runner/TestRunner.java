package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import utils.Base;

public class TestRunner extends Base{
    @BeforeMethod
    public void launch(){
        openBrowser();
    }

    @Test
    public void Rolex(){
        HomePage obj = new HomePage();
        obj.rolex();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
