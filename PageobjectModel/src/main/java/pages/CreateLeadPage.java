package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	public  CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
public CreateLeadPage enterCompanyName(String companyName) {
	driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	return this;
}
public CreateLeadPage enterFirstName(String firstName) {
	driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
	return this;
}
public CreateLeadPage enterLastName(String lastName) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
	return this;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElementByName("submitButton").click();
	return new ViewLeadPage(driver);
}
}
