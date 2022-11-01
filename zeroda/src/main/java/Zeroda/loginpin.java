package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpin {
	
	// Step 1 To declare the global variable (Data Member)
	
			@FindBy (xpath="//input[@type='password']")
			private WebElement pin;
			
			
			@FindBy (xpath="//button[@type='submit']")
			private WebElement submit;
			
			
			// Step 2 Initialisation of variable
			
			public loginpin(WebDriver driver){
				
				PageFactory.initElements(driver, this);
			}
			
			// Step 3 Method create
			
					public void enterpin() {
						pin.sendKeys("234567");
					}
					
					public void clicksubmit() {
						submit.click();
					}
			

	}
	


