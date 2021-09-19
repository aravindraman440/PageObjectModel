package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {
	public ChromeDriver driver;
	public String excelFileName;
	@BeforeMethod
 public void preCondition() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//STEP1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 }
	@AfterMethod
	public void postCondition() {
	driver.close();
}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		ReadExcel re=new ReadExcel();
		String[][] data=re.excelData(excelFileName);
		return data;
	}
} 