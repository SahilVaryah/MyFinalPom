package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//page factory = OR
	
	@FindBy(xpath = "//img[@id='gh-logo']")
	WebElement ebayLogo;
	@CacheLookup
	
	@FindBy(linkText = "eBay Deals")
	WebElement dealsTab;
	
	@FindBy(linkText = "Fashion")
	WebElement fashionTab ;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean imgDisplayed() {
		return ebayLogo.isDisplayed();
	}
	
	public FashionPage fashion() {
		fashionTab.click();
		return new FashionPage();
	}
	public DealsPage deals() {
		dealsTab.click();
		return new DealsPage();
	}
	
	public void ReadFromXlFile(String name, String ltname, String age, String gender) {
		System.out.println("My name is"+' '+ name+' '+ ltname + "and I'm a"+' ' +age+ "year old" +' ' + gender +".");
		
		
	}
	
	
		
	
	

}
