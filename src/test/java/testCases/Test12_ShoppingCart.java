package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AddtoCart;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.SearchProducts;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class Test12_ShoppingCart extends BaseClass {
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
  @Test(priority =1,groups= {"Regression","Sanity","Master"})
  public void test1_shoppingCart() throws Exception {
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("iMac");
	  sp.click_submit();
	  AddtoCart ac = new AddtoCart(driver);
	  ac.click_addto_cart();
	  ShoppingCart sc = new ShoppingCart(driver);
	  sc.test1_click_sitemap();
	  Thread.sleep(4000);
	  sc.test1_click_shopping_cart();
	  Thread.sleep(2000);
	  boolean res = sc.test1_ret_output();
	  if(res == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }*/
	@Test(priority =2,groups= {"Regression","Sanity","Master"})
	  public void test2_shoppingCart() throws Exception {
		  SearchProducts sp = new SearchProducts(driver);
		  sp.input_search("iMac");
		  sp.click_submit();
		  AddtoCart ac = new AddtoCart(driver);
		  ac.click_addto_cart();
		  ac.click_addto_cart();
		  Thread.sleep(5000);
		  ShoppingCart sc = new ShoppingCart(driver);
		  sc.test2_click_cart();
		  sc.test2_click_view_cart();
		  Thread.sleep(3000);
		  String res = sc.test2_ret_output();
		  Thread.sleep(2000);
		  System.out.println(res);
		  /*
		  boolean res = sc.test2_ret_output();
		  if(res == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }*/
	}
}
