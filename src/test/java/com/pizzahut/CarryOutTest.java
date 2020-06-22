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
public class CarryOutTest {
    private static int Time_out=2000;
    
    public CarryOutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    public void testCarryOutFunctionality() throws InterruptedException{
        driver.get("http://www.pizzahut.com");
             Thread.sleep(7000);
        driver.findElement(By.id("lg-nav-deals")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("productATO0")).click();
        Thread.sleep(5000);
        boolean b1=driver.findElement(By.id("find-occasion-carryout")).isDisplayed();
        System.out.println("********Carryout Button is Displayed" +b1);
        Thread.sleep(Time_out);
        boolean b3=driver.findElement(By.id("find-occasion-carryout")).isEnabled();
        System.out.println("********Carryout Button is Enabled" +b3);
        Thread.sleep(Time_out);
        boolean b4=driver.findElement(By.id("find-occasion-carryout")).isSelected();
        System.out.println("********Carryout Button is Selected" +b4);
        Thread.sleep(Time_out);
        driver.findElement(By.id("find-occasion-carryout")).click();
        Thread.sleep(Time_out);
        System.out.println("********Carryout Button is Selected" +b4);
        Thread.sleep(Time_out);
        
        boolean b2=driver.findElement(By.id("zip-input")).isDisplayed();
        Thread.sleep(Time_out);
        System.out.println("********ZipCode Button is Displayed" +b2);
        Thread.sleep(Time_out);
        boolean b5=driver.findElement(By.id("zip-input")).isEnabled();
        Thread.sleep(Time_out);
        System.out.println("********ZipCode Button is Enabled" +b5);
        Thread.sleep(Time_out);
        boolean b6=driver.findElement(By.id("zip-input")).isSelected();
        Thread.sleep(Time_out);
        System.out.println("********ZipCode Button is Selected" +b6);
        Thread.sleep(Time_out);
        driver.findElement(By.id("zip-input")).click();
        Thread.sleep(Time_out);
        boolean b7= driver.findElement(By.id("zip-input")).isSelected();
        Thread.sleep(Time_out);
        System.out.println("********ZipCode Button is Selected" +b7);
        //driver.findElement(By.id("zip-input")).sendKeys("");
        
       // driver.get
    }
}
