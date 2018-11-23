package com.azn.qa.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.azn.qa.base.TestBase;

public class TodayDealsPage extends TestBase {

	@FindBy(xpath="//a[@href=\"/gp/goldbox?ref=nav_topnav_deals\"]")
	WebElement todayLink;
	
	@FindBy(xpath="//div[contains(text(),\"Today's Deals\") and @class=\"gbh1-bold\"]")
	WebElement confirmTodayDealsPage;
	
	public TodayDealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnTodayDeals() {
		todayLink.click();
	}
	
	public void ConfirmTDPage() {
		String pageName = todayLink.getText();
		System.out.println("Page title is " + pageName);
		Assert.assertEquals("Today's 1Deals", pageName,"Deals page lable has not displayed");
		//System.out.println(Assert.assertEquals("Today's Deals", pageName););
			
		}
	
	

}
