package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TC9_SearchProduct extends BaseTests_Parent{
    String searchPro = "Sleeveless Dress";

    @Test
    public void searchProductTest ()
    {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getColorOfHome(), "rgba(255, 165, 0, 1)");
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        AllProductPage allProductPage = navigationBarPage.clickProductsFromNavBar();
        Assert.assertEquals(allProductPage.getAllProductTitle(), "ALL PRODUCTS");
        ProductDetailsPage productDetailsPage = allProductPage.searchProduct(searchPro);
        Assert.assertEquals(productDetailsPage.getSearchedProductTitle(), "SEARCHED PRODUCTS");
        Assert.assertEquals(productDetailsPage.getProductTitle(), searchPro);

    }
}
