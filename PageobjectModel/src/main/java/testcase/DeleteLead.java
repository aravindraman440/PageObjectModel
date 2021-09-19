package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DeleteLead extends BaseClass{
@Test
public void deleteLead() throws InterruptedException {
	new LoginPage(driver)
	.enterUserName("DemoCSR")
	.enterPassword("crmsfa")
	.clickLoginButton()
	.clickCrmsfaLink()
	.clickLeads()
	.clickFindLeads()
	.enterfirstName()
	.clickFindButton()
	.resultFirstName()
	.clickDeleteLead();
	
	
}
}
