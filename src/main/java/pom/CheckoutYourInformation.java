package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformation {
	
	@FindBy (xpath="//input[@id='first-name']") private WebElement FirstName ;
	@FindBy (xpath="//input[@id='last-name']") private WebElement LastName ;
	@FindBy (xpath="//input[@id='postal-code']") private WebElement PostalCode ;
	@FindBy (xpath="//button[@id='cancel']") private WebElement Cancel ;
	@FindBy (xpath="//input[@id='continue']") private WebElement Continue ;
	
	public CheckoutYourInformation(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	public void ClickOnFirstName(String name) {
		FirstName.sendKeys(name);
	}
	public void ClickOnLastName(String name) {
		LastName.sendKeys(name);
	}
	public void EnterZipCode() {
		PostalCode.click();
	}
	public void ClickOnCancel() {
		Cancel.click();
	}
	public void ContinueShopping() {
		Continue.click();
	}

}
