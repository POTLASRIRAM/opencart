package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.OrderHistory;
import pageObjects.OrderInformation;
import pageObjects.ProductReturns;
import testBase.BaseClass;

public class Test19_OrderInformation extends BaseClass{
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
  @Test(priority = 1, groups = {"Sanity","Regression","Master"})
  public void test1_order_information()throws Exception {
	  OrderHistory oh = new OrderHistory(driver);
	  oh.test1_click_orderhistory();
	  OrderInformation oi = new OrderInformation(driver);
	  oi.test1_click_view();
	  boolean res = oi.test1_ret_otp();
	  if(res==true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
  @Test(priority = 2, groups = {"Sanity","Regression","Master"})
  public void test2_order_information()throws Exception {
	  OrderHistory oh = new OrderHistory(driver);
	  oh.test1_click_orderhistory();
	  OrderInformation oi = new OrderInformation(driver);
	  oi.test1_click_view();
	  oi.test2_click_return();
	  ProductReturns pr = new ProductReturns(driver);
	  boolean res = pr.test1_ret_op();
	  if(res==true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }*/
  @Test(priority = 3, groups = {"Sanity","Regression","Master"})
  public void test3_order_information()throws Exception {
	  OrderHistory oh = new OrderHistory(driver);
	  oh.test1_click_orderhistory();
	  OrderInformation oi = new OrderInformation(driver);
	  oi.test1_click_view();
	  oh.test_click_continue();
	  boolean result = oi.test3_ret_output();
	  if(result==true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
