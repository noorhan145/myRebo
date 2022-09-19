package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NavigationBarPage extends BasePage {

    private By productsNavBar = By.xpath("//a[text()=\" Products\"]");

    public NavigationBarPage(WebDriver driver) {
        super(driver);
    }
    public AllProductPage clickProductsFromNavBar() {
        clickElement(productsNavBar);
        return new AllProductPage(driver);
    }
}
