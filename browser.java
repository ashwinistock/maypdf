package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

//	public static WebDriver OpenBrowser(String URL) { // this method return webdriver which is driver.
//		
//		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(URL);
//		return  driver;
		
	public static WebDriver OpenBrowser(String URL) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		return driver;
	}
}
