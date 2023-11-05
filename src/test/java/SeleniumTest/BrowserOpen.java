package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();//setup for the chromedriver browser
		WebDriver driver = new ChromeDriver();//open the browser
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");//open the google search engine
		Thread.sleep(5000);
		driver.close();//close the browser
		
		
	}

}
