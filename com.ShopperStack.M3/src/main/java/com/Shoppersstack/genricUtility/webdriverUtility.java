package com.Shoppersstack.genricUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class webdriverUtility {
	
	Select sel;
	File temp;
	File dest;
	
	public void selectByValue(WebElement element, String value) {
		
		sel=new Select(element);
		sel.selectByValue(value);
		
	}
		
		public void webPageScreenshot(WebDriver driver) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
			temp=ts.getScreenshotAs(OutputType.FILE);
			dest=new File("./screenshots/webPage.png");
			org.openqa.selenium.io.FileHandler.copy(temp, dest);
		}
		
		public void elementScreenshot(WebElement element) throws IOException {
			TakesScreenshot ts = (TakesScreenshot)element;
			temp=ts.getScreenshotAs(OutputType.FILE);
			dest = new File("./screenshots/element.png");
			org.openqa.selenium.io.FileHandler.copy(temp, dest);
		}

}
