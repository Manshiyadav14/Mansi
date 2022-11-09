package test;

import java.io.IOException;

 
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.LoginPage;
import utility.BaseClass;
import utility.Parametrization;
@Listeners(utility.Listeners.class)
public class SwagLabLoginTest extends BaseClass  {
	//WebDriver driver ;
	
	@BeforeMethod
	public void openbrowser() {
		driver = Browser.launchChrome();
	}
	@Test
	public void swaglabloginTest() throws EncryptedDocumentException, IOException {
		LoginPage obj= new LoginPage (driver);
	String userName =	Parametrization.getExcelData("credentials", 0, 0);
	String pass = Parametrization.getExcelData("credentials", 0, 0);
		
		obj.enterUserName(userName);
		obj.enterPassword(pass);
		obj.clickonLogin();
		String expectedUrl ="https://www.saucedemo.com/inventory.html" ;
		String ActualUrl = driver.getCurrentUrl() ;
		Assert.assertEquals(ActualUrl, expectedUrl);
			
	}

}
