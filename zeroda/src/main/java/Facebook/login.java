package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login{
	
	@FindBy (xpath = ("//input[@type='text']"))
	private WebElement username ;
	
	@FindBy (xpath =("//input[@type='password']"))
	private WebElement password ;
	
	@FindBy (xpath = ("//button[@type='submit']"))
	private WebElement loginbutton ;
	
	
		public login (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void username(){
		username.click();
		username.sendKeys("7744900432");
		}
     
	 public void password(){
		 password.sendKeys("sapna2109");
	 }
	 
	 public void button(){
		 loginbutton.click();
	 }
	 
}
