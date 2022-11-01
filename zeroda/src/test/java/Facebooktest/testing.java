package Facebooktest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Facebook.homepage;
import Facebook.login;

public class testing {
	WebDriver driver;
	login login;
	homepage home;
	
	@BeforeTest
	public void openbrowser() {
		System.out.println("Before test");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balaji\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		
	}
	
	@BeforeClass
	public void objects() {
		System.out.println("Before class");
		  login = new login(driver);
		  home = new homepage(driver);
		 
	}
	
	@BeforeMethod
	public void Login(){
		System.out.println("Before methode");
		
	login.username();
	login.password();
	login.button();
	
	}
	
	@Test 
	public void test () {
		
		System.out.println("test class");
		String Tital = driver.getTitle();
		
		System.out.println("Tital");
	
	}
	
	@AfterMethod
	public void closetab() {
		
		System.out.println("after class");
		driver.getCurrentUrl();
	}
	
	@AfterClass
	public void close() {
		System.out.println("after class");
		driver.close();
	}
	
	@AfterTest
	public void closebrowser() {
		
		System.out.println("After test");
		driver.quit();
	}

}
