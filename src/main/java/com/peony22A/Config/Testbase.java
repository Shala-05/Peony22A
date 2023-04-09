package com.peony22A.Config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.peony22A.Keywords.UIKeywords;

public class Testbase {
	@BeforeMethod
	public void setupMethod()
	{
		//UIKeywords keyword=new UIKeywords();
		UIKeywords.openBrowser("Chrome");
		UIKeywords.launchUrl("https://www.amazon.com/");
	}
	@AfterMethod
	public void tearDown()
	{
		//UIKeywords keyword=new UIKeywords();
		UIKeywords.driver.close();
		
	}
}
