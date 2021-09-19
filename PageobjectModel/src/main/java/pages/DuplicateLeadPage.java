package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class DuplicateLeadPage extends BaseClass {
public DuplicateLeadPage(ChromeDriver driver) {
	this.driver=driver;
}
public DuplicateLeadPage changeFirstName(String firstName) {
	WebElement name = driver.findElementByXPath("(//input[@name='firstName'])[3]");
	name.clear();
	name.sendKeys(firstName);
	return this;
}
public DuplicateLeadPage enterEmail(String Email) {
	WebElement email = driver.findElementById("createLeadForm_primaryEmail");
	email.clear();
	email.sendKeys(Email);
	return this;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElementByXPath("//input[@value='Create Lead']").click();
	return new ViewLeadPage(driver);
}
}
