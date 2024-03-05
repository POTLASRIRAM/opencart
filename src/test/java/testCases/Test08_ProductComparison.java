package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CompareProduct;
import pageObjects.HomePage;
import pageObjects.SearchProducts;
import testBase.BaseClass;
import utilities.DataProviders;

public class Test08_ProductComparison extends BaseClass{
    /*
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
  
  @Test(priority=3,groups = {"Regression","Master"})
  public void compare_desktop_products() throws Exception{
	  HomePage hp = new HomePage(driver);
	  hp.clickdesktop();
	  hp.clickalldesktops();
	  CompareProduct cp = new CompareProduct(driver);
	  cp.click_lstview();
	  cp.click_prdct_compare();
	  cp.click_prdct_cmp();
	  String res = cp.ret_prdct_title();
	  if(res.equals("Product Details")) {
		  Assert.assertTrue(true);
		  System.out.println(res);
	  }
	  else {
		  Assert.fail();
	  }
	  
  }
	@Test(priority=4,groups = {"Regression","Master"})
	  public void ms() throws Exception{
		SearchProducts sp = new SearchProducts(driver);
		  sp.input_search("iMac");
		  sp.search_submit();
		  Thread.sleep(3000);
		  CompareProduct cp = new CompareProduct(driver);
		  cp.click_compare(); 
		  Thread.sleep(4000);
		  String ret_val1 = cp.imac();
		  if(ret_val1.equalsIgnoreCase("imac")) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
		  String ret_val2 = cp.pd_cmp();
		  if(ret_val2.equalsIgnoreCase("imac")) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
	  }
	@Test(priority=5,groups = {"Regression","Master"},dataProvider="dp3",dataProviderClass=DataProviders.class)
	  public void testFiveProducts(String input) throws Exception{
		SearchProducts sp = new SearchProducts(driver);
		  sp.input_search(input);
		  sp.search_submit();
		  Thread.sleep(3000);
		  sp.clear_data();
		  CompareProduct cp = new CompareProduct(driver);
		  if(input.equalsIgnoreCase("Macbook")) {
			  cp.click_Compare_product_macbook();
		  }
		  else if(input.equalsIgnoreCase("Macbook pro"))
		  {
		      cp.click_compare_product_macbookpro();
		  }
		  else if(input.equalsIgnoreCase("Macbook air"))
		  {
		      cp.click_compare_product_macbookair();
		  }
		  else if(input.equalsIgnoreCase("iphone")) {
			  cp.click_compare_products_iphone();
		  }
		  else {
			  cp.click_compare_product_imac();
		  }
		  Thread.sleep(5000);
		  cp.click_product_comparison();
		  int count = cp.check_comparison_product_count();
		  if(count<=5) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
		  Thread.sleep(5000);
		  System.out.println("Searched product :"+input);
		  
	}
	*/
	@Test(priority=6,groups = {"Regression","Master"})
	  public void test_click_addtocart() throws Exception{
		SearchProducts sp = new SearchProducts(driver);
		  sp.input_search("iMac");
		  sp.search_submit();
		  Thread.sleep(3000);
		  CompareProduct cp = new CompareProduct(driver);
		  cp.click_compare_product_imac();
		  Thread.sleep(4000);
		  cp.click_product_comparison();
		  Thread.sleep(3000);
		  cp.click_addtocart_imac();
		  Thread.sleep(3000);
		  cp.click_shoppingcart_imac();
		  Thread.sleep(3000);
		  String pd_name = cp.ret_shoppingcart_productname();
		  if(pd_name.equalsIgnoreCase("imac")) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.fail();
		  }
	}
}
