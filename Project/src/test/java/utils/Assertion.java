package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertion {
private static  WebDriver driver;

	public static void verifyTextInPage(By locator,String value) {
		WebElement element = driver.findElement(locator);
		Assert.assertTrue(element.getText().contains(value));
	}
	
	public static  void verifyURLOfPage(String value) {
		String text = driver.getCurrentUrl();
		Assert.assertTrue(text.contains(value));
	}
	
	public static  void verifyTitleOfPage(String value) {
		String text = driver.getTitle();
		Assert.assertTrue(text.contains(value));
	}
   
}

