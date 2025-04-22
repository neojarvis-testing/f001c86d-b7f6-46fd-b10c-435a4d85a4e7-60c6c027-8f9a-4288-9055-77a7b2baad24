package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.JewelryPage;
import utils.Base;

public class TestRunner extends Base{

    @BeforeMethod
    public void openBrow()
    {
        openBrowser();
        driver.navigate().refresh();
    }

    @Test
    public void testCase4()
    {
        JewelryPage jew  = new JewelryPage();
        jew.test4();
    }

    @AfterMethod
    
    public void closeBrow()
    {
        if(driver!=null)
        {
            driver.quit();
        }
    }
}
