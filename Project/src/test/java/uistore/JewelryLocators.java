package uistore;

import org.openqa.selenium.By;

public class JewelryLocators {
    public static By jewelry = By.cssSelector("ul.rolloverArea > li:nth-child(6)");
    public static By logo = By.cssSelector("a>img[alt='Back to Home']");
    public static By chanel = By.xpath("(//a[text()='CHANEL'])[3]");
    public static By cate = By.xpath("//div[text()='Category']");
    public static By  rings = By.xpath("(//li[@class=' facetAction  '])[5]");
    public static By brandCol = By.xpath("//div[text()='Brand Collections']");
    public static By cocoRush = By.xpath("//div[text()='Coco Crush ']");
    public static By dial = By.xpath("//div[text()='Metal Type']");
    public static By whiteGold = By.xpath("//div[text()='White Gold ']");
    public static By firstPro = By.xpath("(//div[@class='productTileBrand'])[1]");
    public static By acceptCook = By.xpath("//button[text()='Accept All Cookies and Terms and Conditions']");
    public static By closePop = By.xpath("//div[@class='dismiss-popup']");
}
