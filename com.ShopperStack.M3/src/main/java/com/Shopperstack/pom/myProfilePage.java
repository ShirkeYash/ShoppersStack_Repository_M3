package com.Shopperstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myProfilePage {
	
	public myProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='My Addresses']")
	public WebElement myAddressButton;

	public WebElement getMyAddressButton() {
		return myAddressButton;
	}

	
}
