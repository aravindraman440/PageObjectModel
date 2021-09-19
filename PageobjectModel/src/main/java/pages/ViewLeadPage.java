package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	public  ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
public EditLeadPage clickEdit() {
	driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[3]").click();
	return new EditLeadPage(driver);
}
public DuplicateLeadPage clickDuplicateLead() {
	driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[1]").click();
	return new DuplicateLeadPage(driver);
}
public DuplicateLeadPage clickDeleteLead() {
	driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[4]").click();
	return new DuplicateLeadPage(driver);
}
}
