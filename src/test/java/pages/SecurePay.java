package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SecurePay {
	
	WebDriver driver;
	
	public SecurePay(WebDriver rdriver)
	{
	driver=rdriver;
	PageFactory.initElements(rdriver,this);

	}
	@FindBy(id = "logo")
	private WebElement Logo;
	
	@FindBy(linkText = "Solutions")
	private WebElement lnkSolutions;
	
	@FindBy(linkText = "Pricing")
	private WebElement lnkPricing;
	
	@FindBy(linkText = "Features")
	private WebElement lnkFeatures;
	
	@FindBy(linkText = "How We Help")
	private WebElement lnkHowWeHelp;
	
	@FindBy(linkText = "Developers")
	private WebElement lnkDevelopers;
	
	@FindBy(linkText = "Partners")
	private WebElement lnkPartners;
	
	@FindBy(linkText = "Support")
	private WebElement lnkSupport;
	
	@FindBy(linkText = "Contact Us")
	private WebElement lnkContactus;
	
	@FindBy(linkText = "SecurePay Online Payments")
	private WebElement lnkSecurePayOnlinePayments;
	
	/****** WebElements on Contact us form ********/
	
	@FindBy(name = "first-name")
	private WebElement txtFirstName;
	
	@FindBy(name = "last-name")
	private WebElement txtLastName;
	
	@FindBy(name = "email-address")
	private WebElement txtEmail;
	
	@FindBy(name = "phone-number")
	private WebElement txtPhone;

	@FindBy(name = "website-url")
	private WebElement txtWebsiteURL;
	
	@FindBy(name = "business-name")
	private WebElement txtCompany;
	
	@FindBy(name = "reason-for-enquiry")
	private WebElement cboReasonforenquiry;
	
	@FindBy(name = "message")
	private WebElement cboMessage;
	
	public String GetUrl()
	{
		return (driver.getCurrentUrl());
	}
	
	public void LogoClick()
	{
		Logo.click();
	}
	
	public void NavigateToSolutions()
	{
		lnkSolutions.click();
	}
	
	public void NavigateToPricing()
	{
		lnkPricing.click();
	}

	public void NavigateToFeatures()
	{
		lnkFeatures.click();
	}
	
	public void NavigateToHowWeHelp()
	{
		lnkHowWeHelp.click();
	}
	
	public void NavigateToDevelopers()
	{
		lnkDevelopers.click();
	}	
	
	public void NavigateToPartners()
	{
		lnkPartners.click();
	}
	
	public void NavigateToSupport()
	{
		lnkSupport.click();
	}
	
	public void NavigateToContactus()
	{
		Actions action = new Actions(driver);
		action.moveToElement(lnkSupport).perform();
		lnkContactus.click();
	}

	public void NavigateToSecurePayOnlinePayments()
	{
		Actions action = new Actions(driver);
		action.moveToElement(lnkSolutions).perform();
		lnkSecurePayOnlinePayments.click();
	}
	
	public String GenerateRandomString(int n)
	{
	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

	StringBuilder randomstring = new StringBuilder(n);
	for ( int i = 0; i < n; i++) 
	{
	int index = (int)(AlphaNumericString.length() * Math.random());
	randomstring .append(AlphaNumericString.charAt(index));
	}
	return randomstring.toString();
	}
	
	public void FillContactUsForm(String FirstName, String LastName, String Email, String Phone, String Url, String Company, String Message)
	{
		txtFirstName.sendKeys(FirstName);
		txtLastName.sendKeys(LastName);
		txtEmail.sendKeys(Email);
		txtPhone.sendKeys(Phone);
		txtWebsiteURL.sendKeys(Url);
		txtCompany.sendKeys(Company);
		cboReasonforenquiry.click();
		Select select = new Select(cboReasonforenquiry);
		select.selectByVisibleText("Support");
		cboMessage.sendKeys(Message);
	}
}
	
	
