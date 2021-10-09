package com.ebay.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage homepage;

	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new HomePage();		
	}
	@Test (priority = 1)
	public void homePageTitleTest() {
		String title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		Assert.assertEquals(title, homepage.verifyHomePageTitle());
	}
	@Test (priority = 2)
	public void ebayLogoTest() {
		Assert.assertTrue(homepage.imgDisplayed(), "Ebay Logo not Present");
	}
	@Test(priority = 3)
	public void fashionLinkTest() {
		homepage.fashion();
		String fashionPageTitle = "Fashion products for sale | eBay";
		Assert.assertEquals(fashionPageTitle, driver.getTitle(), "Page title is not a match!");
	}
	@Test(priority = 4)
	public void dealsLinkTest() {
		homepage.deals();
		String dealsPageTitle = "Daily Deals on eBay | Best deals and Free Shipping";
		Assert.assertEquals(dealsPageTitle, driver.getTitle(), "Page title is not a match!");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
