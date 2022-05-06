package selenium2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {

	public static void main(String[] args) throws IOException {
		
//		WebDriver driver = browser.OpenBrowser("https://gorest.co.in/");
//		
//		File place =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		File destination = new File("D:\\Screenshot by selenium\\postman.jpg");
//		
//		FileHandler.copy(place, destination);
		
		WebDriver driver = browser.OpenBrowser("https://br.pinterest.com/pin/1037657570365866178/");
		
		File sourse =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\Screenshot by selenium\\elsa.jpg");
		
		FileHandler.copy(sourse, destination);
	}
}