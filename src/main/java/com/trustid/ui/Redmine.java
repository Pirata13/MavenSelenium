package com.trustid.ui;

import static org.junit.Assert.assertTrue;

/*import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;*/
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.trustid.utilities.ReadExcelFile;
import com.trustid.utilities.RedmineData;
import com.trustid.utilities.Utilities;


public class Redmine {

	WebDriver driver;
	Utilities util = new Utilities();

	public Redmine(WebDriver driver) {
		this.driver = driver;
	}

	/* LOGIN PAGE */

	@FindBy(how = How.CSS, using = "input#username")
	@CacheLookup
	WebElement username;
	@FindBy(how = How.CSS, using = "input#password")
	@CacheLookup
	WebElement password;
	@FindBy(how = How.CSS, using = "input#login-submit")
	@CacheLookup
	WebElement acceder;
	
	/* HOME */
	@FindBy(how = How.CSS, using = ".spent_time")
	@CacheLookup
	WebElement spendTime;
	
	/* SPEND TIME PAGE */
	@FindBy(how = How.CSS, using = "#content h2:first-of-type")
	@CacheLookup
	WebElement pspendTime;
	
	@FindBy(how = How.CSS, using = ".contextual a")
	@CacheLookup
	WebElement logTime;
	
	@FindBy(how = How.CSS, using = "select#operators_spent_on")
	@CacheLookup
	WebElement periodWeek;
	
	@FindBy(how = How.CSS, using = "select#add_filter_select")
	@CacheLookup
	WebElement user;
	
	@FindBy(how = How.CSS, using = "a.icon.icon-checked")
	@CacheLookup
	WebElement apply;
	
	@FindBy(how = How.CSS, using = "p.nodata")
	@CacheLookup
	WebElement nodata;

	
	/*LOG TIME PAGE*/
	@FindBy(how = How.CSS, using = "#account")
	@CacheLookup
	WebElement account;
	
	@FindBy(how = How.CSS, using = ".logout")
	@CacheLookup
	WebElement logout;
	
	@FindBy(how = How.CSS, using = "select#time_entry_project_id")
	@CacheLookup
	WebElement project;
	
	@FindBy(how = How.CSS, using = "input#time_entry_issue_id")
	@CacheLookup
	WebElement issue;
	
	@FindBy(how = How.CSS, using = "label[for='time_entry_spent_on']")
	@CacheLookup
	WebElement dateLabel;
	
	@FindBy(how = How.CSS, using = "input#time_entry_spent_on")
	@CacheLookup
	WebElement date;
	
	@FindBy(how = How.CSS, using = "input#time_entry_hours")
	@CacheLookup
	WebElement hours;
	
	@FindBy(how = How.CSS, using = "input#time_entry_comments")
	@CacheLookup
	WebElement comment;
	
	@FindBy(how = How.CSS, using = "select#time_entry_activity_id")
	@CacheLookup
	WebElement activity;
	
	
	public void Login() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
				
		wait.until(ExpectedConditions.visibilityOf(acceder));
		
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("saul.alvarez@unosquare.com");
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Kasparov.14");
		acceder.click();
		

