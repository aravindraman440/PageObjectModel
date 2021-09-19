package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utils.ReadExcel;

public class CreateLead extends BaseClass {
	@BeforeClass
	public void setFileName(){
		excelFileName="CreateDev";
	}
	@Test(dataProvider = "fetchData")
public void createLead(String username,String password
		,String companyName,String firstName,String lastName) throws InterruptedException {
	new LoginPage(driver)
	.enterUserName(username)
	.enterPassword(password)
	.clickLoginButton()
	.clickCrmsfaLink()
	.clickLeads()
	.clickCreateLead()
	.enterCompanyName(companyName)
	.enterFirstName(firstName)
	.enterLastName(lastName)
	.clickCreateLeadButton();
	
}
	
}
