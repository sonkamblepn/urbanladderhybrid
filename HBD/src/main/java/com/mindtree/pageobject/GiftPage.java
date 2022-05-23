package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.GiftUi;


public class GiftPage {

	WebDriver driver;
	WebDriverHelper helper;
	GiftUi ui;
	
	public GiftPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new GiftUi();
	}
	
	public String get() {
		String data=helper.getText(ui.gift,driver);
		return data;
	}
}
