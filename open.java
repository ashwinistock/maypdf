package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open {
     public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		/*driver.navigate().to("https://www.instagram.com/login/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		String a =driver.getTitle();
		System.out.println(a);
		
		String title = "Login • Instagram";
		//String b=driver.getCurrentUrl();
		//System.out.println(b);
		 
		if (a .equals(title)){
			System.out.println("title is matching");
		}
		else {
			System.out.println("title not matching");
		}
			

	}  }   

