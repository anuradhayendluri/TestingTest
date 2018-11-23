package com.azn.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.azn.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory
	
	//@FindBy(name = "//input[@name='email']")
	//@FindBy(name = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[@name='email']")
	@FindBy(xpath="//input[@name='email']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath= "//input[@id='signInSubmit']")
	WebElement btnLogin;	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void CheckUserName(String username) {	
		userName.sendKeys(username);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		btnContinue.click();
	}
	
	public void ClickContinueBtn() {
		btnContinue.click();
	}
	
	public void CheckPassword(String pwd) {
		password.sendKeys(pwd);
		btnLogin.click();
		//return new HomePage();
	}
}


/*package com.azn.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.azn.qa.base.TestBase;
import com.azn.qa.util.TestUtil;

public class LoginPage extends TestBase {

	public Actions action = new Actions(driver);

	@FindBy(xpath="//span[contains(text(),'Amazon') and @class='nav-sprite nav-logo-base']")
	WebElement logoToHomePage;
		
	@FindBy(xpath="//span[contains(text(),'Hello.')]")
	WebElement loginCheck;
	
	//@FindBy(xpath="/html/body/div[1]/header[1]/div[1]/div[1]/div[4]/div[6]/div[1]/a/span[contains(text(),'Sign in')]")
	//@FindBy(xpath="/html/body/div[1]/header[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/a/span[contains(text(),'Sign in')]")
	@FindBy(xpath="//span[contains(text(),'Sign in')][1]")
	WebElement btnSignIn;
	
	@FindBy(xpath="//span[contains(text(),\"Try\")]")
	WebElement menuTryPrime;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void CheckWheatherNotSignin() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		logoToHomePage.click();
		action.moveToElement(loginCheck).build().perform();
	}
	
	public void ClickSignin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSignIn.click();
	}
	
	
	
	
	
	
	
}
*/