package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	public  HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
public LoginPage clickLogout() {
	driver.findElementByClassName("decorativeSubmit").click();
	return new LoginPage(driver);
}
public MyHomePage clickCrmsfaLink() {
	driver.findElementByLinkText("CRM/SFA").click();
	return new MyHomePage(driver);
}
}
