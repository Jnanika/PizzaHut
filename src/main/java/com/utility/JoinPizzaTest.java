/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author virad
 */
public class JoinPizzaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.pizzahut.com/index.php#/hutrewards-Registration");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("ph-sign-in")).click();
        WebElement email = driver.findElement(By.id("email_signIn"));
        Thread.sleep(5000);
        WebElement password = driver.findElement(By.name("password"));

        Xls_Reader reader = new Xls_Reader("c:\\data\\pizzahut.xlsx");

        String sheetName = "sign up";

        int rowCount = reader.getRowCount(sheetName);

        String data = reader.getCellData(sheetName, 0, 2);
        System.out.println(data);

        //  int rowCount= reader.getRowCount(sheetName);
        System.out.println("total rows= " + rowCount);

        reader.addColumn(sheetName, "status");// to add colum

        reader.addSheet("join1");// add new sheet in the excel

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            String eId = reader.getCellData(sheetName, "email", rowNum);
            String pass = reader.getCellData(sheetName, "password", rowNum);

            System.out.println(eId + "" + pass);

            email.clear();
            email.sendKeys(eId);
            
          

            password.clear();
            password.sendKeys(pass);

        }

    }
}
