package com.Shoppersstack.genricUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class listners extends  baseTest implements ITestListener,ISuiteListener{
	
	javaUtility java = new javaUtility();
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String path = frameworkConstants.listenrshot+java.localDateTime()+".png";
		
		TakesScreenshot ts = (TakesScreenshot) baseTest.listnerDriver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		test.addScreenCaptureFromPath("."+path);
		try {
			org.openqa.selenium.io.FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
