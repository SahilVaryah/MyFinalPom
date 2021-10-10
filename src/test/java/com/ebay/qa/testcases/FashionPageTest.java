//Sahil Varyah
package com.ebay.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.FashionPage;
import com.ebay.qa.pages.HomePage;

public class FashionPageTest extends TestBase{
	HomePage homepage;
	FashionPage fashionpage;
	public FashionPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new HomePage();
		fashionpage = homepage.fashion();		
	}
	@Test(priority = 1)
	public void pageHeaderTest() {
		Assert.assertEquals(fashionpage.PageHeader(), "Fashion", "Page Header not present");
	}
	@Test(priority = 2)
	public void categorysectionTest() {
		Assert.assertEquals(fashionpage.CategorySection(), "Shop By Category", "Category Section not present");
	}
	@Test(priority = 3)
	public void topBrandsSectionTest() {
		Assert.assertEquals(fashionpage.TopBrands(), "Top Brands", "Top brands Section not present");
	}
	@Test(priority = 4)
	public void mensCloyhingLinkTest() {
		String MensClothingPageTitle = fashionpage.mensclothing().driver.getTitle();
		Assert.assertEquals(MensClothingPageTitle, "Men's Clothing for sale | eBay", "Page Title not as expected");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
		

}
