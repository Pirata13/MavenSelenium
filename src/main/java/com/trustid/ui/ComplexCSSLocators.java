package com.trustid.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trustid.utilities.Utilities;

public class ComplexCSSLocators {

	WebDriver driver;
	Utilities util = new Utilities();

	public ComplexCSSLocators(WebDriver driver) {
		this.driver = driver;
	}

	/* MAIN PAGE */

	@FindBy(how = How.CSS, using = "a[title='Model S'] > span")
	@CacheLookup
	WebElement modelS;
	@FindBy(how = How.CSS, using = "a[title='Model 3'] > span")
	@CacheLookup
	WebElement model3;
	@FindBy(how = How.CSS, using = "a[title='Model X'] > span")
	@CacheLookup
	WebElement modelX;
	@FindBy(how = How.CSS, using = "a[title='Model Y'] > span")
	@CacheLookup
	WebElement modelY;
	@FindBy(how = How.CSS, using = "a[title='Cybertruck'] > span")
	@CacheLookup
	WebElement cyberTruck;

	@FindBy(how = How.CSS, using = "a[title='Powerwall'] > span")
	@CacheLookup
	WebElement powerWall;
	
	@FindBy(how = How.CSS, using = "a[title='Cuenta'] > span")
	@CacheLookup
	WebElement cuenta;
	
	@FindBy(how = How.CSS, using = "button[title='Menú'] > span")
	@CacheLookup
	WebElement menu;
	
	@FindBy(how = How.CSS, using = "section.tcl-homepage-hero.tcl-homepage-hero--overlay>:only-of-type>:last-child>:first-child>:only-of-type>a:first-of-type span")
	@CacheLookup
	WebElement ordenPersonalizada;
	
	@FindBy(how = How.CSS, using = "section.tcl-homepage-hero.tcl-homepage-hero--overlay>:only-of-type>:last-child>:first-child>:only-of-type>a:first-of-type + a>span")
	@CacheLookup
	WebElement inventarioNuevos;
	
	@FindBy(how = How.CSS, using = "div[class='results-container results-container--grid results-container--has-results']>:nth-child(2)>:first-child>:last-child>:only-child span")
	@CacheLookup
	WebElement price;
	
	@FindBy(how = How.CSS, using = "button#inventory-filters-modal")
	@CacheLookup
	WebElement filter;
	
	@FindBy(how = How.CSS, using = "input[title='Model 3'] + div[class='tds-form-label-wrap'] span")
	@CacheLookup
	WebElement fmodel3;
	
	@FindBy(how = How.CSS, using = "input[id$='_new']")
	@CacheLookup
	WebElement fnew;
	
	@FindBy(how = How.CSS, using = "input[name='LRAWD']")
	@CacheLookup
	WebElement cboxTraccion;
	
	@FindBy(how = How.CSS, using = "input[name='MSPLAID']")
	@CacheLookup
	WebElement version;
	
	@FindBy(how = How.CSS, using = ".filter.filter-WHEELS.full-width span")
	@CacheLookup
	WebElement eighteen_inches;
	
	@FindBy(how = How.CSS, using = ".filter.filter-INTERIOR.full-width legend")
	@CacheLookup
	WebElement color;
	
	public void CssSelectorComplex() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 25);
			
			Utilities util = new Utilities();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			util.CSSElementDisplayed(driver, "button.tds-modal-close");
			
			wait.until(ExpectedConditions.visibilityOf(modelS));
			
			wait.until(ExpectedConditions.textToBePresentInElement(modelS, "Model S"));
				
				modelS.click();
				driver.navigate().back();

			wait.until(ExpectedConditions.textToBePresentInElement(model3, "Model 3"));
			
				model3.click();
				driver.navigate().back();
		
			wait.until(ExpectedConditions.textToBePresentInElement(modelX, "Model X"));
			
				modelX.click();
				driver.navigate().back();
			
			wait.until(ExpectedConditions.textToBePresentInElement(modelY, "Model Y"));
			
				modelY.click();
				driver.navigate().back();
			
			wait.until(ExpectedConditions.textToBePresentInElement(cyberTruck, "Cybertruck"));
			
				cyberTruck.click();
				driver.navigate().back();
			
			wait.until(ExpectedConditions.textToBePresentInElement(powerWall, "Powerwall"));
			
				powerWall.click();
				driver.navigate().back();
			
			wait.until(ExpectedConditions.textToBePresentInElement(cuenta, "Cuenta"));
			
				cuenta.click();
				driver.navigate().back();
			
			wait.until(ExpectedConditions.textToBePresentInElement(menu, "Menú"));
			
				menu.click();
				util.CSSElementDisplayed(driver, "button.tds-modal-close");
				
			wait.until(ExpectedConditions.textToBePresentInElement(ordenPersonalizada, "ORDEN PERSONALIZADA"));
				
				ordenPersonalizada.click();
				driver.navigate().back();
				
			wait.until(ExpectedConditions.textToBePresentInElement(inventarioNuevos, "INVENTARIO DE AUTOS NUEVOS"));
				
				inventarioNuevos.click();
				driver.navigate().back();
	
			wait.until(ExpectedConditions.visibilityOf(ordenPersonalizada));
			  
			System.out.println("\nIs button Orden Personalizada displayed? "+ ordenPersonalizada.isDisplayed());
			
			wait.until(ExpectedConditions.visibilityOf(inventarioNuevos));

			System.out.println("\nIs button Inventarios Nuevos displayed? "+ inventarioNuevos.isDisplayed());			
			
			wait.until(ExpectedConditions.visibilityOf(inventarioNuevos));
			
				inventarioNuevos.click();
				
			System.out.println("Costo: "+price.getText());
			
			System.out.println("Modelo "+fmodel3.getText());
			
			fmodel3.click();
			
			System.out.println("Model 3 checkbox clicked");
			
			wait.until(ExpectedConditions.elementToBeClickable(cboxTraccion));
			
			cboxTraccion.click();
			
			System.out.println("Traccion checkbox clicked");
			
			WebElement costo = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector("div[class='results-container results-container--grid results-container--has-results']>:nth-child(2)>:first-child>:last-child span")));
			
			System.out.println("Costo: "+costo.getText());
			
			System.out.println("Modelo "+fmodel3.getText());
			
			js.executeScript("arguments[0].scrollIntoView();", color);
			
			Thread.sleep(500);
			
			WebElement ruedas = wait.until(ExpectedConditions.visibilityOfElementLocated(
					  By.cssSelector(".filter.filter-WHEELS.full-width>:only-child>:last-child>:first-child span")));
			
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			wait.until(ExpectedConditions.visibilityOf(ruedas));
			wait.until(ExpectedConditions.elementToBeClickable(ruedas));
			
			ruedas.click();
			
			System.out.println("Rines checkbox clicked");
			
			Thread.sleep(5000);

			util.closeBrowser(driver);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
