package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Google;

public class GoogleLaunch 
{	 
	WebDriver driver;
	Google googlePage;
	
	@Given("^I enter the Google URL on chrome browser$")
	public void I_enter_the_Google_URL_on_chrome_browser()
	{
		String Url = "https://www.google.com.au";
		String driverPath = ".\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get(Url);		
	}
	
	
	@Then("^I should be redirected to the Google Search Page$")
	public void I_should_be_redirected_to_the_Google_Search_Page()
	{
		googlePage = new Google(driver);			
		assertEquals("Google", googlePage.GetTitle());
		driver.close();
		driver.quit(); 
	}
}