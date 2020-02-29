package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import static org.junit.Assert.assertEquals;

public class NavigateToSecurePay {
	
	WebDriver driver = new ChromeDriver();	
	Google googlePage = new Google(driver);
    SecurePay securepay;
	
	@Given("^I am on the Google Search Page$")
	public void I_am_on_the_Google_Search_Page()
	{
		
		String Url = "https://www.google.com.au";
	    String driverPath = ".\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);	
		driver.get(Url);
		driver.manage().window().maximize();
		googlePage.GoogleSearch("SecurePay");
	}
	
	@When("^I click on a SecurePay link$")
	public void I_click_on_a_SecurePay_link()
	{		
		googlePage.SecurePayClick();			
	}
		
	@Then("^I should be redirected to the SecurePay website$")
	public void I_should_be_redirected_to_the_SecurePay_website()
	{
		securepay = new SecurePay(driver);
		assertEquals(securepay.GetUrl(), "https://www.securepay.com.au/");
		driver.close();
		driver.quit();
	}
}