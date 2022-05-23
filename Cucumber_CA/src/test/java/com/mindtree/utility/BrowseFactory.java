package com.mindtree.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFactory {
	
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl,String browserPath ) {
		if(browserName.equals("Chrome")) {
			try {
				System.setProperty("webdriver.chrome.driver",browserPath);
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			} catch (Exception e) {
				//Log.error("webDriver can not be found");				
			}
		}
		else {
			System.out.println("We do not support webBrowser");
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
	public static void quitBroswer(WebDriver driver) {
		driver.quit();
	}

}
