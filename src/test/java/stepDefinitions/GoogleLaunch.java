package stepDefinitions;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Google;

public class GoogleLaunch 
{	 
	Google googlePage;
	
	@Given("^I enter the Google URL on chrome browser$")
	public void I_enter_the_Google_URL_on_chrome_browser()
	{
		String SiteUrl = "https://www.google.com.au";		
		Browser.driver.get(SiteUrl);		
	}
		
	@Then("^I should be redirected to the Google Search Page$")
	public void I_should_be_redirected_to_the_Google_Search_Page()
	{
		googlePage = new Google(Browser.driver);			
		assertEquals("Google", googlePage.GetTitle());
	}
}