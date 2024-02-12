package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Test05_ForgotPassword extends BaseClass{
  @Test(groups = {"Regression","Master"})
  public void forgot_Password() {
	  logger.info("**Opening Home Page**");
	  HomePage hp = new HomePage(driver);
	  logger.info("**Home Page opened successfully**");
	  logger.info("**Clicked on My Account**");
	  hp.clickmy_Account();
	  logger.info("**Clicked on My Account successfully**");
	  logger.info("**Clicked on Login**");
	  hp.clickLogin();
	  logger.info("**Clicked on Login successfully**");
	  logger.info("**Login Page opened successfully**");
	  logger.info("**Clicking on forgot password**");
	  ForgotPassword fp = new ForgotPassword(driver);
	  fp.forgot_password();
	  fp.click_continue();
	  logger.info("**Clicked on continue**");
	  String msg = fp.alrt_message();
	  if(msg.contains("warning")) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
