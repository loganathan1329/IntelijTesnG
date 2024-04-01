package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class ElementFetch {
public WebElement getWebElement(String identifiertype, String identifiervalue)
{
	switch(identifiertype)
	{
	case "ID":
		return BaseClass.driver.findElement(By.id(identifiervalue));
	case "NAME":
		return BaseClass.driver.findElement(By.name(identifiervalue));
	case "LINKTEXT":
		return BaseClass.driver.findElement(By.linkText(identifiervalue));
	case "PARTIALLINKTEXT":
		return BaseClass.driver.findElement(By.partialLinkText(identifiervalue));
	case "XPATH":
		return BaseClass.driver.findElement(By.xpath(identifiervalue));
	case "CSS":
		return BaseClass.driver.findElement(By.cssSelector(identifiervalue));	
	case "TAG":
		return BaseClass.driver.findElement(By.tagName(identifiervalue));
	case "CLASS":
		return BaseClass.driver.findElement(By.className(identifiervalue));
	default:
		return null;
}
}

public List<WebElement> getWebElements(String identifiertype, String identifiervalue)
{
	switch(identifiertype)
	{
	case "ID":
		return BaseClass.driver.findElements(By.id(identifiervalue));
	case "NAME":
		return BaseClass.driver.findElements(By.name(identifiervalue));
	case "LINKTEXT":
		return BaseClass.driver.findElements(By.linkText(identifiervalue));
	case "PARTIALLINKTEXT":
		return BaseClass.driver.findElements(By.partialLinkText(identifiervalue));
	case "XPATH":
		return BaseClass.driver.findElements(By.xpath(identifiervalue));
	case "CSS":
		return BaseClass.driver.findElements(By.cssSelector(identifiervalue));	
	case "TAG":
		return BaseClass.driver.findElements(By.tagName(identifiervalue));
	case "CLASS":
		return BaseClass.driver.findElements(By.className(identifiervalue));
	default:
		return null;
}
}
}

