package utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	WebDriver driver;
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	File dest = new File("C:\\Users\\balaji\\Desktop\\SCREENSHOT\\Test.jpg");
	
	FileHandler.copy(src, dest);
	
	driver.close();
	
	 

}
