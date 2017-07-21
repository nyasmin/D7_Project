package com.fanniemae.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.fanniemae.utils.WebDriverUtils;

public class EbayResultPage {

	public void validateRecordCount(String browser){
		String recordCount = WebDriverUtils.getWebDriver(browser).findElement(By.xpath("html/body/div[5]/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/div/div[3]/h1/span[1]")).getText();
		recordCount = recordCount.replaceAll(",", "");
		Assert.assertTrue(Integer.parseInt(recordCount)>0);
	}
	
}
