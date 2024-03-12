
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
	//Test2
	By add_cart = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	By view_cart = By.xpath("//strong[normalize-space()='View Cart']");
	By product_name2 = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
	//Test3
	By desktop = By.xpath("//a[normalize-space()='Desktops']");
	By show_all_desktops = By.xpath("//a[normalize-space()='Show All Desktops']");
	By mac = By.xpath("//a[3]");
	By addtocarttest3 = By.xpath("//div[@class='button-group']//i[@class='fa fa-shopping-cart']");
	By shoppingcart = By.xpath("//a[normalize-space()='shopping cart']");
	By product_name3 = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
	//Test4
	By addtocart_Macbook = By.xpath("//div[@id='content']//div[1]//div[1]//div[3]//button[1]//span[1]");
    By product_name4 = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    
	//Action methods
	//Test4
    public void addcart_macbook() {
    	driver.findElement(addtocart_Macbook).click();
    }
    public void shoppingcart() {
    	driver.findElement(shoppingcart).click();
    }
    public boolean ret_macbook() {
    	boolean name = false;
    	String pdn = driver.findElement(product_name4).getText();
    	if(pdn.equals("MacBook")) {
    		name = true;
    	}
    	else {
    		name = false;
    	}
    	return name;
    }
    //Test3
	public void click_desktop() {
		driver.findElement(desktop).click();
	}
	public void click_show_desktops() {
		driver.findElement(show_all_desktops).click();
	}
	public void click_mac() {
		driver.findElement(mac).click();
	}
	public void add_cart() {
		driver.findElement(addtocarttest3).click();
	}
	public void click_shoppingcart_test3() {
		driver.findElement(shoppingcart).click();
	}
	public boolean get_pdname_test3() {
		boolean name = false;
		String pdname = driver.findElement(product_name3).getText();
		if(pdname.equals("iMac")) {
			name = true;
		}
		else {
			name = false;
		}
		return name;
	}
	//Test2
	public void click_add_to_cart() {
		driver.findElement(add_cart).click();
	}
	public void click_view_cart() {
		driver.findElement(view_cart).click();
	}
	public boolean re_pd_name() {
		boolean pdnm = false;
		String pdn = driver.findElement(product_name2).getText();
		if(pdn.equals("iMac")) {
			pdnm = true;
		}
		else {
			pdnm = false;
		}
		return pdnm;
	}
	//Test1
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