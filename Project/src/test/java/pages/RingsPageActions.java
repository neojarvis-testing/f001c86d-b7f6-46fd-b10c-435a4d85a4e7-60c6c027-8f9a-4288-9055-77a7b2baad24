package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RingsPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
import utils.Assertion;

public class RingsPageActions extends Base{
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
    LoggerHandler logs;
    /*
     * Constructor Name : RingsPageActions
     * Author Name : Krishna Reddy
     * Description : This constructor creates the instances of the WebDriverHelper and Assertion.
     * Parameters : N/A
     * Return Type : void
     */
    public RingsPageActions(ExtentTest test,LoggerHandler logs) {
        helper = new WebDriverHelper(driver);
        this.test=test;
        asserts = new Assertion(driver,logs);
        this.logs=logs;
    }
    /*
    * Method Name : clickOnSearch
    * Author Name : Krishna Reddy
    * Description : This method clicks on Search on the home page
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnSearch(){
        try{

        helper.waitForElementToBeVisible(RingsPageLocators.searchbar, 3);
        helper.clickOnElement(RingsPageLocators.searchbar);
        logs.logInfo("Clicked on search");
        test.log(Status.PASS,"Clicked on searchbar");
        }
        catch(Exception e){
            logs.logError("Clicked on search");
            test.log(Status.FAIL, "Clicked on search");
            Screenshot.takeScreenshot("src14");
            Reporter.attachScreenshotToReport("Brands", test, "src14");
    
        }
    }
    /*
    * Method Name : inputOnSearchBar
    * Author Name : Krishna Reddy
    * Description : This method gives input Rings to the searchbar on the home page
    * Parameters : N/A
    * Return Type : void
    */
    public void inputOnSearchBar(){
        try{
        String text = helper.excelReading(0, 2, 0);
        helper.enterText(RingsPageLocators.searchbar, text);
        logs.logInfo("Clicked on searchbar");
        helper.enterText(RingsPageLocators.searchbar, "Rings");
        logs.logInfo("Clicked on searchbar");
        test.log(Status.PASS,"Clicked on searchbar");
        }
        catch(Exception e){
            logs.logError("Clicked on searchbar");
            test.log(Status.FAIL, "Clicked on searchbar");
            Screenshot.takeScreenshot("src15");
            Reporter.attachScreenshotToReport("Brands", test, "src15");
    
        }
    }
   /*
    * Method Name : enterOnSearchbar
    * Author Name : Krishna Reddy
    * Description : This method enter on the searchbar.
    * Parameters : N/A
    * Return Type : void
    */
    public void enterOnSearchbar(){
        try{
        helper.enterAction(RingsPageLocators.searchbar);
        logs.logInfo("Entered on search");
        test.log(Status.PASS,"Entered on search"); 
        }
        catch(Exception e){
            logs.logError("Entered on search");
            test.log(Status.FAIL, "Entered on search");
            Screenshot.takeScreenshot("src16");
            Reporter.attachScreenshotToReport("Brands", test, "src16");
    
        }
    }
   /*
    * Method Name : clickOnBrand
    * Author Name : Krishna Reddy
    * Description : This method clicks on the brand in the Rings Page.
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnBrand(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.brand, 3);
        helper.clickOnElement(RingsPageLocators.brand);
        logs.logInfo("Clicked on brand");
        test.log(Status.PASS,"Clicked on brand"); 
        }
        catch(Exception e){
            logs.logError("Clicked on brand");
            test.log(Status.FAIL, "Clicked on brand");
            Screenshot.takeScreenshot("src17");
            Reporter.attachScreenshotToReport("Brands", test, "src17");
    
        }
    }
   /*
    * Method Name : clickOnCarlex
    * Author Name : Krishna Reddy
    * Description : This method clicks on the Carlex in the Rings Page.
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnCarlex(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.carlex, 3);
        helper.clickOnElement(RingsPageLocators.carlex);
        logs.logInfo("Clicked on carlex");
        test.log(Status.PASS,"Clicked on carlex"); 
        }
        catch(Exception e){
            logs.logError("Clicked on carlex");
            test.log(Status.FAIL, "Clicked on carlex");
            Screenshot.takeScreenshot("src18");
            Reporter.attachScreenshotToReport("Brands", test, "src18");
    
        }
    }
     /*
    * Method Name : clickOnRings
    * Author Name : Krishna Reddy
    * Description : This method clicks on the Rings in the Rings Page.
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnRings(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.rings, 3);
        helper.clickOnElement(RingsPageLocators.rings);
        logs.logInfo("Clicked on rings");
        test.log(Status.PASS,"Clicked on rings");
        }
        catch(Exception e){
            logs.logError("Clicked on Rings");
            test.log(Status.FAIL, "Clicked on Rings");
            Screenshot.takeScreenshot("src19");
            Reporter.attachScreenshotToReport("Brands", test, "src19");
    
        }
    }
    /*
    * Method Name : clickOnForher
    * Author Name : Krishna Reddy
    * Description : This method clicks on the forher in the Rings Page.
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnForher(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.forher, 3);
        helper.clickOnElement(RingsPageLocators.forher);
        logs.logInfo("Clicked on forher");
        test.log(Status.PASS,"Clicked on forher");
        }
        catch(Exception e){
            logs.logError("Clicked on forher");
            test.log(Status.FAIL, "Clicked on forher");
            Screenshot.takeScreenshot("src20");
            Reporter.attachScreenshotToReport("Brands", test, "src20");
    
        }
    }
    /*
    * Method Name : clickOnFirst
    * Author Name : Krishna Reddy
    * Description : This method clicks on the first label  in the Rings Page.
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnFirst(){
        try{

        helper.clickOnElement(RingsPageLocators.first);
        logs.logInfo("Clicked on first");
        test.log(Status.PASS,"Clicked on first");
        }
        catch(Exception e){
            logs.logError("Clicked on first");
            test.log(Status.FAIL, "Clicked on first");
            Screenshot.takeScreenshot("src21");
            Reporter.attachScreenshotToReport("Brands", test, "src21");
    
        }
    }
      /*
    * Method Name : clickOnLive
    * Author Name : Krishna Reddy
    * Description : This method clicks on the Live Expert on the First label Page.
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnLive(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.live, 3);
        helper.clickOnElement(RingsPageLocators.live);
        logs.logInfo("Clicked on live");
        test.log(Status.PASS,"Clicked on live");
        Screenshot.takeScreenshot("src1");
        Reporter.attachScreenshotToReport("src1.png", test, "");
        }
        catch(Exception e){
            logs.logError("Clicked on live");
            test.log(Status.FAIL, "Clicked on live");
            Screenshot.takeScreenshot("src22");
            Reporter.attachScreenshotToReport("Brands", test, "src22");
    
        }
    }
     /*
    * Method Name : clickOnAccept
    * Author Name : Krishna Reddy
    * Description : This method clicks on the Accept cookies on the home Page.
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        logs.logInfo("Clicked on accept cookies");
        test.log(Status.PASS,"Clicked on accept cookies");
        }
        catch(Exception e){
            logs.logError("Clicked on accept cookies");
            test.log(Status.FAIL, "Clicked on accept cookies");
            Screenshot.takeScreenshot("src23");
            Reporter.attachScreenshotToReport("Brands", test, "src23");
    
        }
    }
     /*
    * Method Name : clickOnClose
    * Author Name : Krishna Reddy
    * Description : This method clicks on the close button of the pop-up on the home Page.
    * Parameters : N/A
    * Return Type : void
    */
    public void clickOnClose(){
        try{
        helper.clickOnElement(RingsPageLocators.close);
        logs.logInfo("Clicked on close");
        test.log(Status.PASS,"Clicked on close");
        logs.logInfo("Clicked on searc");
        test.log(Status.PASS,"Clicked on searc");
        }
        catch(Exception e){
            logs.logError("Clicked on close");
            test.log(Status.FAIL, "Clicked on close");
            Screenshot.takeScreenshot("src24");
            Reporter.attachScreenshotToReport("Brands", test, "src24");
    
        }
    }
     /*
    * Method Name : verifyRings
    * Author Name : Krishna Reddy
    * Description : This method verify the Rings title of the Rings page.
    * Parameters : N/A
    * Return Type : void
    */
    public void verifyRings(){
        try{
        asserts.verifyTitleOfPage("Rings");
        }
        catch(Exception e){
            logs.logError("Failed to verify Rings");
            test.log(Status.FAIL, "Failed to verify Rings");
            Screenshot.takeScreenshot("src25");
            Reporter.attachScreenshotToReport("Brands", test, "src25");
        }
        
    }
     /*
    * Method Name : ringsExecute
    * Author Name : Krishna Reddy
    * Description : This method clusters the methods which needs to be executed.
    * Parameters : N/A
    * Return Type : void
    */
    public void ringsExecute(){
        clickOnAccept();
        clickOnSearch();
        inputOnSearchBar();
        enterOnSearchbar();
        clickOnClose();
        clickOnRings();
        clickOnForher();
        clickOnForher();
        clickOnBrand();
        clickOnCarlex();
        clickOnFirst();
        clickOnLive();
        verifyRings();
    }
    
    
    

}