package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public  MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
public CreateLeadPage clickCreateLead() {
	driver.findElementByLinkText("Create Lead").click();
	return new CreateLeadPage(driver);
}
public FindLeadsPage clickFindLeads() {
	driver.findElementByLinkText("Find Leads").click();
	  return new FindLeadsPage(driver);
}
}
