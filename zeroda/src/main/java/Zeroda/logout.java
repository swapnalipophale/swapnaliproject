package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	
	@FindBy(xpath ="  //a[text()='Change user' ] ")
	private WebElement changeuser;
	
	
	
	public logout (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickuser() {
		changeuser.click();
	}
	

}
