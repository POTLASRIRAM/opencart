package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	//Test2
	By modify_wishlist = By.xpath("//a[normalize-space()='Modify your wish list']");
	By remove_wl_product = By.xpath("//i[@class='fa fa-times']");
	By modify_res = By.xpath("//i[@class='fa fa-times']");
	By my_wishlist = By.xpath("//h2[normalize-space()='My Wish List']");
	By wishlist2 = By.xpath("//span[normalize-space()='Wish List (1)']");
	By wishlist3 = By.xpath("//a[normalize-space()='Wish List']");
	By successful_remove = By.xpath("//*[@id=\"content\"]/h2");
	
	//Test3
    By add_imac_to_wishlist = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[2]");
    By wishlist_count = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr");
    
    //Test4
    By bredcrumb = By.xpath("//*[@id=\"account-wishlist\"]/ul/li");
    
    
	//Action Methods
    //Test4
    public boolean get_brudcrumb_info() {
    	boolean count = false;
    	List<WebElement> items = driver.findElements(bredcrumb);
    	for(WebElement x : items) {
    		System.out.println(x.getText());
    	}
    	if(items.size() == 3) {
    		count = true;
    	}
    	else {
    		count = false;
    	}
    	return count;
    	
    }
    
    //Test3
    public void click_imac_to_wishlist() {
    	driver.findElement(add_imac_to_wishlist).click();
    	/*driver.findElement(add_imac_to_wishlist).click();
    	driver.findElement(add_imac_to_wishlist).click();
    	driver.findElement(add_imac_to_wishlist).click();
    	*/
    }
    public void click_test3_wishlist() {
    	driver.findElement(add_to_wishlist).click();
    }
    public boolean ret_product_count() {
    	boolean res= false;
    	int count = driver.findElements(wishlist_count).size();
    	System.out.println(count);
    	if(count == 1) {
    		res = true;
    	}
    	else {
    		res = false;
    	}
    	return res;
    }
    
	//Test2
	public boolean click_top_wishlist() {
		boolean output = false;
		driver.findElement(wishlist2).click();
		String name = driver.findElement(my_wishlist).getText();
		if(name.equals("My Wish List")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}
	public boolean click_footer_wishlist() {
		boolean output = false;
		driver.findElement(wishlist3).click();
		String name = driver.findElement(my_wishlist).getText();
		if(name.equals("My Wish List")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}
	public void click_modify_wishlist() {
		driver.findElement(modify_wishlist).click();
	}
	public void click_remove_wishlist_item() {
		driver.findElement(remove_wl_product).click();
	}
	
	public boolean ret_remove_output() {
		boolean output = false;
		String otpt = driver.findElement(successful_remove).getText();
		System.out.println(otpt);
		if(otpt.equals("My Wish List")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}
	
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
