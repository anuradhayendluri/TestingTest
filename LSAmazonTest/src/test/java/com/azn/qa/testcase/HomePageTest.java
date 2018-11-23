/*package com.azn.qa.testcase;

public class HomePageTest {

}
*/

package com.azn.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.azn.qa.base.TestBase;
import com.azn.qa.pages.HomePage;



public class HomePageTest extends TestBase {

	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void SignIn() {
		homePage.CheckWheatherNotSignin();
		homePage.ClickSignin();	
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
