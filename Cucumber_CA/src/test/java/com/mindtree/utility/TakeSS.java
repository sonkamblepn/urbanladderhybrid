package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSS {
	
	public static String takeScreenShot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
		String ss=System.getProperty("user.dir")+"/ScreenShot/ss"+getcurrentDateTime()+".png";
		File destFile=new File(ss);
		try {
			FileHandler.copy(srcFile, destFile);
		} catch (IOException e) {
			
		   
		   System.out.println("Unable to take screen shot");
		}
		return ss;
	}

	public static String getcurrentDateTime() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		Date d=new Date();
		String date=sdf.format(d);
		return date;
	}

}
