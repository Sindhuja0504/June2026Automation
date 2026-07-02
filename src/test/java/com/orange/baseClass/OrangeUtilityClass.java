package com.orange.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeUtilityClass {
	
	public static void readExcel(String name, String sheetName, int rowNumber, int cellNumber) {
		File file = new File(name);
		try {
			FileInputStream input = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(input);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowNumber);
			Cell cell = row.getCell(cellNumber);
		} catch (Exception e) {
			
			System.out.println(e);
		}	
	}	
	public static void writeExel(String fileName, String Sheetname,int rownumber, int cellnumber,String write) {
		File f = new File(fileName);
		try {
			FileInputStream input = new FileInputStream(f);
			Workbook book = new XSSFWorkbook(input);
			Sheet sheet = book.getSheet(Sheetname);
			Row row = sheet.createRow(rownumber);
			Cell cell = row.createCell(cellnumber);
			FileOutputStream output = new FileOutputStream(f);
			book.write(output);		
		} catch ( Exception e) {
			System.out.println(e);
		}
	}
	public static String readProperty(String key) {
		String property= null;
		try {
			FileReader file = new FileReader("C:\\Users\\M1001\\projectclss-workspace\\JuneProject\\src\\test\\resources\\Files\\sheet.properties");
			Properties prop = new Properties();
			prop.load(file);
		 property =	prop.getProperty(key);
		} catch ( Exception e) {
			 
			System.out.println(e);
		}
		return property;	
	}
	
	public static void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	public static void explicitWait(WebDriver driver,WebElement element) {
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void fluentWait(WebDriver driver, WebElement element) {
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
