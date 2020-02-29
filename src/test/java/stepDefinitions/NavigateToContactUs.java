package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SecurePay;

public class NavigateToContactUs {
	WebDriver driver;	
	SecurePay securepay;

	@Given("^I am on the SecurePay Website$")
	public void I_am_on_the_SecurePay_Website()
	{
		String Url = "https://www.securepay.com.au";
	    String driverPath = ".\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);	
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		driver.get(Url);		
	}
	
	@When("^I click on Contact us link$")
	public void I_click_on_Contact_us_link()
	{
		securepay = new SecurePay(driver);
		securepay.NavigateToContactus();
	}
		
	@Then("^I should be navigated to the Contact us page$")
	public void I_should_be_navigated_to_the_contact_us_page() throws InterruptedException
	{
		securepay = new SecurePay(driver);
		Thread.sleep(3000);
		assertEquals(securepay.GetUrl(), "https://www.securepay.com.au/support/contact-us/");
		driver.close();
		driver.quit();

	}

}
