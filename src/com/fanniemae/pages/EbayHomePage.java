package com.fanniemae.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.fanniemae.utils.Constants;
import com.fanniemae.utils.WebDriverUtils;
import com.fanniemae.utils.WebElementUtils;

public class EbayHomePage {
	
	public static final String SEARCH_TEXT_FIELD = "html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input";
	public static final String SEARCH_BUTTON = "html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input";
	
	@FindBy(xpath=SEARCH_TEXT_FIELD)
	private WebElement searchTextField;
	
	@FindBy(xpath=SEARCH_BUTTON)
	private WebElement searchButton;
	
	public void openHomPage(String browser){
		WebDriverUtils.getWebDriver(browser).get(Constants.EBAY_HOME_URL);
	}
	public void verifyHomPage(String browser){
		WebElementUtils.waitUntilElementIsVisible(By.className("hl-cat-nav__active"),browser);
		String actualText = WebDriverUtils.getWebDriver(browser).findElement(By.className("hl-cat-nav__active")).getText();
		String expectedText = "Home";
		System.out.println("actualText"+actualText);
		Assert.assertEquals(expectedText, actualText);
	}

	public void searchItem(String browser, String item2search){
		WebDriverUtils.getWebDriver(browser).findElement(By.xpath(SEARCH_TEXT_FIELD)).clear();
		WebDriverUtils.getWebDriver(browser).findElement(By.xpath(SEARCH_TEXT_FIELD)).sendKeys(item2search);
		WebDriverUtils.getWebDriver(browser).findElement(By.xpath(SEARCH_BUTTON)).click();
	}
}
