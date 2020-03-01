package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinitions.Browser;

public class ContactUs {
	
	public ContactUs(WebDriver rdriver)
	{
	Browser.driver=rdriver;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id = "logo")
	public WebElement Logo;
	
	@FindBy(name = "first-name")
	private static WebElement txtFirstName;
	
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
	
	@FindBy(xpath = "//h1[contains(text(),'Contact us')]")
	public WebElement HeadingContactUs;
		
	public String GetUrl()
	{
		return (Browser.driver.getCurrentUrl());
	}
	
	public void LogoClick()
	{
		Logo.click();
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
	
	public String GetFirstNameText()
	{
		return txtFirstName.getAttribute("placeholder");
	}
	public String GetLastNameText()
	{
		return txtLastName.getAttribute("placeholder");
	}
	public String GetEmailText()
	{
		return txtEmail.getAttribute("placeholder");
	}
	public String GetPhoneText()
	{
		return txtPhone.getAttribute("placeholder");
	}
	public String GetUrlText()
	{
		return txtWebsiteURL.getAttribute("placeholder");
	}
	public String GetCompanyText()
	{
		return txtCompany.getAttribute("placeholder");
	}
	public String GetMessageText()
	{
		return cboMessage.getAttribute("placeholder");
	}
}
