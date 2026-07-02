package com.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Page.LoginPageL;

 

public class LoginPageM {
	public static void main(String [] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	LoginPageL login = new LoginPageL(driver);
	
	login.login("Admin", "admin123");
	login.clickbutton();

}
}