package com.fanniemae.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverUtils {
	
	private static WebDriver driver;
	
	public static void setDriverExecutables(String browser){
		
		if(browser.equalsIgnoreCase(Constants.FF_BROWSER)){
		System.setProperty(Constants.FF_WEB_DRIVER_PROPERTY, Constants.FF_WEB_DRIVER_EXECUTABLE);
		}else if(browser.equalsIgnoreCase(Constants.IE_BROWSER)){
		System.setProperty(Constants.IE_WEB_DRIVER_PROPERTY, Constants.IE_WEB_DRIVER_EXECUTABLE);
		}else if(browser.equalsIgnoreCase(Constants.CHROME_BROWSER)){
		System.setProperty(Constants.CHROME_WEB_DRIVER_PROPERTY, Constants.CHROME_WEB_DRIVER_EXECUTABLE);
		}
		
	}
	
	public static WebDriver getWebDriver(String browser){
		if(driver == null){
		setDriverExecutables(browser);
		if(browser.equalsIgnoreCase(Constants.FF_BROWSER)){
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase(Constants.IE_BROWSER)){
			driver = new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase(Constants.CHROME_BROWSER)){
			driver = new ChromeDriver();
		}
		}
			return driver;
		
	}

}
