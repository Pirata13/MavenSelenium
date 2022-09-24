package com.trustid.tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.trustid.framework.BrowserFactory;
import com.trustid.ui.Redmine;

public class RedmineUno {

	public static WebDriver driver;

	@Test
	public void WeekHours(){

		try {

			WebDriver driver = BrowserFactory.getDriver("chrome");

			driver.get("https://dev.unosquare.com/redmine/");

			Redmine rdmine = PageFactory.initElements(driver, Redmine.class);

			rdmine.Login();
			rdmine.Register();
			rdmine.Validation();
			rdmine.Logout();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
