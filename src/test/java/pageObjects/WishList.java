package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishList extends BaseClass{

	public WishList(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By add_to_wishlist  = By.xpath("//div[@id='product-product']//div[@class='btn-group']//button[1]");
	By wishlist1 = By.xpath("//a[normalize-space()='wish list']");
	By test1_pdname = By.xpath("//a[normalize-space()='iMac']");
	
	//Action Methods
	//Test1
	public void click_add_to_wishlist() {
		driver.findElement(add_to_wishlist).click();
	}
	public void click_wishlist_test1() {
		driver.findElement(wishlist1).click();
	}
	public boolean ret_test1_output() {
		boolean res = false;
		String product_name = driver.findElement(test1_pdname).getText();
		if(product_name.equals("iMac")) {
			res=true;
		}
		else {
			res=false;
		}
		return res;
	}

}
