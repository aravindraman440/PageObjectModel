package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	public  MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
public MyLeadsPage clickLeads() {
	driver.findElementByLinkText("Leads").click();
	return new MyLeadsPage(driver);
}

}
