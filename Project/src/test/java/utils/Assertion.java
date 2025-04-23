package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Assertion {
	private WebDriver driver;
	ExtentTest test;
	public Assertion(WebDriver driver) {
		this.driver = driver;
	}
    /*
     * Method Name : verifyTextInPage
     * Author Name : Pavan
     * Description : This method used to verify the text of a element
     * Parameters : locator , value
     * Return Type : void
     */
	public void verifyTextInPage(By locator, String value) {
		try {
			WebElement element = driver.findElement(locator);
			LoggerHandler.logInfo(element.getText());
			Assert.assertTrue(element.getText().contains(value));
			LoggerHandler.logInfo("Text verified");
			test.log(Status.PASS,"Text verified");
		} catch (AssertionError e) {
			LoggerHandler.logError("Text Invalid");
			test.log(Status.FAIL, "Text Invalid");
		}
	}
    /*
     * Method Name : verifyURLOfPage
     * Author Name : Pavan
     * Description : This method is used to verify the url of the website
     * Parameters : value
     * Return Type : void
     */
	public void verifyURLOfPage(String value) {
		try {
			String text = driver.getCurrentUrl();
			LoggerHandler.logInfo(text);
			Assert.assertTrue(text.contains(value));
			LoggerHandler.logInfo("URL verified");
			test.log(Status.PASS,"URL verified");
		} catch (AssertionError e) {
			LoggerHandler.logError("URL incorrect");
			test.log(Status.FAIL, "URL incorrect");
		}

	}
    /*
     * Method Name : verifyTitleOfPage
     * Author Name : Pavan
     * Description : This method is used to get the title of the page
     * Parameters : value
     * Return Type : void
     */
	public void verifyTitleOfPage(String value) {
		try {
			String text = driver.getTitle();
			LoggerHandler.logInfo(text);
			Assert.assertTrue(text.contains(value));
			LoggerHandler.logInfo("Title verified");
			test.log(Status.PASS,"Title verified");
		} catch (AssertionError e) {
			LoggerHandler.logError("Title of page is invalid");
			test.log(Status.FAIL, "Title of page is invalid");
		}

	}

}
