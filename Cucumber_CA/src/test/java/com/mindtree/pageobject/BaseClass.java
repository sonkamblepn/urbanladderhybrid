package com.mindtree.pageobject;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.mindtree.utility.BrowseFactory;
import com.mindtree.utility.ExcelDataProvider;

import com.mindtree.utility.ReadPropertyFile;
import com.mindtree.utility.TakeSS;

public class BaseClass {
	
	public WebDriver driver;
	
	public ExcelDataProvider excel;
	public ReadPropertyFile read;
	
	public ExtentTest logger;
	public ExtentReports report;
	public ExtentSparkReporter extent;
	
	 
	@BeforeSuite
	public void setUpSuit() throws InterruptedException {
		 Reporter.log("Setting up report and test is getting ready",true);
		 excel=new ExcelDataProvider();
		 extent=new ExtentSparkReporter(new File("./Reports/"+TakeSS.getcurrentDateTime()+".html"));
		 report=new ExtentReports();
		 report.attachReporter(extent);
		 Reporter.log("Setting done -Test can be started",true);
		 
	}
	
	
	
	@AfterMethod
	public void tearDownM(ITestResult result) throws IOException {
		
		Reporter.log("Test is about to end",true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakeSS.takeScreenShot(driver);
			logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(TakeSS.takeScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			TakeSS.takeScreenShot(driver);
			logger.pass("Test Pass",MediaEntityBuilder.createScreenCaptureFromPath(TakeSS.takeScreenShot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			
			logger.skip("Test Skipped");
		}
		report.flush();
		Reporter.log("Test completed >>>Report generated",true);
	}
	
}


