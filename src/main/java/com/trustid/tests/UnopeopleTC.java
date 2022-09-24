package com.trustid.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.trustid.framework.BrowserFactory;
import com.trustid.ui.SimpleCSSLocators;

public class UnopeopleTC {
	
	public static WebDriver driver;
	
	@Test
	public void SimpleCSSSelectors(){
	
		try {
			
			WebDriver driver = BrowserFactory.getDriver("chrome");
			
			driver.get("https://people.unosquare.com");
			
			SimpleCSSLocators cssloc = PageFactory.initElements(driver, SimpleCSSLocators.class);
			
			cssloc.CssSelectorSimple();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
