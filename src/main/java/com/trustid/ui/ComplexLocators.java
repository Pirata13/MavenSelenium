package com.trustid.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trustid.utilities.Utilities;

public class ComplexLocators {

	WebDriver driver;
	Utilities util = new Utilities();

	public ComplexLocators(WebDriver driver) {
		this.driver = driver;
	}

	/* MAIN PAGE */

	@FindBy(how = How.XPATH, using = "//*[@id=\"shellmenu_1\"]")
	@CacheLookup
	WebElement Office;
	@FindBy(how = How.XPATH, using = "//*[@id=\"c-shellmenu_0\"]")
	@CacheLookup
	WebElement Productos;
	@FindBy(how = How.XPATH, using = "(//*[@class=\"f-sub-menu js-nav-menu nested-menu\"]//span)[1]")
	@CacheLookup
	WebElement paraHogar;
	@FindBy(how = How.XPATH, using = "(//*[@class=\"f-sub-menu js-nav-menu nested-menu\"]//child::li)[1]")
	@CacheLookup
	WebElement preciosParaHogar;
	@FindBy(how = How.XPATH, using = "(//*[@class=\"f-sub-menu js-nav-menu nested-menu\"]//child::li)[3]")
	@CacheLookup
	WebElement paraIndividuos;
	@FindBy(how = How.XPATH, using = "(//*[@class=\"f-sub-menu js-nav-menu nested-menu\"]//child::li)[5]")
	@CacheLookup
	WebElement verTodoHogar;

	/* RECURSOS SUB MENU */

	@FindBy(how = How.XPATH, using = "(//nav[@id=\"uhf-g-nav\"]//following::li)[36]")
	@CacheLookup
	WebElement Recursos;

	@FindBy(how = How.XPATH, using = "(//*[@id=\"c-shellmenu_34\"]//following::li)[28]")
	@CacheLookup
	WebElement comprarAhora;

	public void MicrosoftExample() {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 10);

			if (Office.isDisplayed()) {
				System.out.println(Office.getText());
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				Office.click();
			};

			if (Productos.isDisplayed()) {
				System.out.println(Productos.getText());
				Productos.click();
				System.out.println(driver.getTitle());
			};

			WebElement pHogar = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("(//*[@class=\"f-sub-menu js-nav-menu nested-menu\"]//span)[1]")));

			if (pHogar.isDisplayed()) {

				System.out.println(pHogar.getText());
				System.out.println(driver.getTitle());
			};

			if (preciosParaHogar.isDisplayed()) {
				System.out.println(preciosParaHogar.getText());
				System.out.println(driver.getTitle());
			};

			if (paraIndividuos.isDisplayed()) {
				System.out.println(paraIndividuos.getText());
				System.out.println(driver.getTitle());
			};

			if (verTodoHogar.isDisplayed()) {
				System.out.println(verTodoHogar.getText());
				System.out.println(driver.getTitle());
			};

			/* RECURSOS */

			if (Recursos.isDisplayed()) {
				System.out.println(Recursos.getText());
				System.out.println(driver.getTitle());
				Recursos.click();
			};

			WebElement aCostos = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//*[@id=\"c-shellmenu_34\"]//following::li)[1]")));

			if (aCostos.isDisplayed()) {

				System.out.println(aCostos.getText());
				System.out.println(driver.getTitle());
			};

			if (comprarAhora.isDisplayed()) {
				System.out.println(comprarAhora.getText());
				System.out.println(driver.getTitle());
				comprarAhora.click();
			};

			driver.get("https://www.microsoft.com/es-mx");

			WebElement MasInformacion = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//*[@class=\"link-group\"]//parent::a)[1]")));

			if (MasInformacion.isDisplayed()) {

				System.out.println(MasInformacion.getText());
				System.out.println(driver.getTitle());
			};

			Thread.sleep(50);

			util.closeBrowser(driver);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
