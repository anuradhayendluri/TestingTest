/*package com.azn.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.azn.qa.base.TestBase;
import com.azn.qa.pages.HomePage;

public class LoginPageTest1 extends TestBase {

	LoginPage1 loginPage1;
	HomePage homePage;
	
	public LoginPageTest1() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginPage1 = new LoginPage1();
		homePage = new HomePage();
		homePage.CheckWheatherNotSignin();
		homePage.ClickSignin();	
	}
	
	@Test(priority=1)
	public void checkUsername() {
		loginPage1.EnterUserName1();
		loginPage1.clickContinue();
		loginPage1.EnterPassword();
		loginPage1.clickLogin();
	}
	@Test(priority=2)
	public void checkPassword() {

	}
	
	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}
}
*/