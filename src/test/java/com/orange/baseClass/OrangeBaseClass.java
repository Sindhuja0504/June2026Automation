package com.orange.baseClass;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeBaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static void  loadUrl(String url) {
		driver.get(url);
		
	}
	public static WebElement  findElement(By by) {
		return driver.findElement(by);
	}
	
	public static String scanner() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value: ");
		String value= scan.nextLine();
		return value;
	}
	public void closeBrowser() {
		driver.close();
	}
	public void quiteBrowser() {
		driver.quit();
	}
	

}
