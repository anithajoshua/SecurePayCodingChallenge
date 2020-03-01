package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUs;
import pages.SecurePay;

public class NavigateToContactUs {
	SecurePay securepay;
	ContactUs contactus;
	
	@Given("^I am on the SecurePay Website$")
	public void I_am_on_the_SecurePay_Website()
	{
		String SiteUrl = "https://www.securepay.com.au";
	    Browser.driver.get(SiteUrl);		
	}
	
	@When("^I click on Contact us link$")
	public void I_click_on_Contact_us_link()
	{
		securepay = new SecurePay(Browser.driver);
		securepay.NavigateToContactus();
	}
		
	@Then("^I should be navigated to the Contact us page$")
	public void I_should_be_navigated_to_the_contact_us_page() throws InterruptedException
	{
		contactus = new ContactUs(Browser.driver);
		WebDriverWait wait = new WebDriverWait(Browser.driver,1000);
		wait.until(ExpectedConditions.visibilityOf(contactus.HeadingContactUs));
		assertEquals(securepay.GetUrl(), "https://www.securepay.com.au/support/contact-us/");

	}

}
