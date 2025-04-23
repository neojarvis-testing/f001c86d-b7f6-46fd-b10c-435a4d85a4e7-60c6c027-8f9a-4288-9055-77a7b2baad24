package uistore;

import org.openqa.selenium.By;

public class AccessibilityLocators {

    public static By acceptCookies = By.xpath("//button[text()='Accept All Cookies and Terms and Conditions']");
    public static By yourSecurity = By.xpath("//a[@href='/your-security']");
    public static By termsConditions = By.xpath("//a[@href='/terms-and-conditions']");
    public static By privacyPolicy = By.xpath("(//a[@href='/privacy-policy'])[2]");
    public static By cookiePolicy = By.xpath("(//a[@href='/privacy-policy#cookies'])[1]");
    public static By accessibility = By.xpath("//a[@href='/accessibility']");
    public static By payByLinkTerms = By.xpath("//a[text()='PayByLink Terms']");
    public static By watches = By.xpath("(//a[text()='Watches'])`[3]");
    public static By jewellery = By.xpath("(//a[text()='Jewelry'])[3]");
    public static By categoryKeyword = By.xpath("//div[text()='Category']");

}
