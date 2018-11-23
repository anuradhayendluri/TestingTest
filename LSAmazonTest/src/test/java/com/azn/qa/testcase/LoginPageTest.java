package com.azn.qa.testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.azn.qa.base.TestBase;
import com.azn.qa.pages.HomePage;
import com.azn.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage.CheckWheatherNotSignin();
		homePage.ClickSignin();	
	}
	
	@Test(priority=1)
	public void login() {
/*		homePage.CheckWheatherNotSignin();
		homePage.ClickSignin();*/		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		loginPage.CheckUserName(prop.getProperty("username"));
		loginPage.CheckPassword(prop.getProperty("pwd"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
