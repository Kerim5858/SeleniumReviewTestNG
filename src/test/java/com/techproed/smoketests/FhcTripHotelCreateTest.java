package com.techproed.smoketests;

import com.techproed.pages.FhcTripHotelCreatePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FhcTripHotelCreateTest extends TestBase {

    FhcTripHotelCreatePage createPage = new FhcTripHotelCreatePage(driver);

    @BeforeMethod
    public void beforeMethod() {
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void test() throws InterruptedException {
        FhcTripHotelCreatePage createPage = new FhcTripHotelCreatePage(driver);

        createPage.Code.sendKeys("123456");
        createPage.Name.sendKeys("ali");
        createPage.Address.sendKeys("America");
        createPage.Email.sendKeys("abc@gmail.com");
        createPage.Phone.sendKeys("123456789");
        Select select = new Select(createPage.IDGroup);
        select.selectByIndex(1);
        createPage.button.click();



        WebDriverWait wait = new WebDriverWait(driver,60);
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bootbox-body")));
        Assert.assertTrue(createPage.successMessage.isDisplayed());

    }
}