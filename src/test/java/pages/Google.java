package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Browser;

public class Google {
	

	public Google(WebDriver rdriver)
	{
	Browser.driver=rdriver;
	PageFactory.initElements(rdriver,this);

	}

	@FindBy(name = "q")
	private WebElement Searchbox;
	
	@FindBy(xpath = "//*[contains(text(), 'SecurePay online payment')][1]")
	private WebElement SearchResultlink;

	public void GoogleSearch(String text)
	{
		Searchbox.click();
		Searchbox.sendKeys(text + Keys.RETURN);	
	}
	
	public String GetTitle()
	{
		return (Browser.driver.getTitle());
	}
		
	public boolean SearchResult()
	{
		return (SearchResultlink.isDisplayed());
	}
	
	public void SecurePayClick()
	{
		SearchResultlink.click();
	}
}
