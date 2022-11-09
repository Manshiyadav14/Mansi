package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverview {
	
	@FindBy (xpath="//button[@id='cancel']") WebElement Cancel ;
	@FindBy (xpath="//button[@id='finish']") WebElement Finish ;
	
	public CheckOutOverview(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	public void ClickOnCancel() {
		Cancel.click();
	}
	public void ClickOnFinish() {
		Finish.click();
	}

}
