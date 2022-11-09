package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath="//input[@id='user-name']") private WebElement userName ;
	@FindBy (xpath="//input[@id='password']") private WebElement password ;
	@FindBy (xpath="//input[@type='submit']") private WebElement Login ;
	
	public LoginPage(WebDriver driver)  {
		PageFactory.initElements(driver,this);
	}
   public void enterUserName (String user) {
	   userName.sendKeys(user);
   }
   public void enterPassword (String pass) {
	   password.sendKeys(pass);
   }
   public void clickonLogin () {
	   Login.click();
   }
}
