/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pizzhut;

import java.util.concurrent.TimeUnit;
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
 * @author virad
 */
public class LogoTest {

    WebDriver driver;

    public LogoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\QA\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.pizzahut.com/index.php#/home");

    }

    @After
    public void tearDown() {
        driver.quit();

    }

    @Test

    public void LogoVisibleTest() {
        
        
        boolean logoEnable = driver.findElement(By.id("ph-logo-small")).isEnabled();
        boolean logoPresent = driver.findElement(By.id("ph-logo-small")).isDisplayed();
        assertTrue("Pizza Hut logo", logoPresent);
        
        
        System.out.println("logo is present");
        
        
        
 

        
    }
}
