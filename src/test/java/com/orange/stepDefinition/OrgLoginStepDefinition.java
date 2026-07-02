package com.orange.stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.orange.baseClass.OrangeBaseClass;
import com.orange.baseClass.OrangeUtilityClass;
import com.orange.pageFactory.OrgLoginPF;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrgLoginStepDefinition {

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		OrangeBaseClass.browserLaunch();
		OrangeBaseClass.loadUrl(OrangeUtilityClass.readProperty("url"));
		System.out.println("Login done");

	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) {
		OrgLoginPF pf = new OrgLoginPF();
		OrangeUtilityClass.explicitWait(OrangeBaseClass.driver, pf.name);
		pf.name.sendKeys(OrangeUtilityClass.readProperty("username"));
		pf.pass.sendKeys(OrangeUtilityClass.readProperty("password"));
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		OrgLoginPF pf = new OrgLoginPF();
		pf.loginButton.click();
	}

	@Then("User page should navigate to the dashboard page")
	public void user_page_should_navigate_to_the_dashboard_page() {
		String title = OrangeBaseClass.driver.getTitle();
		if (title.contains("OrangeHRM")) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}
		Assert.assertEquals(title, "OrangeHRM");
	}

	@When("user enter a invalid username and password")
	public void user_enter_a_invalid_username_and_password() {
		OrgLoginPF pf = new OrgLoginPF();
		OrangeUtilityClass.explicitWait(OrangeBaseClass.driver, pf.name);
		pf.name.sendKeys(OrangeUtilityClass.readProperty("invalidname"));
		pf.pass.sendKeys(OrangeUtilityClass.readProperty("inpassword"));

	}

	@When("user click the login button")
	public void user_click_the_login_button2() {
		OrgLoginPF pf = new OrgLoginPF();
		pf.loginButton.click();

	}

	@Then("user should  receive invalid  username and password")
	public void user_should_receive_invalid_username_and_password() {
		OrgLoginPF pf = new OrgLoginPF();
		
		
		OrangeUtilityClass.explicitWait(OrangeBaseClass.driver, pf.invalicreden);
		String value = pf.invalicreden.getText();
		assertEquals(value, "Invalid credentials");

	}

	@When("user not enter username and password")
	public void user_not_enter_username_and_password() {
		OrgLoginPF pf = new OrgLoginPF();
		OrangeUtilityClass.explicitWait(OrangeBaseClass.driver, pf.loginButton);
		pf.loginButton.click();

	}

	@Then("user should recieve require eror message")
	public void user_should_recieve_require_eror_message() {
		OrgLoginPF pf = new OrgLoginPF();
		//String namevalue = pf.requirename.getText();
		OrangeUtilityClass.explicitWait(OrangeBaseClass.driver, pf.requirename);
		Assert.assertTrue(pf.requirename.isDisplayed(), "Username required message not displayed");
		OrangeUtilityClass.explicitWait(OrangeBaseClass.driver, pf.requirepass);
		String passvalue = pf.requirepass.getText();
		Assert.assertEquals(passvalue, "Required");
	}

}
