package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchProducts;
import testBase.BaseClass;

public class Test06_SearchProducts extends BaseClass{
  @Test(groups = {"Regression","Master"})
  public void search_products() {
	  try {
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search(p.getProperty("s_value1"));
	  sp.search_submit();
	  String re_val = sp.returned_value();
	  Assert.assertEquals("iMac", re_val);
	  }
	  catch(Exception e) {
		  Assert.fail();
	  }
  }
}
