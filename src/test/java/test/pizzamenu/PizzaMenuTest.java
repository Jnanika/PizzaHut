/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pizzamenu;





import java.awt.Menu;
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
 * @author moizr
 */
public class PizzaMenuTest {
    WebDriver driver;
    String baseUrl;
    private static Menu menu= null;
    
    public PizzaMenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\driver2\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl="https://www.pizzahut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    
    @After
    public void tearDown()throws InterruptedException {
        driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void testPizzaMenu() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(3000);        
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='dropdown-item ph-titlecase ph-more-font']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='tile-cheese-pizza']//a[@class='btn btn-primary btnModal']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='center-block icon-carryout-default']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("carryOutZip")).sendKeys("60107");
        Thread.sleep(3000);
        driver.findElement(By.id("ph-find-store")).click();   
        Thread.sleep(3000);        
        driver.findElement(By.xpath("//a[@class='btn ph-ordernow ng-scope btn-primary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("modal-button-OK")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ato-cheese-pizza")).click();
    
    }
}
