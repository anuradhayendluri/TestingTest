/*package com.azn.qa.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.azn.qa.base.TestBase;

public class LoginPage1 extends TestBase {

	//Page Factory
	@FindBy(xpath="//input[@name='email']")
	WebElement userName1;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement btnCheckUserName;

	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath ="//input[@id='signInSubmit']")
	WebElement btnLogin;
	
	//Actions
	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserName1() {
		userName1.sendKeys("anandicons@gmail.com");
	}

	public void clickContinue() {
		btnCheckUserName.click();
	}
	
	public void EnterPassword() {
		txtPassword.sendKeys("Anand@123");
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	
}
*/