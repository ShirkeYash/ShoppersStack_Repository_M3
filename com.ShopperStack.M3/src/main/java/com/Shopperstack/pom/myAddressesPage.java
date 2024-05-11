package com.Shopperstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAddressesPage {
	
	public myAddressesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Add Address']")
	public WebElement addAddressesbutton;
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[2]")
	private WebElement deleteButton;
	

	@FindBy(xpath = "//button[text()='Yes']")
	public WebElement yesButton;
	
	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	public WebElement getAddAddressesbutton() {
		return addAddressesbutton;
	}
	
	
}
