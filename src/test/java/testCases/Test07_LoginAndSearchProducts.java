package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.SearchProducts;
import testBase.BaseClass;
import utilities.DataProviders;

public class Test07_LoginAndSearchProducts extends BaseClass{
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
  @Test(groups = {"Regression","Master"},dataProvider="dp1",dataProviderClass=DataProviders.class)
  public void login_search_products(String input) throws Exception {
	  
	  try {
		  SearchProducts sp = new SearchProducts(driver);
		  sp.input_search(input);
		  sp.search_submit();
		  sp.clear_data();
		  if(input.equalsIgnoreCase("iMac"))
		  {
			  String re_val = sp.returned_value();  
			  Assert.assertEquals(input, re_val);
			  
		  }
		  else if(input.equalsIgnoreCase("fitbit")) 
		  {
			  String nps = sp.nonProductSearch();
			  if(nps.equalsIgnoreCase("There is no product that matches the search criteria."))
			  {
				  Assert.assertTrue(true);
			  }
			  else
			  {
				  Assert.fail();
			  }
		  }
		  }
		  catch(Exception e)
		  {
			  Assert.fail();
		  }
	  
	  
  }
}
