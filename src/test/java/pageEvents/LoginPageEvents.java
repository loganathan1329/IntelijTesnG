package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utility.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch ele = new ElementFetch();

	public void verifyLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText_xpath).size()>0, 
				"Element not found");	
		System.out.println("Assertion is passed");
	}
	
	public void enterCredentials() {
		ele.getWebElement("XPATH", LoginPageElements.emailText_xpath).sendKeys("logu@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordText_xpath).sendKeys("12345");
	}
}
