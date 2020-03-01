package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Browser;

public class SecurePayOnlinePayments {
	
public SecurePayOnlinePayments(WebDriver rdriver)
{
Browser.driver=rdriver;
PageFactory.initElements(rdriver,this);

}

@FindBy(xpath = "//h2[contains(text(),'SecurePay Online Payments')]")
public WebElement lnkSecurePayOnlinePayments;
}
