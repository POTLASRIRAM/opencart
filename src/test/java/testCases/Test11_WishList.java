package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.MyAccountPage;
import pageObjects.ProductDisplay;
import pageObjects.SearchProducts;
import pageObjects.WishList;
import testBase.BaseClass;

public class Test11_WishList extends BaseClass{
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
  @Test(priority =1, groups = {"Regression","Sanity","Master"})
  public void test1_wishlist() throws Exception{
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("iMac");
	  sp.click_submit();
	  Thread.sleep(3000);
	  ProductDisplay pd = new ProductDisplay(driver);
	  pd.click_imacname();
	  WishList wl = new WishList(driver);
	  wl.click_add_to_wishlist();
	  wl.click_wishlist_test1();
	  boolean res = wl.ret_test1_output();
	  if(res == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
	
	@Test(priority =2, groups = {"Regression","Sanity","Master"})
	  public void test2_wishlist() throws Exception{
		  SearchProducts sp = new SearchProducts(driver);
		  sp.input_search("iMac");
		  sp.click_submit();
		  Thread.sleep(3000);
		  ProductDisplay pd = new ProductDisplay(driver);
		  pd.click_imacname();
		  WishList wl = new WishList(driver);
		  wl.click_add_to_wishlist();
		  Thread.sleep(3000);
		  boolean top_res = wl.click_top_wishlist();
		  System.out.println(top_res);
		  Thread.sleep(3000);
		  boolean footer_res = wl.click_footer_wishlist();
		  System.out.println(footer_res);
		  HomePage hp  = new HomePage(driver);
		  Thread.sleep(3000);
		  hp.clickmy_Account();
		  hp.click_myaccount_button();
		  Thread.sleep(3000);
		  wl.click_modify_wishlist();
		  System.out.println("Product Removed...");
		  Thread.sleep(3000);
		  System.out.println("Retreiving product removal output...");
		  Thread.sleep(3000);
		  boolean remove_ot = wl.ret_remove_output();
		  System.out.println("Retreived product removal output...");
		  System.out.println(remove_ot);
		  if(remove_ot == true && top_res == true && footer_res == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
		  
	}
	
	
	@Test(priority =3, groups = {"Regression","Sanity","Master"})
	  public void test3_wishlist() throws Exception{
		  SearchProducts sp = new SearchProducts(driver);
		  sp.input_search("iMac");
		  sp.click_submit();
		  Thread.sleep(3000);
		  ProductDisplay pd = new ProductDisplay(driver);
		  pd.click_imacname();
		  WishList wl = new WishList(driver);
		  wl.click_add_to_wishlist();
		  //wl.ret_product_count();
		  Thread.sleep(2000);
		  wl.click_add_to_wishlist();
		  wl.click_top_wishlist();
		  boolean res = wl.ret_product_count();
		  if(res == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
	}
	*/
	@Test(priority =4, groups = {"Regression","Sanity","Master"})
	  public void test4_wishlist() throws Exception{
		HomePage hp  = new HomePage(driver);
		  Thread.sleep(3000);
		  hp.clickmy_Account();
		  hp.click_myaccount_button();
		  Thread.sleep(3000);
		  WishList wl = new WishList(driver);
		  wl.click_modify_wishlist();
		  Thread.sleep(4000);
		  boolean res = wl.get_brudcrumb_info();
		  if(res == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
	}
}
