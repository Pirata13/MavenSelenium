package com.trustid.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.trustid.utilities.Utilities;

public class Locators {

	WebDriver driver;
	Utilities util = new Utilities();
	 
	public Locators(WebDriver driver){
	this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-xshop\"]/a[1]")
	@CacheLookup
	WebElement todayDeals;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-xshop\"]/a[2]")
	@CacheLookup
	WebElement customerService;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-xshop\"]/a[3]")
	@CacheLookup
	WebElement registry;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-xshop\"]/a[4]")
	@CacheLookup
	WebElement giftCards;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-xshop\"]/a[5]")
	@CacheLookup
	WebElement sell;

	public void LocatorsExample() {
		try {
			
			driver.manage().window().maximize();
			
			util.ElementDisplayed(driver);
			
			if(todayDeals.isDisplayed()) {
				System.out.println(todayDeals.getText());
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				todayDeals.click();
				driver.navigate().back();
			};
			
			util.ElementDisplayed(driver);
			
			if(customerService.isDisplayed()) {
				System.out.println(customerService.getText());
				customerService.click();
				System.out.println(driver.getTitle());
			};
			
			util.ElementDisplayed(driver);
			
			if(registry.isDisplayed()) {
				System.out.println(registry.getText());
				registry.click();
				System.out.println(driver.getTitle());
			};
			
			util.ElementDisplayed(driver);
			
			if(giftCards.isDisplayed()) {
				System.out.println(giftCards.getText());
				giftCards.click();
				System.out.println(driver.getTitle());				
			};
			
			util.ElementDisplayed(driver);
			
			if(sell.isDisplayed()) {
				System.out.println(sell.getText());
				sell.click();
				System.out.println(driver.getTitle());
			};
			
			util.ElementDisplayed(driver);
			
			Thread.sleep(3);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
