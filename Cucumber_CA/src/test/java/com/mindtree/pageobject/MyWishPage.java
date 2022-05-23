package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;
import com.mindtree.uistore.MyWishUi;


public class MyWishPage {
	
	WebDriver driver;
	WebDriverHelper helper;
	MyWishUi ui;
	
	public MyWishPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new MyWishUi();
	}
	
	public String getMyWish() {
		String data=helper.getText(ui.myWish,driver);
		return data;
	}

}
