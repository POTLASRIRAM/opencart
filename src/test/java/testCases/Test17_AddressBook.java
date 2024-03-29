package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AddressBook;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import testBase.BaseClass;

public class Test17_AddressBook extends BaseClass{
	@BeforeMethod(groups= {"Regression","Master"})
	public void login() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		  hp.clickmy_Account();
		  hp.clickLogin();
		  LoginPage lp = new LoginPage(driver);
		  lp.sendEmail(p.getProperty("email"));
		  lp.sendPassword(p.getProperty("password"));
		  lp.clickLogin();
		  Thread.sleep(2000);
		  System.out.println("Login Successful");
	}
	@AfterMethod(groups = {"Regression","Master"})
	public void logout()throws Exception{
		HomePage hp = new HomePage(driver);
		  hp.clickmy_Account();
		Logout lg = new Logout(driver);
		 lg.logout();
		 System.out.println("Logout Successful");
	}
	/*
  @Test(priority=1,groups= {"Sanity","Regression","Master"})
  public void test1_addressbook()throws Exception {
	  AddressBook ab = new AddressBook(driver);
	  ab.test1_click_addressbook();
	  ab.test1_click_edit_address();
	  ab.test1_edit_postalcode();
	  ab.test1_click_continue();
	  boolean res = ab.test1_ret_output();
	  if(res == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
	@Test(priority=2,groups= {"Sanity","Regression","Master"})
	  public void test2_addressbook()throws Exception {
		  AddressBook ab = new AddressBook(driver);
		  ab.test1_click_addressbook();
		  ab.test2_click_newaddress();
		  ab.test2_add_details();
		  ab.test2_select_region();
		  ab.test1_click_continue();
		  System.out.println("Successfully clicked on continue...");
	  }
	  */
	@Test(priority=3,groups= {"Sanity","Regression","Master"})
	  public void test3_addressbook()throws Exception {
		  AddressBook ab = new AddressBook(driver);
		  ab.test1_click_addressbook();
		  boolean heading = ab.test3_val_pageheading();
		  ab.test3_val_breadcrumb();
		  ab.test3_val_pageurl();
		  boolean tt = ab.test3_val_pagetitle();
		  if(heading == true && tt == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
	  }
}
