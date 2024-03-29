package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.ChangePassword;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import testBase.BaseClass;

public class Test16_ChangePassword extends BaseClass{
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
  @Test(priority = 1,groups = {"Sanity","Regression","Master"})
  public void test1_changepsswd() throws Exception{
	  ChangePassword cp = new ChangePassword(driver);
	  cp.test1_click_changepassword();
	  cp.test1_input_password();
	  cp.test1_input_confirm_password();
	  cp.test1_continue();
	  boolean res = cp.test1_ret_output();
	  if(res == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
	
	@Test(priority = 2,groups = {"Sanity","Regression","Master"})
	  public void test2_changepsswd() throws Exception{
		  ChangePassword cp = new ChangePassword(driver);
		  cp.test1_click_changepassword();
		  boolean res_pswd = cp.test2_get_password_type();
		  boolean res_cnfpswd = cp.test2_get_confirmpassword_type();
		  if(res_pswd == true && res_cnfpswd == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
		  
	  }
	  */
	@Test(priority = 3,groups = {"Sanity","Regression","Master"})
	  public void test3_changepsswd() throws Exception{
		  ChangePassword cp = new ChangePassword(driver);
		  cp.test1_click_changepassword();
		  cp.test1_input_password();
		  Thread.sleep(3000);
		  cp.test1_input_confirm_password();
		  cp.test3_click_back();
		  cp.test1_click_changepassword();
		  boolean res = cp.test3_ret_res();
		  if(res == true) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
		  
	  }
}
