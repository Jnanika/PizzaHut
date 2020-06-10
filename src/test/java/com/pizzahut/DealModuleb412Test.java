/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzahut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author manju
 */
public class DealModuleb412Test {
    private static Deal deal=null;
    
    public DealModuleb412Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        deal=ExcelFileUtil.getDealData();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDealDataDriven() throws InterruptedException{
        driver.get("http://www.pizzahut.com");
             Thread.sleep(7000);
        driver.findElement(By.id("lg-nav-deals")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("productATO0")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("find-occasion-carryout")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("zip-input")).sendKeys(String.valueOf(deal.getZipcode()));
        Thread.sleep(3000);
        driver.findElement(By.id("ph-find-store")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[@class='btn ph-ordernow ng-scope btn-primary']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("modal-button-OK")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'TOPPINGS')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Veggies')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='option-2-M-V']//div[@class='clearfix pb-opleft crust-pb-topping-select pb-opleft-toppings']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@id='modifier-M-M-R']//span[@class='pb-modifier-font ng-binding ng-scope'][contains(text(),'Regular')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Roasted Spinach')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("pb-primary-cta-deal")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block text-transform-none ng-binding']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("cart-quantity-icon")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("checkout-top-os")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("co-guest-login")).click();
        driver.findElement(By.id("firstName")).sendKeys(deal.getFirstname());
        Thread.sleep(1000);
        driver.findElement(By.id("lastName")).sendKeys(deal.getLastname());
        Thread.sleep(1000);
        driver.findElement(By.id("emailAddress")).sendKeys(deal.getEmailaddress());
        Thread.sleep(1000);
        driver.findElement(By.id("phoneNumber")).sendKeys(String.valueOf(deal.getPhonenumber()));
        Thread.sleep(1000);
        driver.findElement(By.id("phoneExtension")).sendKeys(String.valueOf(deal.getExtension()));
        Thread.sleep(1000);
        driver.findElement(By.id("checkoutSelectedDate")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("dateOption-3")).click();
                Thread.sleep(1000);
        driver.findElement(By.id("checkoutSelectedHour")).click();
                Thread.sleep(1000);

        driver.findElement(By.id("hourOption-3")).click();
                Thread.sleep(1000);


        driver.findElement(By.id("checkoutSelectedMinute")).click();
                Thread.sleep(1000);

        driver.findElement(By.id("minuteOption-1")).click();
                Thread.sleep(1000);

        driver.findElement(By.id("checkoutSelectedTime")).click();
                Thread.sleep(1000);

        driver.findElement(By.id("timeOption-0")).click();
                Thread.sleep(1000);

        
        driver.findElement(By.id("ph-co-2-continue")).click();
    }
}
