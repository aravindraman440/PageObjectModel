package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginAndLogout extends BaseClass {
@Test
	public void loginAndLogout() throws InterruptedException {
		new LoginPage(driver)
		.enterUserName("DemoCSR").enterPassword("crmsfa").clickLoginButton()
		.clickLogout();

}
}
