package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchProducts;
import testBase.BaseClass;
import utilities.DataProviders;

public class Test06_SearchProducts extends BaseClass{
  @Test(groups = {"Regression","Master"},dataProvider="dp1",dataProviderClass=DataProviders.class)
  public void search_products(String input) {
	  try {
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search(input);
	  sp.search_submit();
	  sp.clear_data();
	  if(input.equalsIgnoreCase("iMac")) {
		  String re_val = sp.returned_value();
		  Assert.assertEquals(input, re_val);
	  }
	  else if(input.equalsIgnoreCase("fitbit")) {
		  String nps = sp.nonProductSearch();
		  System.out.println(nps);
		  Assert.assertEquals(nps, "There is no product that matches the search criteria.");
	  }
	  }
	  catch(Exception e) {
		  Assert.fail();
	  }
  }
}
