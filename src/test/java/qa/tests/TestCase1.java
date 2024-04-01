package qa.tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utility.ElementFetch;

public class TestCase1 extends BaseClass {
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();

  @Test
  public void sampleMethodForEnteringCredentials() {
	  	logger.info("Sign in into the Login Page");
		homePage.signinButton();
		logger.info("Verifying the Login Page");
		loginPage.verifyLoginPageIsLoaded();
		logger.info("Enter the User Name and Password");
		loginPage.enterCredentials();

	}

}
