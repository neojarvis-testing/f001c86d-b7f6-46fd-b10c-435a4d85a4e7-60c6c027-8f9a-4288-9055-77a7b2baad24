package pages;

import uistore.SearchLocators;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SearchActions {

    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    // public void verifyLogo() {

    // }

    public void clickOnAccept(){
        try{
        helper.clickOnElement(SearchLocators.acceptAndCookies);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void searchOperation() {
        try{
        helper.clickOnElement(SearchLocators.searchBar);
        helper.typeInElement(SearchLocators.searchBar, "Earrings");
        helper.enterAction(SearchLocators.searchBar);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    public void verifyEarrings() {
        // Assertion.

    }
    public void clickOnDismiss(){
        try{
        helper.clickOnElement(SearchLocators.dismiss);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    public void clickOnBrand() {
        try{
        helper.clickOnElement(SearchLocators.brand);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    public void clickOnGucci() {
        try{
        helper.clickOnElement(SearchLocators.gucci);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    public void clickOnMetalType() {
        try{
        helper.javascriptScroll(SearchLocators.metalType);
        helper.clickOnElement(SearchLocators.metalType);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    public void clickOnRoseGold() {
        try{
        helper.clickOnElement(SearchLocators.roseGold);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    public void clickOnEarRingsStyle() {
        try{
        helper.clickOnElement(SearchLocators.earRingStyle);
        helper.clickOnElement(SearchLocators.dropEarring);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

    }

    public void clickOnfirstProduct() {
        try{
        helper.clickOnElement(SearchLocators.firstProduct);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    public void clickOnGet() {
        try{
        helper.clickOnElement(SearchLocators.getLiveExpert);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }

    }

    public void getScreenshot() {
        try{
        Screenshot.takeScreenshot("Earrings");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

    public void search() {
        clickOnAccept();
        searchOperation();
        clickOnDismiss();
        clickOnBrand();
        clickOnGucci();
        clickOnMetalType();
        clickOnRoseGold();
        clickOnEarRingsStyle();
        clickOnfirstProduct();
        clickOnGet();
        getScreenshot();

    }
}
