package stepDefinitions;

import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Google;

public class SearchSecurePay 
{		
    Google googlePage;
	 
	@Given("^I enter the Google URL$")
	public void I_enter_the_Google_URL()
	{
		String SiteUrl = "https://www.google.com.au";
	    Browser.driver.get(SiteUrl);		
	}
	
	@When("^I search for SecurePay$") 
	public void I_search_for_SecurePay()
	{
		googlePage = new Google(Browser.driver);
		googlePage.GoogleSearch("SecurePay");	
	}
	
	@Then("^The search should list the Securepay links$")
	public void The_search_should_list_the_Securepay_links()
	{
		assertTrue(googlePage.SearchResult());
	}

}