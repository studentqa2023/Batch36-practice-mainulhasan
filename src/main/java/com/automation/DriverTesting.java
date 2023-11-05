package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverTesting {
	
	public void getBrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();//setup for the chormedriver browser
		WebDriver driver = new ChromeDriver();//Upcasting=> make a retationship between interface and class
		
//		driver.get("https://www.google.com/");////open the google search engine
		driver.navigate().to("https://www.google.com/");////open the google search engine
		driver.manage().window().maximize();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Smart Tech");
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='gNO89b']")).click();
//		driver.close();
		}
	
	public static void main(String[] args) throws InterruptedException {
		DriverTesting obj = new DriverTesting();
		obj.getBrowser();
	}

}
