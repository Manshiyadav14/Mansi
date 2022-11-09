package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutComplete {
	
	@FindBy (xpath="//button[@id='back-to-products']") private WebElement BackHome;
	
	public CheckOutComplete(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnBackHome() {
		BackHome.click();
	}

}
