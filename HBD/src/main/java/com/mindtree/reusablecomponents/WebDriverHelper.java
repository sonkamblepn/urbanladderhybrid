package com.mindtree.reusablecomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverHelper {

	public void clickOn(By data, WebDriver driver) {
		driver.findElement(data).click();
		
	}

	public void sendKey(By dataUi, WebDriver driver, String data) throws InterruptedException {
		    
			driver.findElement(dataUi).sendKeys(data);
			Thread.sleep(2000);
			
		
	}

	public String getText(By dataTitle, WebDriver driver) {
		return driver.findElement(dataTitle).getText();
	}

}
