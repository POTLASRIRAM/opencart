package testCases;


import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RgistrationPage;
import testBase.BaseClass;

public class Test01_AccountRegistrationTest extends BaseClass{
	
  

  @Test(groups = {"Sanity","Master"})
  public void test_Registration() throws Exception {
	 
	  logger.info("****Test01_Account Registration Instantiated****");
	  logger.debug("**Debug logs Instantiated**");
	  HomePage hp=new HomePage(driver);
	  logger.info("****Test My Account clicked****");
	  hp.clickmy_Account();
	  logger.info("****Test Register clicked****");
	  hp.clickRegister();
	  RgistrationPage rp = new RgistrationPage(driver);
	  logger.info("****Entered into Registration Page****");
	  rp.test_firstname(generate_randomfname());
	  logger.info("****Firstname Filled****");
	  rp.test_lastname(generate_randomlname());
	  logger.info("****Lastname Filled****");
	  rp.test_email(generate_email()+"@gmail.com");
	  logger.info("****Email Filled****");
	  rp.test_Password(generate_email()+generate_randomfname());                   
	  logger.info("****Password Filled****");
	  //rp.test_Newsletter();
	  logger.info("****Clicked on News_Letter****");
	  //rp.test_Checkbox();
	  logger.info("****Clicked on Checkbox****");
	  //rp.test_continue();
	  logger.info("****Clicked on Continue****");
	  //rp.confn_message();
	  logger.debug("**Debug logs Ended**");
	  logger.info("****Getting Confirmation message****");
  }

}
