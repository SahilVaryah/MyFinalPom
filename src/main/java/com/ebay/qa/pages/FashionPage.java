package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class FashionPage extends TestBase{
	
	@FindBy(xpath = "//body/div[5]/div[2]/h1[1]/span[1]")
	WebElement pageHeader;
	
	@FindBy(xpath = "//h2[contains(text(),'Shop By Category')]")
	WebElement categorySection;
	
	@FindBy(xpath = "//h2[contains(text(),'Top Brands')]")
	WebElement topBrands;
	
	@FindBy(xpath = "//div[contains(text(),\"Men's Clothing\")]")
	WebElement mensClothingLink;
	
	public FashionPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String PageHeader() {
		String pageheader = pageHeader.getText();
		return pageheader;

	}
	public String CategorySection() {
		String categorysection = categorySection.getText();
		return categorysection;
	}
	public String TopBrands() {
		String topbrands = topBrands.getText();
		return topbrands;
	}
	public MensClothingPage mensclothing() {
		mensClothingLink.click();
		return new MensClothingPage();
	}
	
	
	

}
