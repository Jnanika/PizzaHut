/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author moizr
 */
public class FileUtil {

    public static Menu getMenuData() {
        Menu menu = null;

        try {
            //read excel file
            FileInputStream inputStream = new FileInputStream(new File("C:\\data\\Menu.xlsx"));
            
            Workbook workbook = new XSSFWorkbook (inputStream);
            //getting first worksheet
            Sheet firstSheet = workbook.getSheetAt(0);
            //get first row
            Row r = firstSheet.getRow(1);
            Cell c = r.getCell(0);//zipcode value
            long zipcode = (long)c.getNumericCellValue(); 
            
            c = r.getCell(1);//zipcode value            
            String address = c.getStringCellValue();
            
            c = r.getCell(2);
            String city = c.getStringCellValue();
            
            c = r.getCell(3);
            String state = c.getStringCellValue();
            
            
            menu = new Menu(zipcode, address, city, state);
            
            System.out.println(menu);
            inputStream.close();
            
        }catch(IOException e){
            System.out.println("Error:"+e.toString());
        }
        return menu;
    }

    
    public static void main(String[] args) {
        FileUtil.getMenuData();
    }

}
