package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
	
	@FindBy (xpath ="//a[@aria-label='More']")
	private WebElement moreoptions;

   

   public homepage(WebDriver driver) { 
	PageFactory.initElements(driver, this);
   }
   
   
   
   public void enduser (WebDriver driver) {
	   moreoptions.click();
   }

  
}
