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

    public static Deal getDealData() {
        Deal deal = null;

        try {
            //read excel file
            FileInputStream inputStream = new FileInputStream(new File("c:\\data\\Deal1.xlsx"));
        
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
            deal = new Deal(zipcode, firstname, lastname, emailaddress, phonenumber, extension);
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
