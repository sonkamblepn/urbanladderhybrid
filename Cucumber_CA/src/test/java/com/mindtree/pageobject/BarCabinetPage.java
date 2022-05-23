package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.BarCabinentsUi;

public class BarCabinetPage {
	
	WebDriver driver;
	WebDriverHelper helper;
	BarCabinentsUi ui;
	
	public BarCabinetPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new BarCabinentsUi() ;
	}
	
	public String getBarCabinetTitle() {
		String data=helper.getText(ui.barCabinetTitle,driver);
		return data;
	}

}
