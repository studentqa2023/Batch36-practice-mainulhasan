package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotwireLogIn {
	
public void getBrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/webhp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Hotwire");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='gNO89b']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='btn__label'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("1996mainul@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Mainul1996");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn__label btn__label--truncate']")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		HotwireLogIn obj = new HotwireLogIn();
		obj.getBrowser();
	}

}
