package stepDefinitions;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SecurePay;

public class NavigateToSecurePayOnlinePayments {
	WebDriver driver;	
    SecurePay securepay;
    
	@Given("^I am at the SecurePay Website$")
	public void I_am_at_the_SecurePay_Website()
	{
		String Url = "https://www.securepay.com.au";
	    String driverPath = ".\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.get(Url);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
			
	}
	
	@When("^I click on SecurePay Online Payments link$")
	public void I_click_on_SecurePay_Online_Payments_link() throws InterruptedException
	{
		securepay = new SecurePay(driver);
		securepay.NavigateToSecurePayOnlinePayments();
	}
		
	
	@Then("I should be redirected to the SecurePay Online Payments page$")
	public void I_should_be_redirected_to_the_SecurePay_Online_Payments_page() throws InterruptedException
	{
		securepay = new SecurePay(driver);
		Thread.sleep(3000);
		assertEquals("https://www.securepay.com.au/solutions/securepay-online-payments/", securepay.GetUrl());
		driver.close();
		driver.quit();
	}
}