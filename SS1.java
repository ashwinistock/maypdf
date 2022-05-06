package selenium2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class SS1 {

	private static final String ScreenShot = null;

	public static void main(String[] args) throws IOException {
		/*WebDriver driver = browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
		SS_parent.takesScreenshot(driver,"pagess" ); // SS_parent class name & pagess is ss name by us
		
		WebDriver driver1 = browser.OpenBrowser("https://www.instagram.com/accounts/login/?hl=en");
		SS_parent.takesScreenshot(driver1, "insta");
		
		WebDriver driver2 = browser.OpenBrowser("https://amazon.com/");
		SS_parent.takesScreenshot(driver2, "amazon");*/
		
//		WebDriver driver = browser.OpenBrowser("https://www.facebook.com/");
//		SS_parent.takesScreenshot(driver, "facebook");
//		
//		WebDriver driver1 = browser.OpenBrowser("https://www.youtube.com/");
//		SS_parent.takesScreenshot(driver1, "YouTube");
//		
		// WE can take multiple SS in one class
//		WebDriver driver = browser.OpenBrowser("https://br.pinterest.com/pin/1037657570365866178/");
//		SS_parent.takesScreenshot(driver, "frozen");
		
		WebDriver driver = browser.OpenBrowser("https://en.wikipedia.org/wiki/Animation#:~:text=Animation%20is%20a%20method%20in,%2Dgenerated%20imagery%20(CGI).");

		
	}
}
