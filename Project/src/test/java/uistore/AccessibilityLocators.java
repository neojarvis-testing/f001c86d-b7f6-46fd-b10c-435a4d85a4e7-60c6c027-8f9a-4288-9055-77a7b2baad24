package uistore;

import org.openqa.selenium.By;

public class AccessibilityLocators {

    public static By acceptCookies = By.xpath("//button[text()='Accept All Cookies and Terms and Conditions']");
    public static By yourSecurity = By.cssSelector("li>a[href='/your-security']");
    // public static By termsConditions = By.xpath("//a[@href='/terms-and-conditions']");//whichever one is with href change it to cssSelector
    public static By termsConditions = By.cssSelector("li>a[href='/terms-and-conditions']");
    //public static By privacyPolicy = By.xpath("(//a[@href='/privacy-policy'])[2]");
    public static By privacyPolicy = By.xpath("(//a[@href='/privacy-policy'])[2]");
    public static By cookiePolicy = By.xpath("(//a[@href='/privacy-policy#cookies'])[1]");
    //public static By accessibility = By.xpath("//a[@href='/accessibility']");
    public static By accessibility = By.cssSelector("li>a[href='/accessibility']");
    public static By payByLinkTerms = By.xpath("//a[text()='PayByLink Terms']");
    public static By watches = By.xpath("(//a[text()='Watches'])[3]");
    public static By jewellery = By.xpath("(//a[text()='Jewelry'])[3]");
    public static By categoryKeyword = By.xpath("//div[text()='Category']");
}
