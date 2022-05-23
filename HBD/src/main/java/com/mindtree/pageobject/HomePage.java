package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.HomePageUi;

public class HomePage {
	
	WebDriver driver;
	WebDriverHelper helper;
	HomePageUi ui;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new HomePageUi();
	}
	
	public void clickOnAdmin() {
		helper.clickOn(ui.adminUi,driver);
		System.out.println("Successfully click");
	}
	
	public void clickOnLogin() {
		helper.clickOn(ui.LogIn,driver);
		System.out.println("Successfully click on login");
	}

}
