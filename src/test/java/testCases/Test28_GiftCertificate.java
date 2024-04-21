package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.GiftCertificate;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class Test28_GiftCertificate extends BaseClass{
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
  @Test(priority=1,groups = {"Sanity","Regression","Master"})
  public void test_gift_certificate()throws Exception {
	  GiftCertificate gc = new GiftCertificate(driver);
	  gc.test_click_gift_certificate();
	  gc.test_input_recipents_name();
	  gc.test_input_recipents_email();
	  gc.test_input_sender_name();
	  gc.test_input_sender_email();
	  gc.test_select_gift_theme();
	  MyAccountPage map = new MyAccountPage(driver);
	  map.scroll_down_till_page_end();
	  gc.test_input_amount();
	  Thread.sleep(3000);
	  gc.test_check_checkbox();
	  gc.test_click_continue1();
	  gc.test_click_continue2();
	  gc.test_click_checkout();
	  gc.test_click_checkout_continue();
	  boolean result = gc.test_output();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
