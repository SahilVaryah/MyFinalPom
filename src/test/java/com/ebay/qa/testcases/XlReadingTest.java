package com.ebay.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.util.TestUtil;

public class XlReadingTest extends TestBase{
	HomePage homepage;
	TestUtil testutil;
	String sheetname = "FPOMTD";
	

	public XlReadingTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new HomePage();		
	}
	
	
	@DataProvider
	public Object [][] getMyTestdata(){
		Object data [][] = testutil.getTestData(sheetname);
		return data;
	}
	@Test(dataProvider = "getMyTestdata")
	public void readfromXLFileTest(String Name, String LastName, String Age, String Gender) {
		homepage.ReadFromXlFile(Name, LastName, Age, Gender);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
