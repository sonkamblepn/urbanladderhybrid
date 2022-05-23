package com.stepDefinitions;

import org.junit.Assert;

import com.mindtree.pageobject.BarCabinetPage;
import com.mindtree.pageobject.BaseClass;
import com.mindtree.pageobject.BeanBagPage;
import com.mindtree.pageobject.GiftPage;
import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.MenuPage;
import com.mindtree.pageobject.MyWishPage;
import com.mindtree.pageobject.StudyChairPage;
import com.mindtree.pageobject.TvUnitPage;
import com.mindtree.utility.BrowseFactory;
import com.mindtree.utility.ExcelDataProvider;
import com.mindtree.utility.ReadPropertyFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MainClass extends BaseClass
{	
	public ExcelDataProvider excel;
	public ReadPropertyFile read;
	@Given("user on website")
	public void user_on_website() throws InterruptedException
	{
		excel=new ExcelDataProvider();
		
		read=new ReadPropertyFile();
		
		driver=BrowseFactory.startApplication(driver,read.getBrowser(),read.getUrl(),read.getDriver());
		System.out.println(driver.getTitle());
		HomePage home=new HomePage(driver);
		home.clickOnAdmin();
		home.clickOnLogin();
		LoginPage login=new LoginPage(driver);
		login.sendEmail(excel.getStringData("Sheet1", 0, 0));
		login.sendPassword(excel.getStringData("Sheet1", 1, 0));
		login.clickOnSub();
		
	}
	
	@When("verify whether the Sofas assert true or not")
	public void verify_whether_the_Sofas_assert_true_or_not() throws Exception
	{
		
		MenuPage menu=new MenuPage(driver);
		menu.clickOnDeal();
		menu.clickOnSofas();
		Assert.assertEquals(menu.getSofasTitle(),"Sofas");
		
		
	}
	
	@When("click on Study table")
	public void click_on_Study_table() throws Exception
	{
		
		MenuPage menu=new MenuPage(driver);
		menu.clickOnDeal();
		menu.clickOnstudyTable();
		Assert.assertTrue(menu.getStudyTableTitle().equals("Study Tables"));
		
		
	}
	
	@When("click on Bean Page")
	public void click_on_Bean_Page() throws Exception
	{
		
		MenuPage menu=new MenuPage(driver);
		menu.clickOnLiving();
		menu.clickOnBean();
		BeanBagPage bag=new BeanBagPage(driver);
		Assert.assertTrue(bag.getbeanBagTitle().equals("Bean Bags"));
		
		
	}
	
	@When("click on TV Units")
	public void click_on_TV_Units() throws Exception
	{
		MenuPage menu=new MenuPage(driver);
		menu.clickOnLiving();
		menu.clickOnTvUnit();
		TvUnitPage tv=new TvUnitPage(driver);
		Assert.assertTrue(tv.getTvUnitTitle().equals("TV Units"));
	}
	
	@When("click on My Wishlist")
	public void click_on_My_Wishlist() throws Exception
	{
		MenuPage menu=new MenuPage(driver);
		menu.clickOnWish();
		MyWishPage tv=new MyWishPage(driver);
		Assert.assertTrue(tv.getMyWish().equals("My Wishlist"));
	}
	
	@When("click on Bar Cabinets")
	public void click_on_Bar_Cabinets() throws Exception
	{
		MenuPage menu=new MenuPage(driver);
		menu.clickOnDinning();
		menu.clickOnCabinet();
		BarCabinetPage cabinet=new BarCabinetPage(driver);
		Assert.assertTrue(cabinet.getBarCabinetTitle().equals("Bar Cabinets"));
	}
	
	@When("click on Gift")
	public void click_on_Gift() throws Exception
	{
		MenuPage menu=new MenuPage(driver);
		menu.clickOnGift();
		GiftPage gift=new GiftPage(driver);
		System.out.println(gift.get());
	}
	
	@When("click on Study Chair")
	public void click_on_Study_Chair() throws Exception
	{
		MenuPage menu=new MenuPage(driver);
		menu.clickOnStudy();
		menu.clickOnStudyChair();
		StudyChairPage chair=new StudyChairPage(driver);
		chair.AddWish();
	}
	
	@When("click on Wall")
	public void click_on_Wall() throws Exception
	{
		MenuPage menu=new MenuPage(driver);
		menu.clickOnDecor();
		menu.clickOnWall();
	}
	
	@When("click on Track Order")
	public void click_on_Track_Order() throws Exception
	{
		MenuPage menu=new MenuPage(driver);
		menu.clickOntrackOrder();
	}
	
	@Then("close the page")
	public void close_the_page() throws Exception
	{
		BrowseFactory.quitBroswer(driver);
		
	}
	
}