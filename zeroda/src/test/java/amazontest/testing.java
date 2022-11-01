package amazontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Amazon.Home;

public class testing {
	WebDriver driver;
	 Home home;
	 
	 @Parameters("Browser")
	 
	 @BeforeTest
	 public void Openbrowser(String browsername){
		 
		 System.out.println(browsername);
		 
		 if(browsername.equals("Chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\balaji\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		    driver = new ChromeDriver();
		    
		 }
		 
		 if(browsername.equals("Firefox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\balaji\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			    driver = new FirefoxDriver();
			   
			 }
			 
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
		 
	 }
	 
	 
	 
	 
	@BeforeClass
	public void Allobject() {
		System.out.println("Beforeclass");
		 home =new Home(driver);
		
	}
	
	@BeforeMethod
	public void searchbar() {
		
	System.out.println("Beforemethod");
	
	 home.searchbar();
	 home.submit();
	 home.mobileclick();
	// home.add();
	 
	
	
	}
	
	
	@Test 
	public void test() {
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2000)");
		
		home.check();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	
	}
	
	@AfterMethod
	public void closepage() {
		System.out.println("aftermethod");
		
	}
	
	@AfterClass
	public void clearobject() {
		
		home=null;
		System.out.println("afterclass");
			
	}
	
	@AfterTest
	public void Closebrowser() {
		System.out.println("aftertest");
		
		 driver.close();
		 System.gc();
	}
	
	

}