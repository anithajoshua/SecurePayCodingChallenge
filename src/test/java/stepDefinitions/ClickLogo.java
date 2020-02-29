package stepDefinitions;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SecurePay;

public class ClickLogo {
	WebDriver driver;	
    SecurePay securepay;
    
	@Given("^I am at the Contact Us page$")
	public void I_am_at_the_Contact_Us_page()
	{
		String Url = "https://www.securepay.com.au";
	    String driverPath = ".\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();	
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get(Url);
	    securepay = new SecurePay(driver);
		securepay.NavigateToSupport();
		securepay.NavigateToContactus();	
	}
	
	@When("^I click on the logo$")
	public void I_click_on_the_logo() throws InterruptedException
	{
		securepay = new SecurePay(driver);
		Thread.sleep(3000);
		securepay.LogoClick();
		Thread.sleep(3000);
	}
			
	@Then("^I am taken to SecurePay page$")
	public void I_am_taken_to_SecurePay_page()
	{
		securepay = new SecurePay(driver);
		assertEquals("https://www.securepay.com.au/", securepay.GetUrl());
		driver.close();
		driver.quit();
	}
}
