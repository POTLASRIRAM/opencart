package testCases;

import org.openqa.selenium.WebDriver;
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

public class Test13_HomePageTest extends BaseClass{
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
  @Test(priority =1,groups = {"Sanity","Regression","Master"})
  public void test1_HomePage() throws Exception{
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
	  sc.test1_Click_Continue_Shopping();
	  Thread.sleep(3000);
	  HomePage hp = new HomePage(driver);
	  String title = hp.getpagetitle();
	  if(title.equals("Your Store")) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
}
	@Test(priority =2,groups = {"Sanity","Regression","Master"})
	  public void test2_HomePage() throws Exception{
		HomePage hp = new HomePage(driver);
		hp.test2_Hover_Desktop_pc();
		hp.test2_Pc_Continue();
		String title = hp.getpagetitle();
		  if(title.equals("Your Store")) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
	}
	*/
	@Test(priority = 3,groups = {"Sanity","Regression","Master"})
	  public void test3_HomePage() throws Exception{
		HomePage hp = new HomePage(driver);
		hp.test3_click_HomePage();
		hp.test3_get_images();
	}
}
