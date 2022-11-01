package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Zeroda.Home;
import Zeroda.login;
import Zeroda.loginpin;
import Zeroda.logout;

public class testNGcheck {
	WebDriver driver;
	login log;
	loginpin pin;
	Home home;
	logout logout1;
	
	@BeforeClass
	public void openbrowser() {
		
         System.setProperty("webdriver.chrome.driver","C:\\selenium web driver\\chromedriver_win32 (2)\\chromedriver.exe ");
      // ChromeOptions opt = new ChromeOptions();
	   //opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
		}
		
	
    @BeforeMethod
    public void logintoApplication() throws InterruptedException {
    	
    	System.out.println("Before method");	

	    log = new login(driver);
		log.enterUN();
		log.enterPASS();
		log.loginbutton();
		 
		 
	    pin = new loginpin (driver);
		 Thread.sleep(2000);
		pin.enterpin();
		pin.clicksubmit();
			
		 home =new Home(driver);
		 logout1 = new logout(driver);
		 
	    }
		
		
    @Test	
	public void test() {
			
			System.out.println("Test");	
			
			home.order();
			String url = driver.getCurrentUrl();
			if(url.equals("https://kite.zerodha.com/order")) {
				System.out.println(" Test case pass");	
			}
			else {
				System.out.println(" Test case fail");	
				
			}
			
			}
		
	
    @Test	
	public void test1() {
			
			System.out.println("Test1 ");	
			
			home.holdings();
			String url = driver.getCurrentUrl();
			if(url.equals("https://kite.zerodha.com/holdings")) {
				System.out.println(" Test case pass");	
			}
			else {
				System.out.println(" Test case fail");	
				
			}
			
			}
		
    public void test2() {
		
		System.out.println("Test2");	
		
		home.positions();
		String url = driver.getCurrentUrl();
		if(url.equals("https://kite.zerodha.com/positions")) {
			System.out.println(" Test case pass");	
		}
		else {
			System.out.println(" Test case fail");	
			
		}
		
		}
    
		 @AfterMethod
			
			public void afterMethod() throws InterruptedException {
					
					System.out.println("After Method");	
					
				home.logout1();
				logout1.clickuser();
					
					
					}
				
		 
		 @AfterClass
			
			public void afterClass() {
					
				System.out.println("After class");	
				
				driver.close();
				}
				
				
	
	

}
