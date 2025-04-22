package pages;

import uistore.RingsPageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class RingsPageActions {
    public WebDriverHelper helper;
	public RingsPageActions() {
		helper = new WebDriverHelper(Base.driver);
		
	}
    public void clickOnSearch(){
        try{

        helper.waitForElementToBeVisible(RingsPageLocators.searchbar, 3);
        helper.clickOnElement(RingsPageLocators.searchbar);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void inputOnSearchBar(){
        try{
        
        helper.enterText(RingsPageLocators.searchbar, "Rings");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void enterOnSearchbar(){
        try{
        helper.enterAction(RingsPageLocators.searchbar);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnBrand(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.brand, 3);
        helper.clickOnElement(RingsPageLocators.brand);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnCarlex(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.carlex, 3);
        helper.clickOnElement(RingsPageLocators.carlex);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnRings(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.rings, 3);
        helper.clickOnElement(RingsPageLocators.rings);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnForher(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.forher, 3);
        helper.clickOnElement(RingsPageLocators.forher);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnFirst(){
        try{

        helper.clickOnElement(RingsPageLocators.first);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnLive(){
        try{
        helper.waitForElementToBeVisible(RingsPageLocators.live, 3);
        helper.clickOnElement(RingsPageLocators.live);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnAccept(){
        try{
        helper.clickOnElement(RingsPageLocators.accept);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void clickOnClose(){
        try{
        helper.clickOnElement(RingsPageLocators.close);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    

}