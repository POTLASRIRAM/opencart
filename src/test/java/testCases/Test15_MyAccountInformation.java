package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.MyAccountInformation;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class Test15_MyAccountInformation extends BaseClass{
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
	
  @Test(priority =1,groups = {"Sanity","regression","Master"})
  public void test1_my_account_information() throws Exception{
	  ShoppingCart sc = new ShoppingCart(driver);
	  sc.test1_click_sitemap();
	  Thread.sleep(3000);
	  MyAccountInformation mai = new MyAccountInformation(driver);
	  mai.test1_click_account_information();
	  boolean res = mai.test1_ret_validation_output();
	  if(res == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
