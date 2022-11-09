package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath="//button[text()='Open Menu']") private WebElement Mainmenu ;
	@FindBy (xpath="//a[text()='All Items']") private WebElement AllItems ;
	@FindBy (xpath="//a[text()='About']") private WebElement About ;
	@FindBy (xpath="//a[text()='Logout']") private WebElement Logout ;
	@FindBy (xpath="//a[text()='Reset App State']") private WebElement ResetAppState ;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement SauceLabsBackPack ;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement SauceLabsBikeLight ;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement SauceLAabsBoltShirt ;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement SauceLabsFleeceJacket ;
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement SauceLabsOnesie ;
	@FindBy (xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement SauceLabsRedTshirt ;
	@FindBy (xpath="//select[@class='product_sort_container']") private WebElement NameAtoZ ;
	
	public void HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void ClickOnMenu () {
		Mainmenu.click();
	}
	public void ClickOnAllItems () {
		AllItems.click();
	}
	public void ClickOnAbout () {
		About.click();
	}
	public void ClickOnLogout () {
		Logout.click();
	}
	public void ClickOnReset() {
		ResetAppState.click();
	}
	public void AddToCartBackPack () {
		SauceLabsBackPack.click();
	}
	public void AddToCartBikeLight() {
		SauceLabsBikeLight.click();
	}
	public void AddToCartBoltShirt() {
		SauceLabsBikeLight.click();
	}
    public void AddToCartFleeceJacket () {
    	SauceLabsFleeceJacket.click();
    }
    public void AddToCartOneSie () {
    	SauceLabsOnesie.click();
    }
    public void AddToCartSauceLabsRedTshirt () {
    	SauceLabsRedTshirt.click();
    }
    public void AddToCartNameAtoZ () {
    	NameAtoZ.click();
    }
}
