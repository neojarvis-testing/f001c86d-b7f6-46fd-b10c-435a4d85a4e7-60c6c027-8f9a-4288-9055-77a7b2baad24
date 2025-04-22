package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    public static By cookies = By.xpath("//button[text()='Accept All Cookies and Terms and Conditions']");
    public static By rolex = By.xpath("(//a[text()='Rolex'])[1]");
    public static By deepSea = By.xpath("//span[text()='Deepsea']");
    public static By menu = By.cssSelector(".menu-toggle");
    public static By rolexWatches = By.xpath("(//a[text()='Rolex watches'])[1]");
    public static By discoverWatches =By.xpath("//p[text()='Discover Rolex']");
    public static By newWatches =By.xpath("//p[text()='New watches 2025']");
    public static By watchMaking = By.xpath("//p[text()='Watchmaking']");
    public static By rolexText = By.xpath("//h1[@class='rlx-hl50 rlx-title-mg txt-rlx-brown']");
}
