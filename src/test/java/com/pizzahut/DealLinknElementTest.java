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
public class DealLinknElementTest {
    static int TIME_OUT_VALUE = 2000;
    
    public DealLinknElementTest() {
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
    public void testDealLink() throws InterruptedException{
        driver.get("http://www.pizzahut.com");
        Thread.sleep(5000);
        driver.findElement(By.id("lg-nav-deals")).click();
        Thread.sleep(5000);
        
       assertEquals("Pizza Hut: Pizza Delivery | Pizza Carryout | Coupons | Wings & More", driver.getTitle());
    }
    @Test
    public void testElementsAvailablityinDeal() throws InterruptedException{
        
        driver.get("http://www.pizzahut.com");
        Thread.sleep(5000);
        boolean r=driver.findElement(By.id("lg-nav-deals")).isDisplayed();
        Thread.sleep(TIME_OUT_VALUE);
        System.out.println("*********Deal Element is displayed"+r);
        
        driver.findElement(By.id("lg-nav-deals")).click();
        Thread.sleep(TIME_OUT_VALUE);
        
        boolean r1=driver.findElement(By.id("productATO0")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element1 in Deal is displayed" +r1);
         Thread.sleep(TIME_OUT_VALUE);
         boolean e1=driver.findElement(By.id("productATO0")).isEnabled();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element1 in Deal is Enabled" +e1);
         Thread.sleep(TIME_OUT_VALUE);
          boolean s1=driver.findElement(By.id("productATO0")).isSelected();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element1 in Deal is Selected" +s1);
         
         boolean r3=driver.findElement(By.id("productATO1")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element2 in Deal is displayed" +r3);
         Thread.sleep(TIME_OUT_VALUE);
         boolean e3=driver.findElement(By.id("productATO1")).isEnabled();
         Thread.sleep(TIME_OUT_VALUE);
        System.out.println("********Element2 in Deal is Enabled" +e3);
        Thread.sleep(TIME_OUT_VALUE);
        boolean s3=driver.findElement(By.id("productATO1")).isSelected();
        Thread.sleep(TIME_OUT_VALUE);
        System.out.println("********Element2 in Deal is Selected" +s3);
        
        
       boolean r2= driver.findElement(By.id("productATO2")).isDisplayed();
       Thread.sleep(TIME_OUT_VALUE);
       System.out.println("********Element3 in Deal is displayed" +r1);
       Thread.sleep(TIME_OUT_VALUE);
       boolean e2= driver.findElement(By.id("productATO2")).isEnabled();
       Thread.sleep(TIME_OUT_VALUE);
       System.out.println("********Element3 in Deal is Enabled" +e2);
       Thread.sleep(TIME_OUT_VALUE);
       boolean s2= driver.findElement(By.id("productATO2")).isSelected();
       Thread.sleep(TIME_OUT_VALUE);
       System.out.println("********Element3 in Deal is Selected" +s2);
       
        boolean r5=driver.findElement(By.id("productATO3")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element4 in Deal is displayed" +r5);
         Thread.sleep(TIME_OUT_VALUE);
         boolean e5=driver.findElement(By.id("productATO3")).isEnabled();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element4 in Deal is Enabled" +e5);
         Thread.sleep(TIME_OUT_VALUE);
         boolean s5=driver.findElement(By.id("productATO3")).isSelected();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element4 in Deal is Selected" +s5);
         
         boolean r6=driver.findElement(By.id("productATO4")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element5 in Deal is displayed" +r6);
         Thread.sleep(TIME_OUT_VALUE);
         boolean e6=driver.findElement(By.id("productATO4")).isEnabled();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element5 in Deal is Enabled" +e6);
         Thread.sleep(TIME_OUT_VALUE);
         boolean s6=driver.findElement(By.id("productATO4")).isSelected();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element5 in Deal is Selected" +s6);
         
         boolean r7=driver.findElement(By.id("productATO5")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element6 in Deal is displayed" +r7);
         Thread.sleep(TIME_OUT_VALUE);
         boolean e7=driver.findElement(By.id("productATO5")).isEnabled();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element6 in Deal is Enabled" +e7);
         Thread.sleep(TIME_OUT_VALUE);
         boolean s7=driver.findElement(By.id("productATO5")).isSelected();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element6 in Deal is Selected" +s7);
         
         boolean r8=driver.findElement(By.id("productATO6")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element7 in Deal is displayed" +r8);
         Thread.sleep(TIME_OUT_VALUE);
         boolean e8=driver.findElement(By.id("productATO6")).isEnabled();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element7 in Deal is Enabled" +e8);
         Thread.sleep(TIME_OUT_VALUE);
         boolean s8=driver.findElement(By.id("productATO6")).isSelected();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element7 in Deal is Selected" +s8);
         
         
         boolean r9=driver.findElement(By.id("productATO7")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element8 in Deal is displayed" +r9);
         Thread.sleep(TIME_OUT_VALUE);
         boolean e9=driver.findElement(By.id("productATO7")).isEnabled();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element8 in Deal is Enabled" +e9);
         Thread.sleep(TIME_OUT_VALUE);
         boolean s9=driver.findElement(By.id("productATO7")).isSelected();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element8 in Deal is Selected" +s9);
         
         boolean r10=driver.findElement(By.id("productATO8")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element9 in Deal is displayed" +r10);
         Thread.sleep(TIME_OUT_VALUE);
          boolean e10=driver.findElement(By.id("productATO8")).isEnabled();
          Thread.sleep(TIME_OUT_VALUE);
          System.out.println("********Element9 in Deal is Enabled" +e10);
          Thread.sleep(TIME_OUT_VALUE);
          boolean s10=driver.findElement(By.id("productATO8")).isSelected();
          Thread.sleep(TIME_OUT_VALUE);
          System.out.println("********Element9 in Deal is Selected" +s10);
          
         boolean r11=driver.findElement(By.id("productATO9")).isDisplayed();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element10 in Deal is displayed" +r11);
         Thread.sleep(TIME_OUT_VALUE);
         boolean e11=driver.findElement(By.id("productATO9")).isEnabled();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element10 in Deal is Enabled" +e11);
         Thread.sleep(TIME_OUT_VALUE);
         boolean s11=driver.findElement(By.id("productATO9")).isSelected();
         Thread.sleep(TIME_OUT_VALUE);
         System.out.println("********Element10 in Deal is Selected" +s11);
    }
    
}
