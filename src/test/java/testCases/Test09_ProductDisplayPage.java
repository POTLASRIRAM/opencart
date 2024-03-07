package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import pageObjects.ProductDisplay;
import pageObjects.SearchProducts;
import testBase.BaseClass;

public class Test09_ProductDisplayPage extends BaseClass {
  /*@Test(priority=1,groups = {"Regression","Master"})
  public void test_validate_thumbnails()throws Exception{
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("imac");
	  sp.click_submit();
	  Thread.sleep(5000);
	  ProductDisplay pd = new ProductDisplay(driver);
	  pd.click_imacname();
	  Thread.sleep(3000);
	  pd.click_imac_image1();
	  Thread.sleep(3000);
	  pd.click_backarrow();
	  Thread.sleep(3000);
	  pd.click_forwardarrow();
	  Thread.sleep(3000);
	  pd.click_esc_icon();
	  Thread.sleep(4000);
	  pd.click_imac_image2();
	  Thread.sleep(3000);
	  pd.click_backarrow();
	  Thread.sleep(3000);
	  pd.click_forwardarrow();
	  Thread.sleep(3000);
	  pd.click_esc_icon();
	  Thread.sleep(4000);
	  pd.click_imac_image3();
	  Thread.sleep(3000);
	  pd.click_backarrow();
	  Thread.sleep(3000);
	  pd.click_forwardarrow();
	  Thread.sleep(3000);
	  pd.click_esc_icon();
	  Thread.sleep(4000);
  }
  
  @Test(priority=2,groups = {"Regression","Master"})
  public void test_write_review()throws Exception{
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("apple cinema 30");
	  sp.click_submit();
	  Thread.sleep(5000);
	  ProductDisplay pd = new ProductDisplay(driver);
	  pd.click_apple_cinema();
	  pd.click_review();
	  pd.input_reviewer_name(generate_randomname());
	  pd.input_review_text(generate_randomtext());
	  pd.select_rating();
	  pd.click_continue();
	  boolean res = pd.get_success_msg();
	  if(res == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
  */
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

	  @Test(priority=3,groups = {"Regression","Master"})
	  public void test_navigation_productdisplay()throws Exception{
		  SearchProducts sp = new SearchProducts(driver);
		  sp.input_search("apple cinema 30");
		  sp.click_submit();
		  Thread.sleep(5000);
		  ProductDisplay pd = new ProductDisplay(driver);
		  pd.click_apple_cinema();
		  
	
  
}
