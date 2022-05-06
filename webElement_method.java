package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webElement_method {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
		
	    Thread.sleep(1000);
		WebElement radio =driver.findElement(By.xpath("//input[@value='Radio1']"));
		radio.click();
		
		boolean status = radio.isSelected();
		System.out.println(status);
		
		Thread.sleep(3000);
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
		radio2.click();
		
		WebElement hide = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		hide.click();
		
		boolean show = hide.isDisplayed();
		System.out.println(show);
		
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		country.sendKeys("india");
	}
}
