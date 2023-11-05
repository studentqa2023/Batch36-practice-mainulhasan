package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestNG {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void crossbrowserCostco(String browser) {
		
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

		com.generic.MasterPageFactory mpf = new com.generic.MasterPageFactory(driver);
		Actions ac = new Actions(driver);
		ac.moveToElement(mpf.getServices()).perform();
	}

}
