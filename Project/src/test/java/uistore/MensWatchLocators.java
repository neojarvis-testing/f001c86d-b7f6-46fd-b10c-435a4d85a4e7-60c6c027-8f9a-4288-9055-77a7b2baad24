package uistore;

import org.openqa.selenium.By;

public class MensWatchLocators {

    public static By acceptCookies = By.xpath("//button[text()='Accept All Cookies and Terms and Conditions']");
    public static By brands = By.cssSelector("a[href='/c/Brands']");
    public static By omega = By.xpath("(//a[@href='/c/Brands/Omega'])[2]");
    public static By mensWatches = By.xpath("(//p[text()='Mens Watches'])[3]");
    public static By seaMasterFilter = By.xpath("//div[text()='Seamaster ']");
    public static By blueFilter = By.xpath("//div[text()='Blue ']");
    public static By firstProduct = By.xpath("(//div[text()='Seamaster Diver 300M Co-Axial Master Chronometer 42mm Summer Blue'])[1]");
    public static By addToCart = By.id("addToCartSubmit");
    public static By textVerify = By.xpath("//span[text()='Gift Wrap Available In-Store']");
    
}
