package org.nopecommerce;

import org.testng.annotations.Test;

public class Electronicdevice {
    ElectronicPage electronicPage = new ElectronicPage();
    LoginPage loginPage = new LoginPage();
    Utils utils = new Utils();

   // @Test
    public void addtocart() throws InterruptedException {
        loginPage.loginToPage();
        electronicPage.selectAdevice();
        utils.closeBrowser();

    }
}
