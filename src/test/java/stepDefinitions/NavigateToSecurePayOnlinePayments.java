package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SecurePay;
import pages.SecurePayOnlinePayments;

public class NavigateToSecurePayOnlinePayments{	
    SecurePay securepay;
    SecurePayOnlinePayments securepayonlinepayments;
    
	@Given("^I am at the SecurePay Website$")
	public void I_am_at_the_SecurePay_Website()
	{
		String Url = "https://www.securepay.com.au";
	    Browser.driver.get(Url);
	}
	
	@When("^I click on SecurePay Online Payments link$")
	public void I_click_on_SecurePay_Online_Payments_link()
	{
		securepay = new SecurePay(Browser.driver);
		securepay.NavigateToSecurePayOnlinePayments();
	}
		
	
	@Then("I should be redirected to the SecurePay Online Payments page$")
	public void I_should_be_redirected_to_the_SecurePay_Online_Payments_page() throws InterruptedException
	{
		securepayonlinepayments = new SecurePayOnlinePayments(Browser.driver);
		WebDriverWait wait = new WebDriverWait(Browser.driver,1000);
		wait.until(ExpectedConditions.visibilityOf(securepayonlinepayments.lnkSecurePayOnlinePayments));
		assertEquals("https://www.securepay.com.au/solutions/securepay-online-payments/", securepay.GetUrl());
	}
}