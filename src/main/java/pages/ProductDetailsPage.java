package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage{

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    // locators
    private By productTitle = By.cssSelector("div[class=\"productinfo text-center\"]>p");
    private By SearchedProductTitle = By.className("title");

    // operations
    public String getProductTitle ()
    {
        return getTextOfElement(productTitle);
    }

    public String getSearchedProductTitle ()
    {
        return getTextOfElement(SearchedProductTitle);
    }
}
