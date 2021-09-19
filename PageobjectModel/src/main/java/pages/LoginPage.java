package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public  LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public LoginPage enterUserName(String username) throws InterruptedException {
		
		driver.findElementById("username").sendKeys(username);
		//Thread.sleep(5000);
		return this;
	}
	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	public HomePage clickLoginButton() {
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		return new HomePage(driver);
	}
}
