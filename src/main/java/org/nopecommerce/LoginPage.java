package org.nopecommerce;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
     Utils utils = new Utils();
    public void loginToPage()throws InterruptedException{
        createinstanceOfDriver();
        utils.navigate();
        Thread.sleep(20);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("rss1@nope.com");
        driver.findElement(By.id("Password")).sendKeys("Twoman1");
        Thread.sleep(20);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
       System.out.println("Hurray you have logged into nope");

    }
    public void ivalidlogin()throws InterruptedException{
        createinstanceOfDriver();
        //utils.navigate();
        utils.navigate();
        Thread.sleep(20);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("rtvs@nope.com");
        driver.findElement(By.id("Password")).sendKeys("Twoman1");
        Thread.sleep(20);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        String errormessage =driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
       System.out.println(errormessage);
    }


}
