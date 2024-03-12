package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCart extends BaseClass{

	public AddtoCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By wishlist = By.xpath("//button[@type='button']//i[@class='fa fa-heart']");
	By add_to_cart = By.xpath("//span[normalize-space()='Add to Cart']");
	By shopping_cart = By.xpath("//a[normalize-space()='shopping cart']");
	By product_name = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
	
	//Action methods
	
	public void click_wishlist() {
		driver.findElement(wishlist).click();
	}
	public void click_addto_cart() {
		driver.findElement(add_to_cart).click();
	}
	public void click_shopping_cart() {
		driver.findElement(shopping_cart).click();
	}
	public boolean get_product_name() {
		boolean pdname = false;
		String prdname = driver.findElement(product_name).getText();
		if(prdname.equals("iMac")) {
			pdname = true;
		}
		else {
			pdname = false;
		}
		return pdname;
	}
	
	

}
