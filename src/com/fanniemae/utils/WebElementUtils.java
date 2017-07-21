package com.fanniemae.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementUtils {
	
	public static void waitUntilElementIsVisible(By elementLocator, String browser){
		try{
			WebDriverWait wait = new WebDriverWait(WebDriverUtils.getWebDriver(browser),5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
