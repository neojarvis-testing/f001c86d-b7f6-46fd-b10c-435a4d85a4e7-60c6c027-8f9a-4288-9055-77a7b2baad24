package pages;

import java.time.Duration;

import uistore.JewelryLocators;
import utils.Assertion;
import utils.Base;
import utils.WebDriverHelper;

public class JewelryPage extends Base{
    public WebDriverHelper helper;
    public JewelryPage()
    {
        helper = new WebDriverHelper(driver);

    }

    public void verifyLogo()
    {
        Assertion.verifyTextInPage(JewelryLocators.logo,"");
    }

    public void jewelryHoverAndChanelClick()
    {
        helper.hoverOverElement(JewelryLocators.acceptCook);
        helper.clickOnElement(JewelryLocators.acceptCook);
        helper.hoverOverElement(JewelryLocators.jewelry);
        helper.hoverOverElement(JewelryLocators.chanel);
        helper.clickOnElement(JewelryLocators.chanel);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }
    public void verifyChanel()
    {
        // Assertion.verifyTitleOfPage("Chanel");
    }

    public void clickOnRings()
    {
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        helper.clickOnElement(JewelryLocators.closePop);
        helper.hoverOverElement(JewelryLocators.rings);
        helper.clickOnElement(JewelryLocators.rings);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
    public void clickOnBrandAndCoco()
    {
        helper.clickOnElement(JewelryLocators.brandCol);
        helper.hoverOverElement(JewelryLocators.cocoRush);
        helper.clickOnElement(JewelryLocators.cocoRush);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    public void clickOnMetalType()
    {
        helper.clickOnElement(JewelryLocators.dial);
        helper.hoverOverElement(JewelryLocators.whiteGold);
        helper.clickOnElement(JewelryLocators.whiteGold);
        Base.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    public void clickOnFirst()
    {
        helper.hoverOverElement(JewelryLocators.firstPro);
        helper.clickOnElement(JewelryLocators.firstPro);

    }

    public void test4()
    {
        jewelryHoverAndChanelClick();
        // verifyChanel();
        clickOnRings();
        clickOnBrandAndCoco();
        clickOnMetalType();
        clickOnFirst();
    }
}
