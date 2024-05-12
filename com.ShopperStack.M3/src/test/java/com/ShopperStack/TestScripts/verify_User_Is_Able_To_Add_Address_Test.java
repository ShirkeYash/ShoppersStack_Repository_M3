package com.ShopperStack.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Shoppersstack.genricUtility.baseTest;
import com.Shoppersstack.genricUtility.listners;
import com.Shopperstack.pom.addressFormPage;
import com.Shopperstack.pom.myAddressesPage;
import com.Shopperstack.pom.myProfilePage;
import com.aventstack.extentreports.Status;
@Listeners(listners.class)
public class verify_User_Is_Able_To_Add_Address_Test extends baseTest{
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {
		
		myProfilePage Myprofile=new myProfilePage(driver);
	 	myAddressesPage myadd = new myAddressesPage(driver);
		
		HomePage.accountButton.click();
		HomePage.myProfileButton.click();
		Myprofile.getMyAddressButton().click();
		myadd.getAddAddressesbutton().click();
		
		addressFormPage AddressFormPage=new addressFormPage(driver);
		
		
		AddressFormPage.nameTextField.sendKeys(file.excelFile("Sheet1", 1, 0));
		AddressFormPage.houseInfoTextField.sendKeys(file.excelFile("Sheet1", 1, 1));
		AddressFormPage.streetInfoTextField.sendKeys(file.excelFile("Sheet1", 1, 2));
		AddressFormPage.landmarkTextFild.sendKeys(file.excelFile("Sheet1", 1, 3));
		test.log(Status.INFO, "Text field successfully filled");
		
		webUtility.selectByValue(AddressFormPage.countryDropdown, file.propertyFile("country"));
		webUtility.selectByValue(AddressFormPage.stateDropdown, file.propertyFile("state"));
		webUtility.selectByValue(AddressFormPage.cityDropdown, file.propertyFile("city"));
		test.log(Status.INFO, "Values successfully entered in Dropdown");
		
		AddressFormPage.pincodeTextField.sendKeys(file.excelFile("Sheet1", 1, 4));
		AddressFormPage.phonenumberTextField.sendKeys(file.excelFile("Sheet1", 1, 5));
		test.log(Status.INFO, "Text field successfully filled");
		
	}

}
