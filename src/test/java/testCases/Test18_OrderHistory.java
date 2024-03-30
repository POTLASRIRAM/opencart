package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderHistory;
import testBase.BaseClass;

public class Test18_OrderHistory extends BaseClass{
  @Test(priority = 1,groups = {"Sanity","Regression","Master"})
  public void test1_Orderhistory()throws Exception {
	  HomePage hp = new HomePage(driver);
	  hp.clickmy_Account();
	  hp.clickRegister();
	  OrderHistory oh = new OrderHistory(driver);
	  oh.test1_click_orderhistory();
	  Thread.sleep(3000);
	  LoginPage lp = new LoginPage(driver);
	  lp.sendEmail(p.getProperty("email"));
	  lp.sendPassword(p.getProperty("password"));
	  Thread.sleep(3000);
	  lp.clickLogin();
	  Thread.sleep(2000);
	  boolean otpt = oh.test1_ret_result();
	  if(otpt == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
