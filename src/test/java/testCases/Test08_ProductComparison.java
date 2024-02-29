package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CompareProduct;
import pageObjects.SearchProducts;
import testBase.BaseClass;

public class Test08_ProductComparison extends BaseClass{
  @Test(priority=1,groups = {"Regression","Master"})
  public void compare_products() throws Exception{
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("iMac");
	  sp.search_submit();
	  Thread.sleep(3000);
	  CompareProduct cp = new CompareProduct(driver);
	  cp.click_compare();
	  Thread.sleep(4000);
	  cp.click_product_comparison();
	  String res = cp.ret_page_title();
	  if(res.equals("Product Comparison")) {
		  Assert.assertTrue(true);
		  System.out.println(res);
	  }
	  else {
		  Assert.fail();
	  }
	  
  }
  @Test(priority=2,groups = {"Regression","Master"})
  public void compare_products_listview() throws Exception{
	  SearchProducts sp = new SearchProducts(driver);
	  sp.input_search("iMac");
	  sp.search_submit();
	  Thread.sleep(3000);
	  CompareProduct cp = new CompareProduct(driver);
	  cp.click_listview();
	  Thread.sleep(4000);
	  cp.click_compare();
	  Thread.sleep(4000);
	  cp.click_product_comparison();
	  String res = cp.ret_page_title();
	  if(res.equals("Product Comparison")) {
		  Assert.assertTrue(true);
		  System.out.println(res);
	  }
	  else {
		  Assert.fail();
	  }
	  
  }
}
