package com.trustid.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.trustid.framework.BrowserFactory;
import com.trustid.ui.ComplexLocators;

public class MicrosoftTC {
	
	public static WebDriver driver;
	
	@Test
	public void TestComplexLocators(){
	
		try {
			
			WebDriver driver = BrowserFactory.getDriver("chrome");
			
			driver.get("https://www.microsoft.com/es-mx");
			
			ComplexLocators cloc = PageFactory.initElements(driver, ComplexLocators.class);
			
			cloc.MicrosoftExample();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
