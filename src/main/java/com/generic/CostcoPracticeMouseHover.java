package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CostcoPracticeMouseHover {
	
		
		public void getmouseHover() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.costco.com/");
			Actions ac = new Actions(driver);
			MasterPageFactory mpf = new MasterPageFactory(driver);
			ac.moveToElement(mpf.getServices()).perform();
		}
		public static void main(String[] args) {
			CostcoPracticeMouseHover obj = new CostcoPracticeMouseHover();
			obj.getmouseHover();
		}

}
