package com.orange.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.baseClass.OrangeBaseClass;

public class OrgLoginPF extends OrangeBaseClass {
	
	public OrgLoginPF() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	public WebElement name;
	
	@FindBy(name="password")
	public WebElement pass;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//p[text()='Invalid credentials']")
	public WebElement invalicreden;
	
	@FindBy(xpath = "(//span[text()='Required'])[1]")
	public WebElement requirename;
	
	@FindBy(xpath = "(//span[text()='Required'])[2]")
	public WebElement requirepass;
	


}
