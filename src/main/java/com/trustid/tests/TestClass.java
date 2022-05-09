package com.trustid.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.trustid.framework.BrowserFactory;
import com.trustid.ui.Locators;
import com.trustid.ui.NavigationMenu;

public class TestClass {
	
	public static WebDriver driver;
	
	@Test
	public void TestLocators(){
		
		try {
			WebDriver driver = BrowserFactory.getDriver("chrome");
			
			driver.get("https://www.amazon.com");
			
			Locators loc = PageFactory.initElements(driver, Locators.class);
			
			loc.LocatorsExample();
			
			NavigationMenu nM = PageFactory.initElements(driver, NavigationMenu.class);
			
			nM.LocatorsExample();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
