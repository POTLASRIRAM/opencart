package testCases;

import org.testng.annotations.Test;

import pageObjects.ProductDisplay;
import pageObjects.SearchProducts;
import testBase.BaseClass;

public class Test09_ProductDisplayPage extends BaseClass {
  @Test(priority=1,groups = {"Regression","Master"})
  public void f()throws Exception{
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
}
