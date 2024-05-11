package com.Shoppersstack.genricUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Shopperstack.pom.homePage;
import com.Shopperstack.pom.loginPage;
import com.Shopperstack.pom.myAddressesPage;
import com.Shopperstack.pom.myProfilePage;
import com.Shopperstack.pom.welcomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class baseTest {
	
	public WebDriver driver;
	public static WebDriver listnerDriver;
	public welcomePage WelcomePage;
	public loginPage LoginPage;
	public homePage HomePage;
	public myProfilePage MyProfilePage;
	public myAddressesPage MyAddressPage;
	public fileUtility file=new fileUtility();
	public webdriverUtility webUtility = new webdriverUtility();
	public javaUtility java = new javaUtility();
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		spark = new ExtentSparkReporter("./reports/testreport"+java.localDate()+".html");
		report = new ExtentReports();
		report.attachReporter(spark);
		test = report.createTest("Demo");
	}
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("Before Class");
		
			String url= file.propertyFile("url");
			String browser= file.propertyFile("browser");
			
//			String url = System.getProperty("url");
//			String browser = System.getProperty("browser");
			
			if (browser.contains("chrome")) {
				driver = new ChromeDriver();
			}else if (browser.contains("firefox")) {
				driver = new FirefoxDriver();
			}else if (browser.contains("edge")) {
				driver = new EdgeDriver();
			}else {
				System.out.println("ENTER VALID BROWSER NAME");
				test.log(Status.FAIL, "INVALID BROWSER");
			} 
			test.log(Status.INFO, "Browser launched successfully");
			
			listnerDriver= driver;
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
						
			driver.get(url);
			test.log(Status.INFO, "Directed to URL");
			HomePage = new homePage(driver);
		
	}
	
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.out.println("Before Method");
		
		WelcomePage = new welcomePage(driver);
		LoginPage = new loginPage(driver);
		
		WelcomePage.loginButton.click();
		LoginPage.emailTextField.sendKeys(file.propertyFile("username"));
		LoginPage.passwordTextField.sendKeys(file.propertyFile("password"));
		LoginPage.loginButton.click();
		test.log(Status.INFO, "Login Successfully");
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		
		HomePage.accountButton.click();
		HomePage.logoutButton.click();
		test.log(Status.INFO, "Logout successfully");
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("After Class");
		
		Thread.sleep(3000);
		driver.quit();
		test.log(Status.INFO, "Browser closed");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		report.flush();
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
