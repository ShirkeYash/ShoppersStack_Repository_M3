package com.ShopperStack.TestScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Shoppersstack.genricUtility.baseTest;
import com.Shoppersstack.genricUtility.listners;
import com.Shopperstack.pom.myAddressesPage;
import com.Shopperstack.pom.myProfilePage;
import com.aventstack.extentreports.Status;
@Listeners(listners.class)
public class verify_User_Is_Able_To_Delete_Address_Test extends baseTest {
	
	@Test
	public void deleteAddress() throws InterruptedException {
		
		myProfilePage myprofile = new myProfilePage(driver);
		myAddressesPage myadd = new myAddressesPage(driver);
		
		HomePage.accountButton.click();
		HomePage.myProfileButton.click();
		myprofile.getMyAddressButton().click();
		test.log(Status.INFO, "Entered to My Addresess Page");
		
		Thread.sleep(2000);
		myadd.getDeleteButton().click();
		Thread.sleep(2000);
		myadd.yesButton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		test.log(Status.INFO, "Deleted Address successfully");
		
	}

}
