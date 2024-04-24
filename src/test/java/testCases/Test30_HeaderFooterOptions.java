package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HeaderFooterOptions;
import testBase.BaseClass;

public class Test30_HeaderFooterOptions extends BaseClass{
  @Test(groups = {"Sanity","Regression","Master"})
  public void test_options()throws Exception {
	  HeaderFooterOptions hfp = new HeaderFooterOptions(driver);
	  hfp.test_click_brands();
	  hfp.test_click_apple();
	  hfp.test_click_grid_view();
	  hfp.test_click_list_view();
	  boolean result = hfp.test_result();
	  if(result == true) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
	  }
  }
}
