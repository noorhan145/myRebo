package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By HomeLink = By.xpath("//a[text()=\" Home\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public String getColorOfHome ()
    {
        return getCssValueOfElement(HomeLink,"color");
    }

}
