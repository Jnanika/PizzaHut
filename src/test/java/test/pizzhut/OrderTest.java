/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pizzhut;

import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void OrderPizzaTest() throws InterruptedException {
        driver.get("https://www.pizzahut.com/");
        boolean b1 = driver.findElement(By.id("heroImg")).isDisplayed();
        Thread.sleep(4000);
        System.out.println("#########pizza image is displayed ######" + b1);
        driver.findElement(By.id("heroImg")).click();
        Thread.sleep(2000);

        boolean b2 = driver.findElement(By.xpath("//span[@class='center-block icon-carryout-default']")).isEnabled();
        driver.findElement(By.xpath("//span[@class='center-block icon-carryout-default']")).click();
        Thread.sleep(3000);
        System.out.println("**carry out icon is enable**" + b2);

        driver.findElement(By.id("zip-input")).sendKeys("60188");
        driver.findElement(By.id("ph-find-store")).click();
        Thread.sleep(2000);

        boolean b3 = driver.findElement(By.xpath("//a[@class='btn ph-ordernow ng-scope btn-primary']")).isDisplayed();
        driver.findElement(By.xpath("//a[@class='btn ph-ordernow ng-scope btn-primary']")).click();
        Thread.sleep(3000);
        System.out.println("***ordernow id diplayed**" + b3);

        boolean b4 = driver.findElement(By.id("modal-button-OK")).isDisplayed();
        driver.findElement(By.id("modal-button-OK")).click();
        Thread.sleep(3000);
        System.out.println("***clicked on ok buton**" + b4);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'TOPPINGS')]")));

//        boolean b5 = driver.findElement(By.xpath("//span[contains(text(),'TOPPINGS')]")).isEnabled();
//        driver.findElement(By.xpath("//span[contains(text(),'TOPPINGS')]")).click();
//        System.out.println("**topping button is selected**"+b5);
        boolean b6 = driver.findElement(By.xpath("//span[contains(text(),'Veggies')]")).isEnabled();
        driver.findElement(By.xpath("//span[contains(text(),'Veggies')]")).click();
        Thread.sleep(2000);
        System.out.println("**clicked on veggies**" + b6);

        boolean b7 = driver.findElement(By.xpath("//span[contains(text(),'Mushrooms')]")).isSelected();
        driver.findElement(By.xpath("//span[contains(text(),'Mushrooms')]")).click();
        Thread.sleep(2000);
        System.out.println("**mashroom is selected**" + b7);
        //driver.findElement(By.xpath("//a[@id='modifier-M-M-R']//span[contains(text(),'Regular')]")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Roasted Spinach')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Banana Peppers')]")).click();
        Thread.sleep(2000);

        boolean b8 = driver.findElement(By.id("pb-primary-cta-deal")).isDisplayed();
        driver.findElement(By.id("pb-primary-cta-deal")).click();
        System.out.println("**continue for the order**" + b8);
        Thread.sleep(2000);

        boolean b9 = driver.findElement(By.xpath("//a[contains(text(),'No thanks')]")).isEnabled();
        driver.findElement(By.xpath("//a[contains(text(),'No thanks')]")).click();
        System.out.println("**no thanks for extra cheese**" + b9);

        boolean b10 = driver.findElement(By.id("view-order-top-upsell")).isDisplayed();
        driver.findElement(By.id("view-order-top-upsell")).click();
        System.out.println("**view order**" + b10);
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='checkout-top-os']")).click();
        driver.findElement(By.id("email_signIn")).clear();
        driver.findElement(By.id("email_signIn")).sendKeys("sheta@abc.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//div[contains(@class,'content ph-content-view')]//router-outlet")).click();
        driver.findElement(By.id("//button[@id='ph-login']")).click();

    }
}
