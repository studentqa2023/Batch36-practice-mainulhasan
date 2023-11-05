package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	WebDriver driver;
	public void crossbrowserlogin(String browser) {
			
			if(browser.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				System.out.println("Browser opened="+browser);
			}else if (browser.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				System.out.println("Browser opened="+browser);
			}else {
				System.out.println("Not found any browser");
			}
			driver.navigate().to("https://www.costco.com/");
			driver.manage().window().maximize();
//			

			MasterPageFactory mpf = new MasterPageFactory(driver);
			Actions ac = new Actions(driver);
			ac.moveToElement(mpf.getServices()).perform();
		}
		public static void main(String[] args) {
			CrossBrowser obj = new CrossBrowser();
			obj.crossbrowserlogin("Firefox");
			obj.crossbrowserlogin("Chrome");
			
		}

}
