package uistore;

import org.openqa.selenium.By;

public class AboutUsPageLocators {
    public static By aboutMayors = By.cssSelector("li>a[href='/about-us']");
    public static By pressRoom = By.cssSelector("li>a[href='/press-media-enquiries']");
    public static By careers = By.cssSelector("li>a[href='https://usacareers.thewosgroup.com/jobs/divisions/mayors/']");
    public static By sustainability = By.cssSelector("li>a[href='/sustainability']");
    public static By newLet = By.cssSelector("li>a[href='/newsletter-sign-up']");
    public static By wedD = By.xpath("(//a[text()='Wedding'])[3]");
    public static By rolexx =By.xpath("(//a[text()='Rolex'])[6]");
    public static By brandS = By.xpath("(//a[text()='Brands'])[3]");
    public static By aboutUsVer = By.xpath("(//span[@class='desktopFooterSectionHeader'])[3]");
    
}
