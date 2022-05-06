package selenium2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
   public static void main(String[] args) throws IOException {
	//WebDriver driver = browser.OpenBrowser("https://vctcpune.com/");// take URL

	
	//File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//file is class
	//Conver webdriver obj to takescreenshot
    // takesScreenshot interface
	// getScreenshotAs its method of TakesScreenshot
	
	//File destination = new File ("D:\\Screenshot by selenium\\vctc1.jpg"); 
	// img name vctc1 .jpj,png is extension
	//Move image file to new destination
	
	//FileHandler.copy(source, destination);//copy file at destination
	// source we take o/p
	// destination save
	
	   WebDriver driver = browser.OpenBrowser("https://www.youtube.com/watch?v=cqyziA30whE");
	   
	   File place = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File destination = new File("D:\\\\Screenshot by selenium\\\\jerry.jpg");
	   FileHandler.copy(place, destination);
	
    }
	
	}

