package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver,this);//handle the Null Pointer Exception
	}
	@FindBy(xpath="//*[contains(text(),'Login')]")
	private WebElement loginBtnHome;
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement emailfield;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement passwirdfield;
	
	@FindBy(xpath="(//*[contains(text(),'Login')])[4]")
	private WebElement loginBtn2;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	private WebElement logout;
	
	//Costco
	@FindBy(xpath="(//a[contains(text(),'Services')])[1]")
	private WebElement Services;
	
	//DragAndDrop
	@FindBy(xpath="//div[contains(text(),'Oslo') and @id='box1']")
	private WebElement dragoslo;
	
	@FindBy(xpath="//div[contains(text(),'Norway')]")
	private WebElement dropNorway;
	
	@FindBy(xpath="//div[contains(text(), 'Washington') and @id='box3']")
	private WebElement washington;
	
	@FindBy(xpath="//div[contains(text(), 'United States')]")
	private WebElement unitedStates;
	
	//Zoopla
	@FindBy(xpath="//span[contains(text(), 'Accept all cookies')]")
	private List<WebElement> acceptcookiesbtn;

	@FindBy(xpath="(//span[contains(text(), 'Sing in')])[2]")
	private WebElement zooplaLogInBtn;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement zooplaEmail;
	
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement zooplaPassword;
	
	@FindBy(xpath="//button[@class='_1erwn750 1erwn751 1erwn752 1erwn75a 1dgm2fc8']")
	private WebElement zooplaLoginbtn2;
	
	public WebElement getZooplaEmail() {
		return zooplaEmail;
	}


	public WebElement getZooplaPassword() {
		return zooplaPassword;
	}


	public WebElement getZooplaLoginbtn2() {
		return zooplaLoginbtn2;
	}


	public WebElement getZooplaLogInBtn() {
		return zooplaLogInBtn;
	}


	public List<WebElement> getAcceptcookiesbtn() {
		return acceptcookiesbtn;
	}
	
	
	public WebElement getWashington() {
		return washington;
	}

	public WebElement getUnitedStates() {
		return unitedStates;
	}

	public WebElement getDragoslo() {
		return dragoslo;
	}

	public WebElement getDropNorway() {
		return dropNorway;
	}

	public WebElement getServices() {
		return Services;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getPasswirdfield() {
		return passwirdfield;
	}

	public WebElement getLoginBtn2() {
		return loginBtn2;
	}
	public WebElement getLoginBtnHome() {
		return loginBtnHome;
	}


}
