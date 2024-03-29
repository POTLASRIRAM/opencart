package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompareProduct extends BaseClass{

	public CompareProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	By list_view = By.xpath("//button[@id='list-view']");
	By lst_view = By.xpath("//i[@class='fa fa-th-list']");
	By compare_products = By.xpath("//i[@class='fa fa-exchange']");
	By product_comparison = By.xpath("//a[normalize-space()='product comparison']");
	By prdct_cmp = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]");
	By click_prdct_cmp = By.xpath("//a[normalize-space()='product comparison']");
	By prdct_model = By.xpath("//*[@id=\"content\"]/table/tbody[1]/tr[4]/td[2]");
	By imac = By.xpath("//div[@class='alert alert-success alert-dismissible']//a[contains(text(),'iMac')]");
	By prd_cmp = By.xpath("//a[normalize-space()='product comparison']");
	By ret_val1 = By.xpath("//h1[normalize-space()='iMac']");
	By macbook = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]//i[1]");
	By imacc = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[3]");
	By macbookair = By.xpath("//button[3]");
	By macbookpro = By.xpath("//button[3]");
	By iphone = By.xpath("//i[@class='fa fa-exchange']");
	By comparison_count_limit = By.xpath("//*[@id=\"content\"]/table/tbody[1]/tr[4]/td");
	By addtocartimac = By.xpath("//input[@value='Add to Cart']");
	By shoppingcart = By.xpath("//a[normalize-space()='shopping cart']");
	By ret_shoppig_cart_productname = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
	
	//Action
	
	public int check_comparison_product_count() {
		List<WebElement> cnt = driver.findElements(comparison_count_limit);
		int count = cnt.size();
		return count;
	}
	
	public void click_Compare_product_macbook() throws Exception {
		Thread.sleep(3000);
		driver.findElement(macbook).click();
	}
	
	public void click_compare_product_imac()throws Exception {
		Thread.sleep(3000);
		driver.findElement(imacc).click();
	}
	
	public void click_compare_product_macbookair()throws Exception {
		Thread.sleep(3000);
		driver.findElement(macbookair).click();
	}
	
	public void click_compare_product_macbookpro() throws Exception{
		Thread.sleep(3000);
		driver.findElement(macbookpro).click();
	}
	public void click_compare_products_iphone()throws Exception {
		Thread.sleep(3000);
		driver.findElement(iphone).click();
	}
	public void click_addtocart_imac() {
		driver.findElement(addtocartimac).click();
	}
	
	public void click_shoppingcart_imac() {
		driver.findElement(shoppingcart).click();
	}
	
	public String ret_shoppingcart_productname() {
		String product_name = driver.findElement(ret_shoppig_cart_productname).getText();
		return product_name;
	}
	
	public String imac() throws Exception {
		driver.findElement(imac).click();
		String ret_val = driver.findElement(ret_val1).getText();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		return ret_val;
	}
	public String pd_cmp() throws Exception {
		driver.findElement(product_comparison).click();
		String ret_val2 = driver.findElement(By.xpath("//strong[normalize-space()='iMac']")).getText();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		return ret_val2;
	}
	public void click_listview() {
		driver.findElement(list_view).click();
	}
	public void click_lstview() {
		driver.findElement(lst_view).click();
	}
	public void click_compare() {
		driver.findElement(compare_products).click();
	}
	public void click_prdct_compare() {
		driver.findElement(prdct_cmp).click();
	}
	
	public void click_product_comparison() {
		driver.findElement(product_comparison).click();
	}
	public void click_prdct_cmp() {
		driver.findElement(click_prdct_cmp).click();
	}
	public String ret_prdct_title() {
		String prdct_model = driver.findElement(By.xpath("//strong[normalize-space()='Product Details']")).getText();
		return prdct_model;
	}
	
	public String ret_page_title() {
		String page_title = driver.getTitle();
		
		return page_title;
	}

	
}
