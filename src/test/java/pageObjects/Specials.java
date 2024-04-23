package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Specials extends BaseClass {

	public Specials(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	By specials = By.xpath("//a[normalize-space()='Specials']");
	By grid_view = By.xpath("//i[@class='fa fa-th']");
	By list_view = By.xpath("//button[@id='list-view']");
	By compare_product = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]");
	By product_comparison = By.xpath("//a[normalize-space()='product comparison']");
	By model = By.xpath("//*[@id=\"content\"]/table/tbody[1]/tr[4]/td[2]");
	
	//Action Methods
	public void test_click_specials() {
		driver.findElement(specials).click();
	}
	public void test_click_grid_view() {
		driver.findElement(grid_view).click();
	}
	public void test_click_list_view() {
		driver.findElement(list_view).click();
	}
	public void test_click_compare_this_product() {
		driver.findElement(compare_product).click();
	}
	public void test_click_product_comparison() {
		driver.findElement(product_comparison).click();
	}
	public boolean test_model() {
		boolean res1 = false;
		String product_model = driver.findElement(model).getText();
		if(product_model.equals("Product 15")) {
			res1 = true;
		}
		else {
			res1 = false;
		}
		return res1;
	}
	public boolean test_page_title() {
		boolean res2 = false;
		String title = driver.getTitle();
		if(title.equals("Product Comparison")) {
			res2 = true;
		}
		else {
			res2 = false;
		}
		return res2;
	}

}
