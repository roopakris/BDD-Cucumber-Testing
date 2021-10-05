package org.nopecommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {




    public static WebDriver driver;

    public static void createinstanceOfDriver()
    {


        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println("From BasPage page");

    }

//    public static void closeBrowser(){
//
//        driver.close();
//    }
}
