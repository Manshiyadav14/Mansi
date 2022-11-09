package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCart {
	@FindBy (xpath="//button[text()='Remove']") WebElement Remove ;
	@FindBy (xpath="//button[@id=\"checkout\"]") WebElement CheckOut ;
	@FindBy (xpath="//button[@id='continue-shopping']") WebElement ContinueShopping ;
	@FindBy (xpath="//a[text()='Twitter']") WebElement Twitter ;
	@FindBy (xpath="//a[text()='Facebook']") WebElement FaceBook ;
	@FindBy (xpath="//a[text()='LinkedIn']") WebElement LinkedIn ;
	
	public YourCart (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnRemove() {
		Remove.click();
	}
	public void ClickOnCheckOut() {
		CheckOut.click();
	}
	public void ClickOnContinueShopping() {
		ContinueShopping.click();
	}
	public void ClickOnTwitter() {
		Twitter.click();
	}
	public void ClickOnFaceBook() {
		FaceBook.click();
	}
	public void ClickOnLinkedIn() {
		LinkedIn.click();
	}
    
}
