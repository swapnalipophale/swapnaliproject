package zerodaproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	

	// Step 1 To declare the global variable (Data Member)
	
			@FindBy (tagName="//span[text()='Orders']")
			private WebElement order;
			
			@FindBy (tagName="//span[text()='Holdings']")
			private WebElement holding;
			
			@FindBy (tagName="//span[text()='Positions']")
			private WebElement position;
			
			@FindBy (xpath="//a[@target='_self']")
			private WebElement logout1;
			
			// Step 2 Initialisation of variable
			
			public Home(WebDriver driver){
				
				PageFactory.initElements(driver, this);
			}
			
			// Step 3 Method create
			
			public void order() {
				order.click();
			}
			
			public void holding() {
				holding.click();
			}
			
			public void position() {
				position.click();
			}
			
			public void logout1() {
				logout1.click();
			}
			
			

}


