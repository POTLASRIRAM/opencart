package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.Newsletter;
import testBase.BaseClass;

public class Test26_NewsLetter extends BaseClass{
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
  public void test1_news_letter() throws Exception {
	  Newsletter nl = new Newsletter(driver);
	  nl.test1_click_newsletter_subscribe();
	  nl.test1_navigate_back();
	  nl.test1_click_newsletter();
	  nl.test1_select_yes();
	  nl.test1_click_continue();
	  boolean result = nl.test1_return_output();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
  
  @Test(priority=2,groups = {"Sanity","Regression","Master"})
  public void test2_news_letter() throws Exception {
	  Newsletter nl = new Newsletter(driver);
	  nl.test1_click_newsletter();
	  Thread.sleep(3000);
	  boolean result = nl.test2_return_output();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
