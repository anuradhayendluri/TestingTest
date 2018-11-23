package com.azn.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.azn.qa.base.TestBase;

import com.azn.qa.pages.LogOutPage;

public class LogOutPageTest extends TestBase {
	
	LogOutPage logoutPage;
	
	public LogOutPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		logoutPage = new LogOutPage();
	}
	
	@Test(priority=1)
	public void logOut() {
		logoutPage.SignOut();
		//return new HomePage();
	}
/*		
	@Test (priority=2)
	public void confirmLogout() {
		String confirmTxt = logoutPage.VerifyPageText();
		Assert.assertEquals(confirmTxt, "Email or mobile phone number");
	}
*/	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
