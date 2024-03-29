package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AddtoCart;
import pageObjects.Checkout;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.SearchProducts;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class Test14_Checkout extends BaseClass{
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
  @Test(priority = 1, groups = {"Regression","Sanity","Master"})
  public void test1_checkout()throws Exception {
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("iMac");
	  sp.click_submit();
	  AddtoCart ac = new AddtoCart(driver);
	  ac.click_addto_cart();
	  ShoppingCart sc = new ShoppingCart(driver);
	  Thread.sleep(3000);
	  sc.test1_click_checkout();
	  Checkout co = new Checkout(driver);
	  boolean res = co.test1_ret_checkoutres();
	  if(res == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
	@Test(priority = 2, groups = {"Regression","Sanity","Master"})
	  public void test2_checkout()throws Exception {
		  SearchProducts sp = new SearchProducts(driver);
		  sp.input_search("iMac");
		  sp.click_submit();
		  AddtoCart ac = new AddtoCart(driver);
		  ac.click_addto_cart();
		  ShoppingCart sc = new ShoppingCart(driver);
		  Thread.sleep(3000);
		  sc.test1_click_checkout();
		  Checkout co = new Checkout(driver);
		  Thread.sleep(3000);
		  co.test2_select_billing_new_address();
		  co.test2_click_billing_continue();
		  Thread.sleep(4000);
		  boolean res = co.test2_ret_errormsg_otpt();
		  if(res == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
	}
	*/
	@Test(priority = 3, groups = {"Regression","Sanity","Master"})
	  public void test3_checkout()throws Exception {
		  SearchProducts sp = new SearchProducts(driver);
		  sp.input_search("iMac");
		  sp.click_submit();
		  AddtoCart ac = new AddtoCart(driver);
		  ac.click_addto_cart();
		  ShoppingCart sc = new ShoppingCart(driver);
		  Thread.sleep(3000);
		  sc.test1_click_checkout();
		  Checkout co = new Checkout(driver);
		  Thread.sleep(3000);
		  co.test3_click_cont1();
		  co.test3_click_cont2();
		  co.test3_payments_add_comments();
		  co.test3_click_cont3();
		  Thread.sleep(3000);
		  boolean output = co.test3_ret_comment_output();
		  if(output == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
		  
	}
}
