package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;//OKP335
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement passward;//ZAQ1234567
	
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginbutton;
	
	
	public login(WebDriver driver){
		
	PageFactory.initElements(driver, this);
		
	}

	
	
	
	 public void enterUN() {
		 username.sendKeys(" OKP335   ");
  	   
     }
	 
	 public void enterPASS() {
		 passward.sendKeys("ZAQ1234567");
		
     }
	 
	 public void loginbutton() {
		 loginbutton.click();
		 
	     }
}
