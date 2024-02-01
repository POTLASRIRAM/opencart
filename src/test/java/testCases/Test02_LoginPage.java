package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class Test02_LoginPage extends BaseClass{
	
  @Test(groups= {"Regression","Master"})
  public void test_Login() throws InterruptedException {
	  logger.info("*****Test02_LoginPage Started******");
	  HomePage hp = new HomePage(driver);
	  logger.info("***Home page oepend***");
	  hp.clickmy_Account();
	  logger.info("***Successfully Clicked on My Account***");
	  hp.clickLogin();
	  logger.info("***Successfully clicked on Login***");
	  logger.info("***Login page oepened***");
	  LoginPage lp = new LoginPage(driver);
	  lp.sendEmail(p.getProperty("email"));
	  logger.info("***Successfully entered email***");
	  lp.sendPassword(p.getProperty("password"));
	  logger.info("***Successfully entered password***");
	  lp.clickLogin();
	  logger.info("***Successfully clicked on login button***");
	  Thread.sleep(5000);
	  MyAccountPage map = new MyAccountPage(driver);
	  logger.info("***My Account Page opened***");
	  boolean ma_actual = false;
	try {
		ma_actual = map.check_Myaccount();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  logger.info("***Validating map output***");
	  Assert.assertEquals(true, ma_actual);
	  logger.info("***Validated map output***");
	  logger.info("***Login Successful***");
	  logger.info("***Performing logout***");
	  map.clickLogout();
	  logger.info("***Logout Successful***");
	  
	  
  }

}
