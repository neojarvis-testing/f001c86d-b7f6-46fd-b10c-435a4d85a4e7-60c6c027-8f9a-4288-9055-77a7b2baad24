package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Base;

public class TestRunner extends Base{

    @Test
    public void launch(){
        openBrowser();
    }
}
