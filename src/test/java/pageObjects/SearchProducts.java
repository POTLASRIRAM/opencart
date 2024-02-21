package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProducts extends BaseClass{

	public SearchProducts(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	
	By search = By.xpath("//input[@placeholder='Search']");
	By search_submit = By.xpath("//button[@class='btn btn-default btn-lg']");
	By ret_val = By.xpath("//a[normalize-space()='iMac']");
	By nonprodsearch = By.xpath("p[contains(text(),'There is no product that matches the search criter')]");
	//Action Methods
	//p[contains(text(),'There is no product that matches the search criter')]
	public void input_search(String search_value) {
		driver.findElement(search).sendKeys(search_value);
	}
	
	public void search_submit() {
		driver.findElement(search_submit).click();
	}
	public void clear_data() {
		driver.findElement(search).clear();
	}
	
	public String returned_value() {
		String ret_value = driver.findElement(ret_val).getText();
		return ret_value;
	}
	public String nonProductSearch() {
		String nonpds = driver.findElement(nonprodsearch).getText();
		System.out.println(nonpds);
		return nonpds;
	}
	
	

}
