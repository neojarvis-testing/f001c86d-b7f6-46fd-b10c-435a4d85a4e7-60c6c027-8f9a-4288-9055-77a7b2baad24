package uistore;

import org.openqa.selenium.By;

public class BraceletsLocators {

    public static By wedding = By.xpath("(//a[text()='Wedding'])[1]");
    public static By bracelets = By.xpath("(//a[text()='Bracelets'])[2]");
    public static By acceptAndCookies =By.cssSelector("#onetrust-accept-btn-handler");
    public static By verJewelry = By.xpath("//li[text()='Wedding Jewelry']");
    public static By dismiss =By.xpath("//div[@class='dismiss-popup']");

    public static By metalType = By.xpath("//div[text()='Metal Type']");

    public static By yellowGold = By.xpath("//div[text()='Yellow Gold ']");

    public static By gemstone = By.xpath("//div[text()='Gem Stone']");

    public static By diamond = By.xpath("(//div[text()='Diamond '])[1]");

    public static By braceletStyle = By.xpath("//div[text()='Bracelet Style']");

    public static By brace = By.xpath("(//div[text()='Bracelets '])[2]");

    public static By firstPro = By.xpath("//div[text()='18k Yellow Gold My Twin Toi & Moi 0.35cttw Diamond Wire Memory bracelet Size Medium']");

    public static By addToShopping = By.cssSelector("#addToCartSubmit");
}
