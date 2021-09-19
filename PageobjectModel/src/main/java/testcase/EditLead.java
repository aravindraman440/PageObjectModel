package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utils.ReadExcel;

public class EditLead extends BaseClass{
	@BeforeClass
	public void setFileName(){
		excelFileName="EditDev";
	}
	@Test(dataProvider = "fetchData")
 public void edit(String username,String password,String title,String description ) throws InterruptedException {
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
	 .clickEdit()
	 .enterTitle(title)
	 .enterDescription(description)
	 .clickUpdateButton();
	 
	 
		 
	 
 }

	
}