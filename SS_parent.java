package selenium2;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SS_parent {

	
//	public static void takesScreenshot(WebDriver driver , String name) throws IOException {
//		File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		 File destination = new File("D:\\Screenshot by selenium\\"+name+".jpg"); 
//      // +name+ is concat method for save file as ur given name
//		 
//		 FileHandler.copy(source, destination);
//	}
//	
//	public static void takesScreenshot(WebDriver driver , String name) throws IOException {
//	File sourse =    ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	
//	File destination = new File("D:\\Screenshot by selenium"+name+".jpg");
//	
//	FileHandler.copy(sourse,destination);
//	
//	public static String date() {
//		DateTimeFormatter DA = DateTimeFormatter .ofPattern("year/month/day h:m:s");
//		LocalDateTime now = LocalDateTime.now();
//		String D = DA.format(now);
//		return D;
//	}
//	
//	public static void takesScreenshot(WebDriver driver ,String name ) throws IOException {
//		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destination = new File("D:\\Screenshot by selenium"+name+"jpg");
//		FileHandler.copy(source, destination);
//		
	}
