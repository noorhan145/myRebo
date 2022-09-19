package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TC12_AddProductsInCart extends BaseTests_Parent{
    @Test
    public void addProductInCartTest ()
    {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getColorOfHome(), "rgba(255, 165, 0, 1)");
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        AllProductPage allProductPage = navigationBarPage.clickProductsFromNavBar();
        String productName0 = allProductPage.getProductName(0);
        String productName1 = allProductPage.getProductName(1);
        String productPrice0 = allProductPage.getProductPrice(0);
        String productPrice1 = allProductPage.getProductPrice(1);
        allProductPage.addToCart(0);
        allProductPage.clickContinueShopping();
        allProductPage.addToCart(1);
        allProductPage.clickViewCart();
        ViewCartPage viewCartPage = new ViewCartPage(driver);
        Assert.assertEquals(productName0, viewCartPage.getProductName(0));
        Assert.assertEquals(productName1, viewCartPage.getProductName(1));
        Assert.assertEquals(productPrice0, viewCartPage.getProductPrice(0));
        Assert.assertEquals(productPrice1, viewCartPage.getProductPrice(1));
        Assert.assertEquals(viewCartPage.getProductQuantity(0), "1");
        Assert.assertEquals(viewCartPage.getProductQuantity(1), "1");
        Assert.assertEquals(viewCartPage.getProductPrice(0), viewCartPage.getTotalPrice(0));
        Assert.assertEquals(viewCartPage.getProductPrice(1), viewCartPage.getTotalPrice(1));

    }
}
