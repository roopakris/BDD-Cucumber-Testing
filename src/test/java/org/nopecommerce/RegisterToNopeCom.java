package org.nopecommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RegisterToNopeCom {

RegisterPage regsiter = new RegisterPage();
Utils utils = new Utils();

//@Test
    public void opentheapp() throws InterruptedException {

    regsiter.registration();
    utils.closeBrowser();

    }
}
