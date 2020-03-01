package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Browser;

public class SecurePay {
		
	public SecurePay(WebDriver rdriver)
	{
	Browser.driver=rdriver;
	PageFactory.initElements(rdriver,this);

	}
		
	@FindBy(xpath = "//h2[contains(text(),'All-in-one payments. Create your payment experience')]")
	public WebElement HeadingSecurePay;
	
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
	
	@FindBy(className = "video-popup-trigger")
	public WebElement lnkWatchDemo;
	
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
		Actions action = new Actions(Browser.driver);
		action.moveToElement(lnkSupport).perform();
		lnkContactus.click();
	}

	public void NavigateToSecurePayOnlinePayments()
	{
		Actions action = new Actions(Browser.driver);
		action.moveToElement(lnkSolutions).perform();
		lnkSecurePayOnlinePayments.click();
	}
	
	public String GetUrl()
	{
		return (Browser.driver.getCurrentUrl());
	}
}
	
	
