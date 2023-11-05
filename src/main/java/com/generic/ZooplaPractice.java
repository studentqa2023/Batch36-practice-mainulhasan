package com.generic;

import org.openqa.selenium.WebDriver;

public class ZooplaPractice {
	
WebDriver driver;
	
	public void getLogIn() {
		
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		
		driver.navigate().to("https://www.zoopla.co.uk/");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		//Accept cookiesbtn
		if(mpf.getAcceptcookiesbtn().size()>0) {
			mpf.getAcceptcookiesbtn().get(0).click();
		}
		//Click on Login
		mpf.getZooplaLogInBtn().click();
		//Enter Email
		mpf.getZooplaEmail().sendKeys("rezwanislam@rocketmail.com");
		//Enter Password
		mpf.getZooplaPassword().sendKeys("Boston2023!");
		//Click on sing in btn
		mpf.getZooplaLoginbtn2().click();
	}

	public static void main(String[] args) {
		ZooplaPractice obj = new ZooplaPractice();
		obj.getLogIn();
	}

}
