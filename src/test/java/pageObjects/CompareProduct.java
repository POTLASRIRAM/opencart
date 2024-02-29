package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompareProduct extends BaseClass{

	public CompareProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	By list_view = By.xpath("//button[@id='list-view']");
	By compare_products = By.xpath("//i[@class='fa fa-exchange']");
	By product_comparison = By.xpath("//a[normalize-space()='product comparison']");
	
	//Action
	public void click_listview() {
		driver.findElement(list_view).click();
	}
	public void click_compare() {
		driver.findElement(compare_products).click();
	}
	
	public void click_product_comparison() {
		driver.findElement(product_comparison).click();
	}
	
	public String ret_page_title() {
		String page_title = driver.getTitle();
		
		return page_title;
	}

	
}
