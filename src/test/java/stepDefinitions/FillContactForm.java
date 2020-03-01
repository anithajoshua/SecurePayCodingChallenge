package stepDefinitions;

import static org.junit.Assert.assertEquals;
import org.apache.commons.lang.RandomStringUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactUs;
import pages.SecurePay;

public class FillContactForm {	
    SecurePay securepay;
    ContactUs contactus;
    
    String FirstName;
    String LastName;
    String Email;
    String Phone;
    String Url;
    String Company;
    String Message;
	
	@Given("^I am at the Contact us page of the SecurePay Website$")
	public void I_am_at_the_Contact_us_page_of_the_SecurePay_Website()
	{
		String SiteUrl = "https://www.securepay.com.au";
	    Browser.driver.get(SiteUrl);
		securepay = new SecurePay(Browser.driver);
		securepay.NavigateToContactus();			
	}
	
	@When("^I enter details for all the fields$")
	public void I_enter_details_for_all_the_fields()
	{
		contactus = new ContactUs(Browser.driver);
		FirstName = contactus.GenerateRandomString(15);
		LastName = contactus.GenerateRandomString(15);
		Email = contactus.GenerateRandomString(15) + "@securepay.com";
		Phone = RandomStringUtils.randomNumeric(10);
		Url = contactus.GenerateRandomString(15) + ".com.au";
		Company = contactus.GenerateRandomString(15);
		Message = contactus.GenerateRandomString(25);
		contactus.FillContactUsForm(FirstName, LastName, Email, Phone, Url, Company, Message);
	}
		
	@Then("^I should be able to see the data I entered$")
	public void I_should_be_able_to_see_the_data_I_entered()
	{
		contactus = new ContactUs(Browser.driver);
		assertEquals(FirstName, contactus.GetFirstNameText());
		assertEquals(LastName, contactus.GetLastNameText());
		assertEquals(Email, contactus.GetEmailText());
		assertEquals(Phone, contactus.GetPhoneText());
		assertEquals("http://" + Url, contactus.GetUrlText());
		assertEquals(Company, contactus.GetCompanyText());
		assertEquals(Message, contactus.GetMessageText());
	}

}
