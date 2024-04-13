package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.RecurringPayments;
import testBase.BaseClass;

public class Test24_RecurringPayments extends BaseClass{
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
  @Test(priority = 1,groups= {"Regression","Sanity","Master"})
  public void test1_recurring_payments()throws Exception {
	  RecurringPayments rp = new RecurringPayments(driver);
	  rp.test1_click_recurring_methods();
	  rp.test1_click_continue();
	  boolean result = rp.test1_return_otpt();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
