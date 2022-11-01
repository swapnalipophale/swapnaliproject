package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	// Step 1 To declare the global variable (Data Member)
	
				@FindBy (tagName="//span[text()='Orders']")
				private WebElement orders;
				
				
				@FindBy (tagName="//span[text()='Holdings']")
				private WebElement holdings;
				
				@FindBy (tagName="//span[text()='Positions']")
				private WebElement positions;
				
				@FindBy (tagName="//span[@class='user-id']")
				private WebElement profileName;
				
				@FindBy (tagName="//a[@target='_self']")
				private WebElement logout1;
				
				
				
				// Step 2 Initialisation of variable
				
				public Home(WebDriver driver){
					
					PageFactory.initElements(driver, this);
				}
				
				// Step 3 Method create
				
				public void order() {
					orders.click();
				}
				
				public void holdings() {
					holdings.click();
				}
				
				public void positions() {
					positions.click();
				}
				
				
				public void logout1() throws InterruptedException {
					
					profileName.click();
					Thread.sleep(2000);
					
					logout1.click();
				}
				
				

	}


