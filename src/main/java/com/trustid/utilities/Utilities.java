package com.trustid.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {

	public WebDriver ElementDisplayed(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		if (driver.findElements(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input"))
				.size() > 0) {

			driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();

		}

		driver.manage().timeouts().implicitlyWait(33, TimeUnit.SECONDS);

		return driver;

	}
	
	public WebElement isElementDisplayed(WebDriver driver, String locator) {
		
		WebElement objFound=null;
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		if (driver.findElements(By.xpath(locator))
				.size() > 0) {

			objFound = driver.findElement(By.xpath(locator));

		}
		
		return objFound;
	}
	
	
	
	public void closeBrowser(WebDriver driver) {
		
		driver.close();
		driver.quit();
	}

}
