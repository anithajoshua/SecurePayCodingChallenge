package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SecurePay;

public class FillContactForm {
	WebDriver driver;	
    SecurePay securepay;
	
	@Given("^I am at the Contact us page of the SecurePay Website$")
	public void I_am_at_the_Contact_us_page_of_the_SecurePay_Website()
	{
		String Url = "https://www.securepay.com.au";
	    String driverPath = ".\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get(Url);
		securepay = new SecurePay(driver);
		securepay.NavigateToContactus();			
	}
	
	@When("^I enter details for all the fields$")
	public void I_enter_details_for_all_the_fields()
	{
		String FirstName = securepay.GenerateRandomString(15);
		String LastName = securepay.GenerateRandomString(15);
		String Email = securepay.GenerateRandomString(15) + "securepay.com";
		String Phone = RandomStringUtils.randomNumeric(10);
		String Url = securepay.GenerateRandomString(15) + ".com.au";
		String Company = securepay.GenerateRandomString(15);
		String Message = securepay.GenerateRandomString(25);

		securepay.FillContactUsForm(FirstName, LastName, Email, Phone, Url, Company, Message);
	        
	}
		
	@Then("^I should be able see the details entered$")
	public void I_should_be_able_see_the_details_entered()
	{
		driver.close();
		driver.quit();

	}

}
