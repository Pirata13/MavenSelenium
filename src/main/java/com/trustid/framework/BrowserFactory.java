package com.trustid.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver driver;

	public BrowserFactory(){
		 
	}

	public static WebDriver getDriver(){
		if(driver==null){
			System.out.println("Running in chrome");
			WebDriver driver = null;
			WebDriverManager.chromedriver().browserVersion("96.0.4664.55").setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized"); 
			options.addArguments("enable-automation"); 
			options.addArguments("--no-sandbox"); 
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-browser-side-navigation"); 
			options.addArguments("--disable-gpu"); 
			driver = new ChromeDriver(options); 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(33, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static WebDriver getDriver(String browserName){
		if(driver==null){
			if(browserName.equalsIgnoreCase("firefox")){
				/*
				System.setProperty("webdriver.gecko.driver", ""D:Softwaresjarsgeckodriver-v0.23.0-win64geckodriver.exe"");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);*/
			}else if(browserName.equalsIgnoreCase("chrome")){
				System.out.println("in chrome");
				WebDriver driver = null;
				WebDriverManager.chromedriver().browserVersion("96.0.4664.55").setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized"); 
				options.addArguments("enable-automation"); 
				options.addArguments("--no-sandbox"); 
				options.addArguments("--disable-infobars");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--disable-browser-side-navigation"); 
				options.addArguments("--disable-gpu"); 
				driver = new ChromeDriver(options); 
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(33, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
				
				return driver;
			}else if(browserName.equalsIgnoreCase("IE")){
				/*System.setProperty("webdriver.ie.driver", ""D:SoftwaresjarsIEDriverServer_Win32_3.14.0IEDriverServer.exe"");
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);*/
			}
		}
		return driver;
	}
}