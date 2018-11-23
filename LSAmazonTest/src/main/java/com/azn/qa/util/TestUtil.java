package com.azn.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
		static public long PAGE_LOAD_TIMEOUT = 20;
		static public long IMPLECIT_TIMEOUT = 10;	
		//public static String TESTDATA_SHEET_PATH = "/LSAmazonTest/src/main/java/com/azn/qa/testdata/testdata.xlsx";
		public static String TESTDATA_SHEET_PATH = "C:\\Mohan\\SeleniumLearning\\LSAmazonTest\\src\\main\\java\\com\\azn\\qa\\testdata\\testdata.xlsx";
		
		static Workbook book;
		static Sheet sheet;
		
		public static Object[][] getTestDataFromExcel(String sheetName){
			FileInputStream file =null;
			try {
				file = new FileInputStream(TESTDATA_SHEET_PATH);	
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				book = WorkbookFactory.create(file);
			} catch (InvalidFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			sheet = book.getSheet(sheetName);
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i< sheet.getLastRowNum();i++) {
				for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				//	System.out.println("data from util" + sheet.getRow(i+1).getCell(k));
					data[i][k]=sheet.getRow(i+1).getCell(k).toString();
					//System.out.println(sheet.getd + "Row Number" + + "and Column number " + );
					
				}
				
			}
			System.out.println("util has done???????????");

			return data;
			
		}
}

