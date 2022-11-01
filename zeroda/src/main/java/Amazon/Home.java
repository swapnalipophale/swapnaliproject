package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy (xpath = " (//input[@type='text'])[1] ")
	private WebElement searchbar;
	
	@FindBy (xpath = "(//input[@type='submit'])[1] ")
	private WebElement submit;
	
	@FindBy (xpath = "(//span[@class='a-price-whole'])[1]")
	private WebElement mobileclick;
	
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	@FindBy (xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement checkout;
	
	
	public Home (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchbar() {
		searchbar.sendKeys("mobile");
	}

	public void submit() {
		submit.click();
	}
	
	public void mobileclick() {
		mobileclick.click();
	}
	
	public void add() {
		addtocart.click();
	}
	
	public void check() {
		checkout.click();
	}

}
