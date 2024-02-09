package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class Test04_Logout extends BaseClass{
  @Test(groups = {"Regression","Master"})
  public void logout() {
	  logger.info("***Logout test***");
	  logger.info("*****Test04_Logout Started*****");
	  try {
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
	  LoginPage lp = new LoginPage(driver);
	  logger.info("**Sending User email**");
	  lp.sendEmail(p.getProperty("email"));
	  logger.info("**Sending Password**");
	  lp.sendPassword(p.getProperty("password"));
	  logger.info("**Clicked on Login**");
	  lp.clickLogin();
	  logger.info("**Login Successful**");
	  logger.info("**In My Account Page**");
	  MyAccountPage map = new MyAccountPage(driver);
	  map.check_Myaccount();
	  logger.info("**Verified My Account**");
	  Thread.sleep(4000);
	  logger.info("**In Logout Phase**");
	  Logout lout = new Logout(driver);
	  logger.info("**Clicked on Logout**");
	  lout.logout();
	  boolean lconf = lout.logoutConf();
	  System.out.println(lconf);
	  Assert.assertEquals(true, lconf);
	  logger.info("*****Logout Successful*****");
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	  
	  
  }
}
