package org.nopecommerce;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;

public class OneCompleteJourney {
    LoginPage loginPage = new LoginPage();
    ElectronicPage electronicPage = new ElectronicPage();
//    Electronicdevice electronicdevice = new Electronicdevice();
    RegisterPage registerPage = new RegisterPage();
    ShoppingBasket shoppingBasket = new ShoppingBasket();
    Utils utils = new Utils();

//    @Test
    public void completejourney() throws InterruptedException {
        registerPage.registration();
        loginPage.loginToPage();
        electronicPage.selectAdevice();
        utils.closeBrowser();


    }
}
