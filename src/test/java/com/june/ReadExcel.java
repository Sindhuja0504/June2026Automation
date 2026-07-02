package com.june;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void read() {

		File f = new File(
				"C:\\Users\\M1001\\projectclss-workspace\\JuneProject\\src\\test\\resources\\Files\\juneread.xlsx");
		// File f = new File("/JuneProject/src/test/resources/Files/juneread.xlsx");
		try {
			FileInputStream input = new FileInputStream(f);

			Workbook book = new XSSFWorkbook(input);
			Sheet sheet = book.getSheet("Sheet1");
			int physicalrowcount = sheet.getPhysicalNumberOfRows();
//		for(int i=0; i<=physicalrowcount; i++) {
//			
//		}

			Row row = sheet.getRow(5);
			Cell cell = row.getCell(2);
			System.out.println(cell.getStringCellValue());
			System.out.println("start");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void write(String s, int r, int c, String v) {
		File f = new File(
				"C:\\Users\\M1001\\projectclss-workspace\\JuneProject\\src\\test\\resources\\Files\\juneread.xlsx");
		try {
			FileInputStream input = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(input);
			Sheet sheet = book.getSheet(s);
			Row row = sheet.createRow(r);
			Cell cell = row.createCell(c);
			//System.out.println(cell.getStringCellValue());
			
			cell.setCellValue(v);
			FileOutputStream output = new FileOutputStream(f);
			book.write(output);
			System.out.println("write: " + output);
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void main(String[] args) {
		write("Sheet1", 8, 1, "tomjerry");

	}

}
