package com.trustid.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trustid.utilities.Utilities;

public class SimpleCSSLocators {

	WebDriver driver;
	Utilities util = new Utilities();

	public SimpleCSSLocators(WebDriver driver) {
		this.driver = driver;
	}

	/* MAIN PAGE */

	@FindBy(how = How.CSS, using = "a[href='#welcome']")
	@CacheLookup
	WebElement welcome;
	@FindBy(how = How.CSS, using = "a[href='#about-us']")
	@CacheLookup
	WebElement Aboutus;
	@FindBy(how = How.CSS, using = "a[href='#life-unicorn']")
	@CacheLookup
	WebElement Life_unicorn;
	@FindBy(how = How.CSS, using = "a[href='#benefits']")
	@CacheLookup
	WebElement Benefits;
	@FindBy(how = How.CSS, using = "a[href='#apply']")
	@CacheLookup
	WebElement Apply;

	@FindBy(how = How.CSS, using = "h6[class='about-title']:not([id])")
	@CacheLookup
	List<WebElement> ourbenefitsArray;
	
	@FindBy(how = How.CSS, using = "div[data-anchor='benefits'] div[class='module d-none d-lg-flex flex-row app-container app-padding'] h6")
	@CacheLookup
	WebElement ourbenefits;
	
	@FindBy(how = How.CSS, using = "div[class='col-4 bonus-icon-group'] img[alt='Flexible Working Hours']")
	@CacheLookup
	WebElement flexibleworkinghours;
	
	@FindBy(how = How.CSS, using = "div[class='col-4 bonus-icon-group'] img[alt='Private Health Insurance'] + strong")
	@CacheLookup
	WebElement privatehealthinsurance;
	
	@FindBy(how = How.CSS, using = "div[class='col-4 bonus-icon-group'] img[alt='Work From Home'] + strong")
	@CacheLookup
	WebElement workfromhome;
	
	@FindBy(how = How.CSS, using = "div[class='col-4 bonus-icon-group'] img[alt='Family Leave Package']")
	@CacheLookup
	WebElement familyleavepackage;
	
	@FindBy(how = How.CSS, using = "div[class='col-4 bonus-icon-group'] img[alt='Travel']")
	@CacheLookup
	WebElement travel;
	

	
	public void CssSelectorSimple() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 25);
			
			WebElement Hmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("span[class=navbar-toggler-icon]")));

			if (Hmenu.isDisplayed()) {
				System.out.println(Hmenu.getText());
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				Hmenu.click();
			};

			welcome = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("a[href='#welcome']")));	
			
			  if (welcome.isDisplayed()) { 
				  System.out.println(welcome.getText());
				  System.out.println(driver.getTitle()); 
				  welcome.click(); 
			  };
			  
			  Hmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("span[class=navbar-toggler-icon]")));
			  
			  Hmenu.click();
			  
			  WebElement Aboutus = wait.until(ExpectedConditions.visibilityOfElementLocated(
			  By.cssSelector("a[href='#about-us']")));
			  
			  if (Aboutus.isDisplayed()) {
			  
			  System.out.println(Aboutus.getText()); 
			  Aboutus.click();System.out.println(driver.getTitle());};
			  
			  driver.navigate().back();
			  
			  Hmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("span[class=navbar-toggler-icon]")));
			  
			  Hmenu.click();
			  
			  WebElement Life_unicorn = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("a[href='#life-unicorn']")));
			  
			  if (Life_unicorn.isDisplayed()) {
			  System.out.println(Life_unicorn.getText());
			  Life_unicorn.click();
			  System.out.println(driver.getTitle()); };
			  
			  driver.navigate().back();
			  
			  Hmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("span[class=navbar-toggler-icon]")));
			  
			  Hmenu.click();
			  
			  WebElement Benefits = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("a[href='#benefits']")));
			  
			  if (Benefits.isDisplayed()) {
			  System.out.println(Benefits.getText());
			  Benefits.click();
			  System.out.println(driver.getTitle()); };
			  
			  driver.navigate().back();
			  
			  Hmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("span[class=navbar-toggler-icon]")));
			  
			  Hmenu.click();
			  
			  WebElement Apply = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("a[href='#apply']")));
			  
			  if (Apply.isDisplayed()) { 
			  System.out.println(Apply.getText());
			  Apply.click();
			  System.out.println(driver.getTitle()); };
			  
			  driver.navigate().back();
			  
			  Hmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("span[class=navbar-toggler-icon]")));
			  
			  Hmenu.click();
			  
			  Benefits = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("a[href='#benefits']")));
			  
			  if (Benefits.isDisplayed()) {
			  System.out.println(Benefits.getText());
			  Benefits.click();
			  System.out.println(driver.getTitle()); };
			  
			  //Thread.sleep(5000);
			  
			  System.out.print(ourbenefits.getText());
			  
			  // Traverse the array that contains both elements
			  
			  /*System.out.println(ourbenefitsArray.get(0));
			  
			  for (WebElement we : ourbenefitsArray) {
				  
				  System.out.println(we.getText());
				
			  }*/
			  
			wait.until(ExpectedConditions.visibilityOf(flexibleworkinghours));
			  
			System.out.println("\nIs icon Flexible Working Hours displayed? "+ flexibleworkinghours.isDisplayed());
			
			wait.until(ExpectedConditions.visibilityOf(privatehealthinsurance));

			System.out.println("\nIs Text Private Health Insurance displayed? "+ privatehealthinsurance.isDisplayed());
			
			assert privatehealthinsurance.getText().equalsIgnoreCase("Private Health Insurance");
			
			System.out.println(privatehealthinsurance.getText());
					
			wait.until(ExpectedConditions.visibilityOf(workfromhome));
			
			System.out.println("\nIs Text Work From Home displayed? "+ workfromhome.isDisplayed());
			
			System.out.println(workfromhome.getText());
			
			assert workfromhome.getText().equalsIgnoreCase("Work From Home");
			
wait.until(ExpectedConditions.visibilityOf(familyleavepackage));
			
			System.out.println("\nIs icon Family Leave Package displayed? "+ familyleavepackage.isDisplayed());
			
wait.until(ExpectedConditions.visibilityOf(travel));
			
			System.out.println("\nIs icon Travel displayed? "+ travel.isDisplayed());
			
			
			
			Thread.sleep(13);

			util.closeBrowser(driver);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
