package com.trustid.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.trustid.framework.BrowserFactory;
import com.trustid.ui.ComplexCSSLocators;

public class TeslaTC {
	
	public static WebDriver driver;
	
	@Test
	public void ComplexCSSSelectors(){
	
		try {
			
			WebDriver driver = BrowserFactory.getDriver("chrome");
			
			driver.get("https://www.tesla.com/es_mx");
			
			ComplexCSSLocators cssCloc = PageFactory.initElements(driver, ComplexCSSLocators.class);
			
			cssCloc.CssSelectorComplex();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
