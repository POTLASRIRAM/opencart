package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchProducts extends BaseClass{

	public SearchProducts(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	
	By search = By.xpath("//input[@placeholder='Search']");
	By search_submit = By.xpath("//button[@class='btn btn-default btn-lg']");
	By submit = By.xpath("//input[@id='button-search']");
    By search_icon = By.xpath("//i[@class='fa fa-search']");
	By ret_val = By.xpath("//a[normalize-space()='iMac']");
	By nonprodsearch = By.xpath("//p[contains(text(),'There is no product that matches the search criter')]");
	By pd = By.xpath("//h2[normalize-space()='Products meeting the search criteria']");
	By msp = By.xpath("//*[@id=\"content\"]/div[3]/div");
	By keywords = By.xpath("//input[@id='input-search']");
	By category = By.xpath("//*[@id=\"content\"]/div/div[2]/select/option");
	//Action Methods
	//p[contains(text(),'There is no product that matches the search criter')]
	public void input_search(String search_value) {
		driver.findElement(search).sendKeys(search_value);
	}
	public void click_Searchicon() {
		driver.findElement(search_icon).click();
	}
	public void input_Keyword(String sch_val) {
		driver.findElement(keywords).sendKeys(sch_val);
	}
	
	public void select_category(String catgy) {
		WebElement drp = driver.findElement(category);
		Select category = new Select(drp);
		category.selectByValue(catgy);
	}
	public void click_submit() {
		driver.findElement(search_submit).click();
	}
	
	/*public boolean resut_val() {
		boolean res = false;
		if(driver.findElement(ret_val).getText() == "iMac") {
			res = true;
		}
		else if((driver.findElement(nonprodsearch).getText()).contains("No products")) {
			res = false;
		}
		return res;
	}*/
	
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
		System.out.println("Fetching data");
		String nonpds = driver.findElement(nonprodsearch).getText();
		System.out.println(nonpds);
		return nonpds;
	}
	public int multiple_Search_Results() {
		List<WebElement> count = driver.findElements(msp);
		int ct = count.size();
		return ct;
	}
	public boolean result_val() {
		// TODO Auto-generated method stub
		boolean res = false;
		if(driver.findElement(ret_val).getText() == "iMac") {
			res = true;
		}
		else if((driver.findElement(nonprodsearch).getText()).contains("No products")) {
			res = false;
		}
		return res;
	}
	

}
