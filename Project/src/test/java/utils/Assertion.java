package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertion {
	private WebDriver driver;

	public Assertion(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyTextInPage(By locator, String value) {
		try {
			WebElement element = driver.findElement(locator);
			LoggerHandler.logInfo(element.getText());
			Assert.assertTrue(element.getText().contains(value));
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	public void verifyURLOfPage(String value) {
		try {
			String text = driver.getCurrentUrl();
			LoggerHandler.logInfo(text);
			Assert.assertTrue(text.contains(value));
		} catch (AssertionError e) {
			e.getStackTrace();
		}

	}

	public void verifyTitleOfPage(String value) {
		try {
			String text = driver.getTitle();
			LoggerHandler.logInfo(text);
			Assert.assertTrue(text.contains(value));
		} catch (AssertionError e) {
			e.getStackTrace();
		}

	}

}
