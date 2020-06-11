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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author manju
 */
public class DealModulea12Test {
    private static CustomerDetailsVO deal=null;
    
    public DealModulea12Test() {
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
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void Deala12Test(){
       driver.get("http://www.pizzahut.com");
   }
}
