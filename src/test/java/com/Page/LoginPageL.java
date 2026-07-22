package com.Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageL {

	WebDriver driver;
	By username = By.name("username");
	By password = By.xpath("//input[@type=\"password\"]");
	By loginbutton = By.xpath("//button[text()=' Login ']");
	
	public   LoginPageL(WebDriver driver) {
		this.driver= driver;
	}
	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickbutton() {
		driver.findElement(loginbutton).click();
		kanna
	}
	public void login(String user, String pass) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(username));
		enterusername(user);
		enterpassword(pass);
		clickbutton();
	}

}
