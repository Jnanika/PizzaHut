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
public class OrderDetailTest {

    WebDriver driver;

    public OrderDetailTest() {
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
        driver.manage().deleteAllCookies();
        driver.get("https://www.pizzahut.com/index.php#/home");
        //driver.switchTo().alert().dismiss();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void PizzaTest() throws InterruptedException {
        driver.findElement(By.id("heroImg")).click();

        boolean b = driver.
                findElement(By.xpath("//span[@class='center-block icon-carryout-default']")).isDisplayed();
        driver.findElement(By.xpath("//span[@class='center-block icon-carryout-default']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("zip-input")).sendKeys("60188");
        driver.findElement(By.id("ph-find-store")).click();
        driver.findElement(By.xpath("//a[@class='btn ph-ordernow ng-scope btn-primary']")).click();
        driver.findElement(By.id("modal-button-OK")).click();
    }
@Test
public void ToppingTest(){
     driver.findElement(By.xpath("//span[contains(text(),'TOPPINGS')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Veggies')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Mushrooms')]")).click();
    
    

}
}
