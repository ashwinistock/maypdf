package selenium2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class childpopup_bysel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.OpenBrowser("https://www.jigsawacademy.com/blogs/java/pattern-programs-in-java/");
		
		WebElement selenium = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		selenium.click();
		Thread.sleep(3000);
		
		selenium.click();
		Thread.sleep(3000);
		
		selenium.click();
		Set address = driver.getWindowHandles();
		
		ArrayList <String> list = new ArrayList();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println(list.size());
		
	}
}
