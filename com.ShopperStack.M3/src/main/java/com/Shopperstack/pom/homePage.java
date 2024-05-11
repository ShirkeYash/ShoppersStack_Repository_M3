package com.Shopperstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Q']")
	public WebElement accountButton;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	public WebElement myProfileButton;
	
	@FindBy(xpath = "//li[text()='Logout']")
	public WebElement logoutButton;
	

	public WebElement getMyProfileButton() {
		return myProfileButton;
	}


	public WebElement getLogoutButton() {
		return logoutButton;
	}


	public WebElement getAccountButton() {
		return accountButton;
	}
	
	
}
