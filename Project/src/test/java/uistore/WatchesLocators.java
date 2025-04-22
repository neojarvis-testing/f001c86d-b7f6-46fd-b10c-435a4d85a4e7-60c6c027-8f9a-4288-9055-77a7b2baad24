package uistore;

import org.openqa.selenium.By;

public class WatchesLocators {
    public static By acceptOnCookies = By.xpath("//button[text()='Accept All Cookies and Terms and Conditions']");
    // public static By hoverOnWatches=By.cssSelector("ul[class='rolloverArea']>li[class='desktopMainNavNode']>a[href='/c/Watches/']");
    public static By hoverOnWatches=By.xpath("(//a[text()='Watches'])[1]");
    public static By clickOnBestSellers=By.xpath("//span[text()='Best Sellers']");
    // public static By clickOnBestSellers=By.cssSelector("a[href='/c/Watches/Best-Sellers']>span");
    public static By clickOnCross=By.xpath("//div[@class='dismiss-popup']");
    public static By clickOnForHim =By.xpath("(//li[@class=' facetAction  '])[6]");
    public static By clickOnCartier=By.xpath("//div[text()='Cartier ']");
    public static By clickOnDialColor=By.xpath("//div[text()='Dial Color']");
    public static By clickOnBlack=By.xpath("//div[text()='Black ']");
    public static By clickOnFirstProduct=By.xpath("//div[@class='productTileName']");
    public static By clickOnAdd=By.cssSelector("button[id='addToCartSubmit']");
}
