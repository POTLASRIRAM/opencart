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
import testBase.BaseClass;

public class Test10_AddtoCart extends BaseClass{
/*
=======
>>>>>>> 9cdb298a3a8f97edcc698f3bf3dc2bb307960ef9
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
<<<<<<< HEAD

  @Test(priority =1, groups = {"Regression","Sanity","Master"})
=======
  @Test(groups = {"Regression","Sanity","Master"})
>>>>>>> 9cdb298a3a8f97edcc698f3bf3dc2bb307960ef9
  public void test_add_to_cart()throws Exception {
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("imac");
	  sp.click_submit();
	  Thread.sleep(4000);
	  AddtoCart ac = new AddtoCart(driver);
	  ac.click_wishlist();
	  ac.click_addto_cart();
	  ac.click_shopping_cart();
	  boolean pdn = ac.get_product_name();
	  if(pdn == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
<<<<<<< HEAD
  
  @Test(priority =2, groups = {"Regression","Sanity","Master"})
  public void test_addtocart_viewcart()throws Exception {
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("imac");
	  sp.click_submit();
	  Thread.sleep(4000);
	  AddtoCart ac = new AddtoCart(driver);
	  ac.click_addto_cart();
	  Thread.sleep(4000);
	  ac.click_add_to_cart();
	  Thread.sleep(4000);
	  ac.click_view_cart();
	  boolean pdn = ac.re_pd_name();
	  if(pdn == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
  
  @Test(priority =3, groups = {"Regression","Sanity","Master"})
  public void test_addtocart_showdesktops()throws Exception {
	  AddtoCart ac = new AddtoCart(driver);
	  ac.click_desktop();
	  ac.click_show_desktops();
	  ac.click_mac();
	  Thread.sleep(4000);
	  ac.add_cart();
	  ac.click_shoppingcart_test3();
	  Thread.sleep(4000);
	  boolean pdn = ac.get_pdname_test3();
	  if(pdn == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
  */
  @Test(priority =4, groups = {"Regression","Sanity","Master"})
  public void test_addfeaturedproducts_tocart()throws Exception {
	  AddtoCart ac = new AddtoCart(driver);
	  ac.addcart_macbook();
	  ac.click_shopping_cart();
	  Thread.sleep(4000);
	  boolean pdn = ac.ret_macbook();
	  if(pdn == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }

}
