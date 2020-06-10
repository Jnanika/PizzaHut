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
public class OrderTest {
    WebDriver driver;
    
    public OrderTest() {
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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void TestLogin() {
        driver.get("https://www.pizzahut.com/");
        driver.findElement(By.id("heroImg")).click();
        driver.findElement(By.xpath("//span[@class='center-block icon-carryout-default']")).click();
        driver.findElement(By.id("zip-input")).sendKeys("60188");
        driver.findElement(By.id("ph-find-store")).click();
        driver.findElement(By.xpath("//a[@class='btn ph-ordernow ng-scope btn-primary']")).click();
        driver.findElement(By.id("modal-button-OK")).click();
        driver.findElement(By.xpath("//span[contains(text(),'TOPPINGS')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Veggies')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Mushrooms')]")).click();
        //driver.findElement(By.xpath("//a[@id='modifier-M-M-R']//span[contains(text(),'Regular')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Roasted Spinach')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Banana Peppers')]")).click();
        driver.findElement(By.id("pb-primary-cta-deal")).click();
        driver.findElement(By.xpath("//a[contains(text(),'No thanks')]")).click();
        driver.findElement(By.id("view-order-top-upsell")).click();
        driver.findElement(By.xpath("//a[@id='checkout-top-os']")).click();
        driver.findElement(By.id("email_signIn")).clear();
        driver.findElement(By.id("email_signIn")).sendKeys("sheta@abc.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//div[contains(@class,'content ph-content-view')]//router-outlet")).click();
        driver.findElement(By.id("//button[@id='ph-login']")).click();

    }
}
