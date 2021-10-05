package org.nopecommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BasePage{
    Utils utils = new Utils();


    public void registration()throws InterruptedException{
        createinstanceOfDriver();
        utils.navigate();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Twoman");
        driver.findElement(By.id("LastName")).sendKeys("k");
        Thread.sleep(20);
        utils.dropDownSelectDate();

//    Select date = new Select(driver.findElement(By.name("DateOfBirthDay")));
//    date.selectByIndex(1);
//    Thread.sleep(20);
//    Select month1 = new Select(driver.findElement(By.name("DateOfBirthMonth")));
//    month1.selectByIndex(1);
//    Thread.sleep(20);

//        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
//        year.selectByIndex(1);





        driver.findElement(By.id("Email")).sendKeys("rss1@nope.com");
        driver.findElement(By.id("Password")).sendKeys("Twoman1");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Twoman1");
        driver.findElement(By.id("register-button")).click();

        String completionMessage = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).getText();
        Assert.assertEquals(completionMessage,"Your registration completed");
        System.out.println("Hurray registration is complete");
        utils.closeBrowser();
    }

}
