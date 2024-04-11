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
import utilities.DataProviders;

public class Test20_ProductReturns extends BaseClass{
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
  @Test(priority = 1,groups = {"Regression","Sanity","Master"})
  public void test1_product_return()throws Exception {
	  OrderHistory oh = new OrderHistory(driver);
	  oh.test1_click_orderhistory();
	  OrderInformation oi = new OrderInformation(driver);
	  oi.test1_click_view();
	  oi.test2_click_return();
	  ProductReturns pr = new ProductReturns(driver);
	  pr.test1_click_returnreason();
	  pr.test1_click_submit();
	  boolean result = pr.test1_ret_otpt();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
  
	
	@Test(dataProvider = "dp4",dataProviderClass=DataProviders.class,priority = 2,groups = {"Regression","Sanity","Master"})
	  public void test2_product_return(String email)throws Exception {
		  OrderHistory oh = new OrderHistory(driver);
		  oh.test1_click_orderhistory();
		  OrderInformation oi = new OrderInformation(driver);
		  oi.test1_click_view();
		  oi.test2_click_return();
		  ProductReturns pr = new ProductReturns(driver);
		  pr.test1_click_returnreason();
		  Thread.sleep(4000);
		  boolean result =  pr.test2_input_email(email);
		  if(result == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
		  
	  }*/
	@Test(priority = 3,groups = {"Regression","Sanity","Master"})
	  public void test3_product_return()throws Exception {
		  ProductReturns pr = new ProductReturns(driver);
		  pr.test3_click_returns();
		  pr.test3_click_view();
		  boolean result = pr.test3_return_output();
		  if(result == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
	  }
}
