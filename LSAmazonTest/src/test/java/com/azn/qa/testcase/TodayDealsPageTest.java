package com.azn.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.azn.qa.base.TestBase;
import com.azn.qa.pages.TodayDealsPage;

public class TodayDealsPageTest extends TestBase {
	
	TodayDealsPage todayDealsPage;
	
	@BeforeMethod
	public void SetUp() {
//		System.out.println("before setup starging");
		initialization();
		todayDealsPage = new TodayDealsPage();
//		System.out.println("After setup done");

	}
	
	
	@Test(priority=1)
	public void OpenTodayDeails() {
		todayDealsPage.ClickOnTodayDeals();
		todayDealsPage.ConfirmTDPage();
	}
	
	
	
/*	@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
}
