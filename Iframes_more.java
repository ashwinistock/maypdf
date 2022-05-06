package selenium2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframes_more {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.OpenBrowser("https://demoqa.com/frames");
		
		WebElement mainpage = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		WebElement frame = driver.findElement(By.className("[class='header-text']"));
		frame.click();
		
		Thread.sleep(3000);
		 Set<String> a = driver.getWindowHandles();
		ArrayList<String> b = new ArrayList(a);
		driver.switchTo().window(b.get(0));
		
		
		WebElement nested = driver.findElement(By.xpath("(//div[@class=\"header-text\"])[3]"));
		nested.click();

		
		
		
	}
}
