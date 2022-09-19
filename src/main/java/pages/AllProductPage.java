package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllProductPage extends BasePage{
    private By allProductsTitle = By.className("title");
    private By searchField = By.id("search_product") ;
    private By searchBtn = By.id("submit_search") ;
    private List<WebElement> productDiv = driver.findElements(By.xpath("//div[@class=\"product-overlay\"]"));

    private List<WebElement> addCartBtn = driver.findElements(By.xpath("//div[@class=\"product-overlay\"]//a"));

    //private  By addCartBtn = By.xpath("(//a[contains(@class,'add-to-cart')])");

    private By contShoppingBtn = By.className("btn-success");
    private By viewCartBtn = By.cssSelector("div[class=\"modal-body\"] a");
    private List<WebElement> productName = driver.findElements(By.xpath("//div[@class=\"productinfo text-center\"]/p"));
    private List<WebElement> productPrice = driver.findElements(By.xpath("//div[@class=\"productinfo text-center\"]/h2"));



    public AllProductPage(WebDriver driver) {
        super(driver);
    }

    public String getAllProductTitle ()
    {
        return getTextOfElement(allProductsTitle);
    }
    public ProductDetailsPage searchProduct(String productName) {
        typeOnInputField(searchField, productName );
        clickElement(searchBtn);
        return new ProductDetailsPage(driver);
    }

    public String getProductName (int proIndex)
    {
        return productName.get(proIndex).getText();
    }

    public String getProductPrice (int proIndex)
    {
        return productPrice.get(proIndex).getText();
    }

    public void addToCart(int proIndex){
        actions.moveToElement(productDiv.get(proIndex));
        actions.perform();
        //hoverOnElement(productDiv,proIndex);
        addCartBtn.get(proIndex).click();
    }

    public void clickContinueShopping(){
        clickElement(contShoppingBtn);
    }

    public ViewCartPage clickViewCart(){
        clickElement(viewCartBtn);
        return new ViewCartPage(driver);
    }

}
