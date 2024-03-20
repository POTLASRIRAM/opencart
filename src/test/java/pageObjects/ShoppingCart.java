package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends BaseClass{

	public ShoppingCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By sitemap = By.xpath("//a[normalize-space()='Site Map']");
	By sitemap_shoppingcart = By.xpath("//a[contains(text(),'Shopping Cart')]");
	By order_history = By.xpath("//h1[normalize-space()='Order History']");
	
	//Test2
	By cart = By.xpath("//span[@id='cart-total'] ");
	By view_cart = By.xpath("//strong[normalize-space()='View Cart']");
	By quantity = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input");
	
	//Test3
	By update_quantity = By.xpath("//input[contains(@name,'quantity')]");
	By update_button = By.xpath("//i[@class='fa fa-refresh']");
	By success_msg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//Action Methods
	//Test3
	public void test3_input() throws Exception{
		driver.findElement(update_quantity).clear();
		//Thread.sleep(3000);
		driver.findElement(update_quantity).sendKeys("4");
		Thread.sleep(3000);
	}
	public void test3_click_update() {
		driver.findElement(update_button).click();
	}
	
	public boolean test3_ret_otpt() {
		boolean res = false;
		String otpt = driver.findElement(success_msg).getText();
		if(otpt.equals("Success: You have modified your shopping cart!")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	//Test2
	public void test2_click_cart() {
		driver.findElement(cart).click();
	}
	public void test2_click_view_cart() {
		driver.findElement(view_cart).click();
	}
	public boolean test2_ret_output() {
		boolean res = false;
		String weight = driver.findElement(quantity).getAttribute("value");
		System.out.println("Printing weight....");
		System.out.println("Quantity :"+weight);
		int count = Integer.parseInt(weight);
		if(count>1) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	//Test1
	
	public void test1_click_sitemap() {
		driver.findElement(sitemap).click();
	}
	public void test1_click_shopping_cart() {
		driver.findElement(sitemap_shoppingcart).click();
	}
	public boolean test1_ret_output() {
		boolean otpt = false;
		String res = driver.findElement(order_history).getText();
		if(res.equals("Order History")) {
			otpt = true;
		}
		else {
			otpt = false;
		}
		return otpt;
	}
}
