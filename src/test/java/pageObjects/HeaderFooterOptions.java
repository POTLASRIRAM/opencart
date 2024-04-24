package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderFooterOptions extends BaseClass{

	public HeaderFooterOptions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	By brands = By.xpath("//a[normalize-space()='Brands']");
	By apple = By.xpath("//a[normalize-space()='Apple']");
	By grid_view = By.xpath("//i[@class='fa fa-th']");
	By list_view = By.xpath("//i[@class='fa fa-th-list']");
	
	//Action methods
	public void test_click_brands() {
		driver.findElement(brands).click();
	}
	
	public void test_click_apple() {
		driver.findElement(apple).click();
	}
	
	public void test_click_grid_view() {
		driver.findElement(grid_view).click();
	}
	
	public void test_click_list_view() {
		driver.findElement(list_view).click();
	}
	
	public boolean test_result() {
		boolean result = false;
		String title = driver.getTitle();
		if(title.equals("Apple")) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}

}
