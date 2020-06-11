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
public class DealDeliveryTest {
     private static CustomerDetailsVO cd=null;
     static int TIME_OUT_VALUE = 2000;
    
    public DealDeliveryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cd=ExcelFileUtil.getDealData();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDeliveryDeal() throws InterruptedException{
        driver.get("http://www.pizzahut.com");
           Thread.sleep(7000);
        driver.findElement(By.id("lg-nav-deals")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("productATO0")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("find-occasion-delivery")).click();
        driver.findElement(By.id("syo-address1")).sendKeys(cd.getAddress1());
        driver.findElement(By.id("address2")).sendKeys(cd.getAddress2());
        driver.findElement(By.id("city")).sendKeys(cd.getCity());
        driver.findElement(By.id("state")).sendKeys(cd.getState());
        driver.findElement(By.id("zip-input")).sendKeys(String.valueOf(cd.getZipcode()));
        driver.findElement(By.id("ph-find-store")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.xpath("//a[@class='btn ph-ordernow ng-scope btn-primary']")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.id("modal-button-OK")).click();
         Thread.sleep(TIME_OUT_VALUE);
         driver.findElement(By.id("modal-button-Ok")).click();
         Thread.sleep(TIME_OUT_VALUE);
         driver.findElement(By.id("ato-large-original-stuffed-crust-pizza--up-to-3-toppings-and-8-breaded-boneout-wings")).click();
         Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.xpath("//span[contains(text(),'TOPPINGS')]")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.xpath("//span[contains(text(),'Veggies')]")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.xpath("//div[@id='option-2-M-V']//div[@class='clearfix pb-opleft crust-pb-topping-select pb-opleft-toppings']")).click();
        Thread.sleep(TIME_OUT_VALUE);

        driver.findElement(By.xpath("//a[@id='modifier-M-M-R']//span[@class='pb-modifier-font ng-binding ng-scope'][contains(text(),'Regular')]")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.xpath("//span[contains(text(),'Roasted Spinach')]")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.id("pb-primary-cta-deal")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block text-transform-none ng-binding']")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.id("prod-breaded-boneout-wings")).click();
        Thread.sleep(TIME_OUT_VALUE);
        System.out.println("**** Data: "+driver.findElement(By.id("prod-breaded-boneout-wings")));
        driver.findElement(By.xpath("//option[contains(text(),'Honey BBQ')]")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.id("ato-breaded-boneout-wings")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.id("view-order-top-upsell")).click();
         Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.id("checkout-top-os")).click();
        Thread.sleep(TIME_OUT_VALUE);
        driver.findElement(By.id("co-guest-login")).click();
        Thread.sleep(TIME_OUT_VALUE);
         driver.findElement(By.id("firstName")).sendKeys(cd.getFirstname());
        Thread.sleep(1000);
        driver.findElement(By.id("lastName")).sendKeys(cd.getLastname());
        Thread.sleep(1000);
        driver.findElement(By.id("emailAddress")).sendKeys(cd.getEmailaddress());
        Thread.sleep(1000);
        driver.findElement(By.id("phoneNumber")).sendKeys(String.valueOf(cd.getPhonenumber()));
        Thread.sleep(1000);
        driver.findElement(By.id("phoneExtension")).sendKeys(String.valueOf(cd.getExtension()));
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
