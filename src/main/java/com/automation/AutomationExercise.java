package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExercise {
	
	public void getBrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Automation Exercise");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='gNO89b'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		driver.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("1996mainul@gmail.com");
		driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("Mainul1996");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
//		driver.findElement(By.xpath("//*[text()='Login']")).click();
//		driver.findElement(By.xpath("(//*[contains(text(),'Login')])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@href='/logout']")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		AutomationExercise obj = new AutomationExercise();
		obj.getBrowser();
		
	}

}
