package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class Test03_LoginDataProvider extends BaseClass{
  @Test(dataProvider = "dp",dataProviderClass=DataProviders.class)
  public void testLogindataprovider(String email,String password,String res) throws Exception {
	  logger.info("*****Test02_LoginPage Started******");
	  HomePage hp = new HomePage(driver);
	  logger.info("***Home page oepend***");
	  hp.clickmy_Account();
	  logger.info("***Successfully Clicked on My Account***");
	  hp.clickLogin();
	  logger.info("***Successfully clicked on Login***");
	  logger.info("***Login page oepened***");
	  LoginPage lp = new LoginPage(driver);
	  lp.sendEmail(email);
	  logger.info("***Successfully entered email***");
	  lp.sendPassword(password);
	  logger.info("***Successfully entered password***");
	  lp.clickLogin();
	  logger.info("***Successfully clicked on login button***");
	  //Thread.sleep(5000);
	  MyAccountPage map = new MyAccountPage(driver);
	  logger.info("***My Account Page opened***");
	  boolean ma_actual = map.check_Myaccount();
	  if(res.equalsIgnoreCase("Valid"))
		{
			if(ma_actual==true)
			{
				map.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
	  if(res.equalsIgnoreCase("Invalid"))
		{
			if(ma_actual==true)
			{
				map.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	  
	  
  }
}
