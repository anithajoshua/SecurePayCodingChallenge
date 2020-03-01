package stepDefinitions;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUs;
import pages.SecurePay;

public class ClickLogo {
    SecurePay securepay;
    ContactUs contactus;
    
	@Given("^I am at the Contact Us page$")
	public void I_am_at_the_Contact_Us_page()
	{
		String SiteUrl = "https://www.securepay.com.au";
	    Browser.driver.get(SiteUrl);
	    securepay = new SecurePay(Browser.driver);
		securepay.NavigateToSupport();
		securepay.NavigateToContactus();	
	}
	
	@When("^I click on the logo$")
	public void I_click_on_the_logo() throws InterruptedException
	{
		contactus = new ContactUs(Browser.driver);
		WebDriverWait wait = new WebDriverWait(Browser.driver,1000);
		wait.until(ExpectedConditions.elementToBeClickable(contactus.Logo));
		contactus.LogoClick();
	}
			
	@Then("^I am taken to SecurePay page$")
	public void I_am_taken_to_SecurePay_page()
	{
		securepay = new SecurePay(Browser.driver);
		WebDriverWait wait = new WebDriverWait(Browser.driver,1000);
		wait.until(ExpectedConditions.elementToBeClickable(securepay.lnkWatchDemo));
		assertEquals("https://www.securepay.com.au/", securepay.GetUrl());
	}
}
