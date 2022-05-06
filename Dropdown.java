package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
//	    WebElement list = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//	   
//	    Select sel = new Select(list);   // select is class of selenium
//	   sel.selectByIndex(1);           // selectByIndex is method of select class
//	    Thread.sleep(2000);
//	   
//	   sel.selectByVisibleText("Option3"); 
//	   
//	   Thread.sleep(2000);
//	   sel.selectByValue("option2");
		
//    WebDriver driver = browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
//    WebElement sel = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//    Select opt3 = new Select(sel);
//    opt3.selectByVisibleText("Option3");     // DONE Select by text
//	
	
	
		
	WebDriver driver = browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
	WebElement Sel = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	Thread.sleep(3000);
	Select opt2 = new Select(Sel);
	opt2.selectByValue("option2");      // select by value done
	   
		
		
//		WebDriver driver = browser.OpenBrowser("https://vctcpune.com/selenium/practice.html");
//		WebElement selec = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		
//		Select opt2 = new Select (selec);
//		opt2.selectByIndex(2);               // by index done
	   
	 
	}
}
