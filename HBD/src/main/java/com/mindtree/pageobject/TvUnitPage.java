package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;

import com.mindtree.uistore.TvUnitUi;

public class TvUnitPage {
	
	WebDriver driver;
	WebDriverHelper helper;
	TvUnitUi ui;
	
	public TvUnitPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new TvUnitUi();
	}
	
	public String getTvUnitTitle() {
		String data=helper.getText(ui.TvUnitTitle,driver);
		return data;
	}

}
