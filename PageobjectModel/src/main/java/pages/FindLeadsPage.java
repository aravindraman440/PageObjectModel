package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeadsPage extends BaseClass {
	public  FindLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
public FindLeadsPage enterfirstName() {
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Aravind");
	return this;
}
public FindLeadsPage clickFindButton() throws InterruptedException {
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(3000);
	return this;
}
public ViewLeadPage resultFirstName() {
	String text = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
	System.out.println(text);
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
	return new ViewLeadPage(driver);
}
}
