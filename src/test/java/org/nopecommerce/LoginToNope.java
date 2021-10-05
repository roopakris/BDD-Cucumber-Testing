package org.nopecommerce;

import org.testng.annotations.Test;

public class LoginToNope {
LoginPage loginPage = new LoginPage();
Utils utils = new Utils();

   // @Test
    public void login()throws InterruptedException{
        ////login with invalid credentials and look for the error message//////////
        loginPage.ivalidlogin();
        /////////Lgoin with valid credentials and should login successfully////////////
        loginPage.loginToPage();
        utils.closeBrowser();

    }
}
