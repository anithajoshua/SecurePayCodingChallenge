package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Google;

public class SearchSecurePay 
{	
	WebDriver driver;	
    Google googlePage;
	 
	@Given("^I enter the Google URL$")
	public void I_enter_the_Google_URL()
	{
		String Url = "https://www.google.com.au";
	    String driverPath = ".\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(Url);		
	}
	
	@When("^I search for SecurePay$") 
	public void I_search_for_SecurePay()
	{
		googlePage = new Google(driver);
		googlePage.GoogleSearch("SecurePay");	
	}
	
	@Then("^The search should list the Securepay links$")
	public void The_search_should_list_the_Securepay_links()
	{
		assertTrue(googlePage.SearchResult());
		driver.close();
		driver.quit();
	}

}