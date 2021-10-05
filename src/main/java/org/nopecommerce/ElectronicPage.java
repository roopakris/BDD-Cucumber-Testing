package org.nopecommerce;

import org.openqa.selenium.By;

public class ElectronicPage extends BasePage{

    public void selectAdevice() throws InterruptedException {
        Thread.sleep(20);
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
        Thread.sleep(20);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/h2/a")).click();
        Thread.sleep(20);
        driver.findElement(By.id("add-to-cart-button-16")).click();
        //String addtocartmessage= driver.findElement(By.className("bar-notification success")).getText();
        //String addtocartmessage = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/text()")).getText();
        System.out.println("Item is added to the basket");
    }

}
