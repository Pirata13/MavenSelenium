package com.trustid.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.trustid.utilities.Utilities;

public class NavigationMenu {

	WebDriver driver;
	Utilities util = new Utilities();
	 
	public NavigationMenu(WebDriver driver){
	this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-hamburger-menu\"]/i")
	@CacheLookup
	WebElement hamburguerMenu;
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[1]")
	@CacheLookup
	WebElement amazonMusic;
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[2]")
	@CacheLookup
	WebElement kebooks;
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[3]")
	@CacheLookup
	WebElement appStoreAnd;
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[4]")
	@CacheLookup
	WebElement electronics;
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[5]")
	@CacheLookup
	WebElement computers;
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[6]")
	@CacheLookup
	WebElement smartHome;
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[26]")
	@CacheLookup
	WebElement seeAllSBD;
	
	/*hmenu-compress-section compressed*/
	
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[8]")
	@CacheLookup
	WebElement automotive;
	
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[9]")
	@CacheLookup
	WebElement baby;
	
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[16]")
	@CacheLookup
	WebElement homeKitchen;
	
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[18]")
	@CacheLookup
	WebElement lagguage;
	
	/*hmenu-item hmenu-compressed-btn*/
	
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[33]")
	@CacheLookup
	WebElement seeAllPF;
	
	@FindBy(how=How.XPATH,using="(//*[@id=\"hmenu-content\"]//descendant::a)[32]")
	@CacheLookup
	WebElement secondChance;
	
	/*Amazon Second Chance*/
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Recycle packaging')]")
	@CacheLookup
	WebElement reciclePackaging;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Recycle & trade in electronics')]")
	@CacheLookup
	WebElement recicleTrade;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Repair items')]")
	@CacheLookup
	WebElement repairItems;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Shop pre-owned items')]")
	@CacheLookup
	WebElement shopPreowned;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Learn more about sustainability at Amazon')]")
	@CacheLookup
	WebElement learnMore;
	
	public void LocatorsExample() {
		try {

			//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
			
			if(hamburguerMenu.isDisplayed()) {
				hamburguerMenu.click();
				Thread.sleep(3000);
			};
			
			if(amazonMusic.isDisplayed()) {
				System.out.println(amazonMusic.getText());	
				amazonMusic.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//*[@id=\"hmenu-content\"]//following::a)[40]")).click();
				Thread.sleep(3000);
			};
			
			
			if(kebooks.isDisplayed()) {
				System.out.println(kebooks.getText());
			};
			
			if(appStoreAnd.isDisplayed()) {
				System.out.println(appStoreAnd.getText());
			};
			
			if(electronics.isDisplayed()) {
				System.out.println(electronics.getText());
			};
			
			if(computers.isDisplayed()) {
				System.out.println(computers.getText());
			};
			
			if(smartHome.isDisplayed()) {
				System.out.println(smartHome.getText());
			};
			
			if(seeAllSBD.isDisplayed()) {
				System.out.println(seeAllSBD.getText());
				seeAllSBD.click();
				
			};
			
			Thread.sleep(3000);
			
			if(automotive.isDisplayed()) {
				System.out.println(automotive.getText());
			};
			
			if(baby.isDisplayed()) {
				System.out.println(baby.getText());
			};
			
			if(homeKitchen.isDisplayed()) {
				System.out.println(homeKitchen.getText());
			};
			
			if(lagguage.isDisplayed()) {
				System.out.println(lagguage.getText());
			};
			
			if(seeAllPF.isDisplayed()) {
				System.out.println(seeAllPF.getText());
				seeAllPF.click();
			};
			
			Thread.sleep(3000);
			
			if(secondChance.isDisplayed()) {
				System.out.println(secondChance.getText());
				secondChance.click();
			};
			
			Thread.sleep(1000);
			
			if(reciclePackaging.isDisplayed()) {
				System.out.println(reciclePackaging.getText());
			};
			
			if(recicleTrade.isDisplayed()) {
				System.out.println(recicleTrade.getText());
			};
			
			if(repairItems.isDisplayed()) {
				System.out.println(repairItems.getText());
			};
			
			if(shopPreowned.isDisplayed()) {
				System.out.println(shopPreowned.getText());
			};
			
			if(learnMore.isDisplayed()) {
				System.out.println(learnMore.getText());
			};
			
			util.closeBrowser(driver);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
