package org.nopecommerce;

import org.openqa.selenium.By;

public class ShoppingBasket extends BasePage{

    public void clearShoppingcart()throws InterruptedException{

        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        Thread.sleep(20);
        driver.findElement(By.className("qty-input")).clear();
        //driver.findElement(By.id("itemquantity11222")).clear();
        driver.findElement(By.name("updatecart")).click();
        String cartMessage = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div")).getText();
        System.out.println(cartMessage);
    }


}
