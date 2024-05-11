package com.Shopperstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addressFormPage {
	
	public addressFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Name")
	public WebElement nameTextField;
	
	@FindBy(id = "House/Office Info")
	public WebElement houseInfoTextField;
	
	@FindBy(id = "Street Info")
	public WebElement streetInfoTextField;
	
	@FindBy(id = "Landmark")
	public WebElement landmarkTextFild;
	
	@FindBy(id = "Country")
	public WebElement countryDropdown;
	
	@FindBy(id = "State")
	public WebElement stateDropdown;
	
	@FindBy(id = "City")
	public WebElement cityDropdown;
	
	@FindBy(id = "Pincode")
	public WebElement pincodeTextField;
	
	@FindBy(id = "Phone Number")
	public WebElement phonenumberTextField;
	
	@FindBy(id = "addAddress")
	public WebElement addAddressButton;

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseInfoTextField() {
		return houseInfoTextField;
	}

	public WebElement getStreetInfoTextField() {
		return streetInfoTextField;
	}

	public WebElement getLandmarkTextFild() {
		return landmarkTextFild;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getCityDropdown() {
		return cityDropdown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhonenumberTextField() {
		return phonenumberTextField;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}
	
	
	
}
