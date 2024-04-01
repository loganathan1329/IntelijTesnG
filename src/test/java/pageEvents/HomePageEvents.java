package pageEvents;

import pageObjects.HomepageElements;
import utility.ElementFetch;

public class HomePageEvents {
	ElementFetch ele = new ElementFetch();
	
	public void signinButton() {
		ele.getWebElement("XPATH", HomepageElements.signInButtonText_xpath).click();
	}

}
