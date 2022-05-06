package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllXpaths {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = browser.OpenBrowser("https://vctcpune.com/");
		
		WebElement practice = driver.findElement(By.xpath("//a[@rel=\"noopener noreferrer\"][1]"));// xpath by index (done)
		practice.click();
		
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.xpath("//input[contains(@value,'Radio1')]"));
		radio.click();
		
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		country.sendKeys("india");
		
		
	}
}
