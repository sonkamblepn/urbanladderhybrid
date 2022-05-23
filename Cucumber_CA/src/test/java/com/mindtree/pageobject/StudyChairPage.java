package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;

import com.mindtree.uistore.StudyChairUi;

public class StudyChairPage {

	WebDriver driver;
	WebDriverHelper helper;
	StudyChairUi ui;
	
	public StudyChairPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new StudyChairUi();
	}
	
	public void AddWish() {
		helper.clickOn(ui.studyChairAddUi,driver);
		System.out.println("Successfully added in wishlist");
	}
}
