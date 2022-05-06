package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {

	public static void main(String[] args) {
		
		WebDriver driver = browser.OpenBrowser("http://demo.automationtesting.in/Frames.html") ;
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//		driver.switchTo().frame(0); // By index
//		driver.switchTo().frame("SingleFrame"); // by name take this name from frame element;
		driver.switchTo().frame(iframe); // by weblement name
		
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("Ashwini");
	}
}
