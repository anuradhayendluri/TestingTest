package com.azn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.azn.qa.base.TestBase;

public class LogOutPage extends TestBase{

	public Actions action = new Actions(driver);
	
	// Page factory
	
	@FindBy(xpath="//span[contains(text(),'Your Orders')][@class='nav-line-4']")
	WebElement yourorders;
	
	@FindBy(xpath="//span[contains(text(),'Sign Out')]")
	WebElement signout;
	
	@FindBy(xpath="//label[contains(text(),'Email or mobile phone number')]")
	WebElement signOutConfirmText;
	
	// initializing the page objects 
	public LogOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage SignOut() {
		action.moveToElement(yourorders);
		signout.click();
		
		return new HomePage();
	}
	
	public String VerifyPageText() {
		return signOutConfirmText.getText();
		
	}
	
}