		wait.until(ExpectedConditions.visibilityOf(spendTime));
		wait.until(ExpectedConditions.elementToBeClickable(spendTime));
		spendTime.click();
		
	}

	public void Register() {
		
		try {
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		
		wait.until(ExpectedConditions.elementToBeClickable(logTime));
		logTime.click();
		
		/*
		 * wait.until(ExpectedConditions.visibilityOf(project));
		 * wait.until(ExpectedConditions.elementToBeClickable(project));
		 * 
		 * 
		 * Select selectPrj = new Select(project);
		 * 
		 * selectPrj.selectByIndex(1);
		 * 
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(issue));
		 * wait.until(ExpectedConditions.elementToBeClickable(issue));
		 * 
		 * issue.sendKeys("57997");
		 * 
		 * dateLabel.click();
		 * 
		 * System.out.println(date.getAttribute("value").toString());
		 * 
		 * String currentDate = date.getAttribute("value").toString();
		 * 
		 * String testDate = "19-07-2022"; date.sendKeys(testDate);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * Date todaysDate = null;
		 * 
		 * try { todaysDate = new SimpleDateFormat("dd-MM-yyyy").parse(currentDate); }
		 * catch (ParseException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * if (todaysDate.equals(null)) {
		 * 
		 * System.out.println("Algo fue mal extrayendo el dia actual");
		 * 
		 * }
		 * 
		 * 
		 * Calendar cal = Calendar.getInstance();
		 * 
		 * System.out.println(Calendar.SUNDAY);
		 * 
		 * if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
		 * 
		 * cal.setTime(todaysDate); boolean monday = cal.get(Calendar.DAY_OF_WEEK) ==
		 * Calendar.MONDAY;
		 * 
		 * System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		 * System.out.println(Calendar.MONDAY);
		 * 
		 * assertTrue(monday); }
		 *
		 */
		
		/*GENERATING DAYS STACK*/
		
		String issue = "57997";
		
		List<RedmineData> rmd = ReadExcelFile.findRealRows("horas");
		
		//Just to validate that I have the 5th elements
		
		rmd.forEach(System.out::println);
		
			for (Iterator<RedmineData> iterator = rmd.iterator(); iterator.hasNext();) {
				RedmineData redmineData = (RedmineData) iterator.next();
				redmineData.toString();
				
				WebElement projecto = driver.findElement(By.cssSelector("select#time_entry_project_id"));
				wait.until(ExpectedConditions.visibilityOf(projecto));
				wait.until(ExpectedConditions.elementToBeClickable(projecto));
				
				Select selectPrj = new Select(projecto);
				
				selectPrj.selectByIndex(1);
				
				
				WebElement clave = driver.findElement(By.cssSelector("input#time_entry_issue_id"));
				wait.until(ExpectedConditions.visibilityOf(clave));
				wait.until(ExpectedConditions.elementToBeClickable(clave));
				
				clave.clear();
				clave.sendKeys(issue);
				
				WebElement fecha = driver.findElement(By.cssSelector("label[for='time_entry_spent_on']"));
				fecha.click();
				
				WebElement fechaDia = driver.findElement(By.cssSelector("input#time_entry_spent_on"));
				fechaDia.sendKeys(redmineData.getDay());
				
				WebElement horas = driver.findElement(By.cssSelector("input#time_entry_hours"));
				horas.sendKeys(redmineData.getHours());
				
				Thread.sleep(1000);
				
				WebElement comentario = driver.findElement(By.cssSelector("input#time_entry_comments"));
				comentario.sendKeys(redmineData.getComment());
				
				WebElement actividad = driver.findElement(By.cssSelector("select#time_entry_activity_id"));
				Select selectAct = new Select(actividad);
				selectAct.selectByVisibleText(redmineData.getActivity());
				
				Thread.sleep(1000);
				
				//driver.navigate().refresh();
				WebElement createAndContinue = driver.findElement(By.cssSelector("input[name='continue']"));
				wait.until(ExpectedConditions.visibilityOf(createAndContinue));
				wait.until(ExpectedConditions.elementToBeClickable(createAndContinue));
				createAndContinue.click();
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			util.closeBrowser(driver);
		}
		
	}

	public void Validation() {

		try {

			WebDriverWait wait = new WebDriverWait(driver, 25);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".spent_time"))));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(".spent_time"))));
			driver.findElement(By.cssSelector(".spent_time")).click();

			System.out.println(pspendTime.getText());
			assert pspendTime.getText().equalsIgnoreCase("Spent time");

			Select selectWk = new Select(periodWeek);

			selectWk.selectByVisibleText("this week");

			wait.until(ExpectedConditions.visibilityOf(user));
			wait.until(ExpectedConditions.elementToBeClickable(user));

			Select selectUsr = new Select(user);
			selectUsr.selectByVisibleText("User");

			Thread.sleep(1000);

			wait.until(ExpectedConditions.visibilityOf(apply));
			wait.until(ExpectedConditions.elementToBeClickable(apply));

			apply.click();

			if (util.CSSElementDisplayed(driver, "p.nodata")) {

				System.err.println(nodata.getText());	

			}else {
				
				assertTrue (driver.findElement(By.cssSelector("span.value")).getText().equalsIgnoreCase("40.00"));
			}

			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void Logout() {
		
		/*LOGGING OUT FROM REDMINE*/
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		
		Utilities util = new Utilities();
		
		wait.until(ExpectedConditions.visibilityOf(account));
		wait.until(ExpectedConditions.elementToBeClickable(account));
		
		account.click();
		
		wait.until(ExpectedConditions.visibilityOf(logout));
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();
		
		util.closeBrowser(driver);
		
	}
}
