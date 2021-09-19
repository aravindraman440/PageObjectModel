package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass {
	public  EditLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
public EditLeadPage enterTitle(String title) {
	driver.findElementById("updateLeadForm_generalProfTitle").sendKeys(title);
	return this;
}
public EditLeadPage enterDescription(String desecription) {
	driver.findElementById("updateLeadForm_description").sendKeys(desecription);
	return this;
}
public ViewLeadPage clickUpdateButton() {
	driver.findElementByClassName("smallSubmit").sendKeys("QA Automation Analysis");
	return new ViewLeadPage(driver);
}

}
