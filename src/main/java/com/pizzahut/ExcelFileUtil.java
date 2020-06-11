/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzahut;

import org.apache.poi.ss.usermodel.Cell;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author manju
 */
public class ExcelFileUtil {

    public static CustomerDetailsVO getDealData() {
        CustomerDetailsVO deal = null;

        try {
            //read excel file
            FileInputStream inputStream = new FileInputStream(new File("c:\\data\\CustomerDetails.xlsx"));
        
            Workbook workbook = new XSSFWorkbook(inputStream);
            //getting first worksheet
            Sheet firstSheet = workbook.getSheetAt(0);
            //get first row
            Row r = firstSheet.getRow(1);
            Cell c = r.getCell(0); //username value
            //double zipcode  = c.getStringCellValue();
            long zipcode = (long) c.getNumericCellValue();
            c = r.getCell(1); //username value
            String firstname = c.getStringCellValue();

            c = r.getCell(2);
            String lastname = c.getStringCellValue();

            c = r.getCell(3);
            String emailaddress = c.getStringCellValue();

            c = r.getCell(4);
            long phonenumber = (long) c.getNumericCellValue();
            
            c = r.getCell(5);
            int extension = (int) c.getNumericCellValue();
            
             c = r.getCell(6);
            String address1 = (String) c.getStringCellValue();
            
            c = r.getCell(7);
            String address2 = (String) c.getStringCellValue();
            
            c = r.getCell(8);
            String city = (String) c.getStringCellValue();
            
            c = r.getCell(9);
            String state = (String) c.getStringCellValue();
            
            deal = new CustomerDetailsVO(zipcode, firstname, lastname, emailaddress, phonenumber, extension,address1,address2,city,state);
            System.out.println(deal);
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Error:"+e.toString());
        }
        return deal;

    }

    public static void main(String[] args) {
        ExcelFileUtil.getDealData();
    }

}
