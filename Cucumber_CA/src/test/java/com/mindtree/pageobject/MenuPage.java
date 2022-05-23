package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponents.WebDriverHelper;

import com.mindtree.uistore.MenuPageUi;

public class MenuPage {
	
	WebDriver driver;
	WebDriverHelper helper;
	MenuPageUi ui;
	
	public MenuPage(WebDriver driver) {
		this.driver=driver;
		helper=new WebDriverHelper();
		ui=new MenuPageUi();
	}
	
	public void clickOnDeal() throws InterruptedException {
		helper.clickOn(ui.topDealsUi,driver);
		System.out.println("Successfully clicked on deals");
	}
	
	public void clickOnSofas() throws InterruptedException {
		helper.clickOn(ui.sofasUi,driver);
		System.out.println("Successfully clicked on sofas");
	}
	
	public String getSofasTitle() {
		String data=helper.getText(ui.SofasTitle,driver);
		return data;
	}
	
	public void clickOnstudyTable() {
		helper.clickOn(ui.studytableUi,driver);
		System.out.println("Successfully clicked on study table");
	}
	
	public String getStudyTableTitle() {
		String data=helper.getText(ui.studyTableTitle,driver);
		return data;
	}
	
	public void clickOnLiving() {
		helper.clickOn(ui.livingUi,driver);
		System.out.println("Successfully clicked on living");
	}
	
	public void clickOnBean() {
		helper.clickOn(ui.beanBag,driver);
		System.out.println("Successfully clicked on bean bag");
	}
	
	public void clickOnTvUnit() {
		helper.clickOn(ui.tvUnit,driver);
		System.out.println("Successfully clicked on TV Unit");
	}

	public void clickOnWish() {
		helper.clickOn(ui.wishUi,driver);
		System.out.println("Successfully clicked on Wish list");
	}
	
	public void clickOnDinning() {
		helper.clickOn(ui.dinningUi,driver);
		System.out.println("Successfully clicked on dining");
	}
	
	public void clickOnCabinet() {
		helper.clickOn(ui.cabinets,driver);
		System.out.println("Successfully clicked on cabinets");
	}
	
	public void clickOnGift() {
		helper.clickOn(ui.gift,driver);
		System.out.println("Successfully clicked on gift");
	}
	
	public void clickOnStudy() {
		helper.clickOn(ui.study,driver);
		System.out.println("Successfully clicked on study");
	}
	
	public void clickOnStudyChair() {
		helper.clickOn(ui.studyChair,driver);
		System.out.println("Successfully clicked on study chair");
	}
	
	public void clickOnDecor() {
		helper.clickOn(ui.decorUi,driver);
		System.out.println("Successfully clicked on decor");
	}
	
	public void clickOnWall() {
		helper.clickOn(ui.wallMirrorUi,driver);
		System.out.println("Successfully clicked on wall Mirror");
	}
	
	public void clickOntrackOrder() {
		helper.clickOn(ui.trackOrderUi,driver);
		System.out.println("Successfully clicked on track order");
	}
}
