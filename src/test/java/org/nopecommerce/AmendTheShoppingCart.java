package org.nopecommerce;

import org.testng.annotations.Test;

public class AmendTheShoppingCart {
    ShoppingBasket shoppingBasket = new ShoppingBasket();
    LoginPage loginPage = new LoginPage();

  //  @Test
    public void amendTheShopping() throws InterruptedException {
        loginPage.loginToPage();
        shoppingBasket.clearShoppingcart();
    }
}
