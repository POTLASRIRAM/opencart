package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.ContactUs;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import testBase.BaseClass;

public class Test27_ContactUs extends BaseClass{
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
  @Test(priority = 1, groups = {"Sanity","Regression","Master"})
  public void test1_contactus() throws Exception{
	  ContactUs cu = new ContactUs(driver);
	  cu.test1_click_phone_icon();
	  cu.test_clear_name_field();
	  cu.test_clear_email_field();
	  Thread.sleep(3000);
	  cu.test1_click_submit();
	  boolean result = cu.test1_output();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
  
  @Test(priority = 2, groups = {"Sanity","Regression","Master"})
  public void test2_contactus() throws Exception{
	  ContactUs cu = new ContactUs(driver);
	  cu.test1_click_phone_icon();
	  cu.test_clear_name_field();
	  cu.test_clear_email_field();
	  cu.test2_input_name();
	  cu.test2_input_email();
	  cu.test2_input_enquiry();
	  cu.test1_click_submit();
	  boolean result = cu.test2_output();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
