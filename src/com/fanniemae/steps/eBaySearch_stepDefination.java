package com.fanniemae.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.fanniemae.pages.EbayHomePage;
import com.fanniemae.pages.EbayResultPage;
import com.fanniemae.utils.Constants;
import com.fanniemae.utils.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class eBaySearch_stepDefination {
	
	private String browser = Constants.FF_BROWSER;
	
	@Given("^User is on eBay Home Page$")
	public void user_is_on_eBay_Home_Page() throws Throwable {
		EbayHomePage ebayHomePage = new EbayHomePage();
		ebayHomePage.openHomPage(browser);
		ebayHomePage.verifyHomPage(browser);
		
	}

	@When("^user search for \"([^\"]*)\"$")
	public void user_search_for(String arg1) throws Throwable {
		EbayHomePage ebayHomePage = new EbayHomePage();
		ebayHomePage.searchItem(browser, arg1);
		Thread.sleep(3000);;
		
	}

	@Then("^user is on search result page$")
	public void user_is_on_search_result_page() throws Throwable {
		EbayResultPage ebayResultPage = new EbayResultPage();
		ebayResultPage.validateRecordCount(browser);
	}
}
