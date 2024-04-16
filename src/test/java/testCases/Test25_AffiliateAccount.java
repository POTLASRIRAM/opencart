package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Affiliate;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import testBase.BaseClass;

public class Test25_AffiliateAccount extends BaseClass{
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
  public void test1_register_affiliate() throws Exception {
	  Affiliate af = new Affiliate(driver);
	  af.test1_click_register_affiliate();
	  af.test1_input_company(p.getProperty("company"));
	  af.test1_input_website(p.getProperty("site"));
	  af.test1_input_taxid(p.getProperty("tid"));
	  af.test1_input_payeename(p.getProperty("payeename"));
	  af.test1_click_aboutuscheckbox();
	  af.test1_click_continue();
	  boolean result = af.test1_return_otpt();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
