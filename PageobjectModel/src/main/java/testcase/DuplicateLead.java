package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utils.ReadExcel;

public class DuplicateLead extends BaseClass{
	@BeforeClass
	public void setFileName(){
		excelFileName="DuplicateDev";
	}
	@Test(dataProvider = "fetchData")
	public void duplicateLead(String username,String password,String firstName,String Email) throws InterruptedException {
		new LoginPage(driver)
		.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeads()
		.clickFindLeads()
		.enterfirstName()
		.clickFindButton()
		.resultFirstName()
		.clickDuplicateLead()
		.changeFirstName(firstName)
		.enterEmail(Email)
		.clickCreateLeadButton();
		
		

}
}