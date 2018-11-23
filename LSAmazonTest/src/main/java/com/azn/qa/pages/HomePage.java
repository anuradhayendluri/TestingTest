/*package com.azn.qa.pages;

import com.azn.qa.base.TestBase;

public class HomePage extends TestBase {

}
*/

package com.azn.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.azn.qa.base.TestBase;
import com.azn.qa.util.TestUtil;
//import com.azn.qa.pages.LoginPage;


public class HomePage extends TestBase {

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
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void CheckWheatherNotSignin() {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		logoToHomePage.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		action.moveToElement(loginCheck).build().perform();
	}
	
	public void ClickSignin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnSignIn.click();
		//return new LoginPage1();
	}
	
	
	
}
