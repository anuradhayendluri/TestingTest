package com.azn.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.azn.qa.base.TestBase;
import com.azn.qa.pages.HomePage;
import com.azn.qa.pages.TempPage;
import com.azn.qa.util.TestUtil;

public class TempPageTest extends TestBase{

	
	TestUtil util;
	String sheetName ="empDetails";
	HomePage homePage;
	TempPage tempPage;
	
	public TempPageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		homePage = new HomePage();
		tempPage = new TempPage();
		util = new TestUtil();
		System.out.println("This is before method................");
	}
	
	@DataProvider(name="getTestData")
	public Object[][] getTestData() {
		Object data[][]= TestUtil.getTestDataFromExcel(sheetName);
		return data;	
	}
	
	@Test(priority=1, dataProvider="getTestData")
	public void CaptureTestData(String fname, String lname, String city, String pin) {
		tempPage.PrintTestData(fname,lname,city,pin);
	}
	
	
	@Test(priority=2)
	public void sampleMethod() {
		tempPage.PrintMethod();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
