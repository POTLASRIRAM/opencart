package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistory extends BaseClass{

	public OrderHistory(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	//Test1
	By orderhistory = By.xpath("//a[@class='list-group-item'][normalize-space()='Order History']");
	By orderscount = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr");
	By conti = By.xpath("//a[normalize-space()='Continue']");
	
	//Action Methods
	public void test_click_continue() {
		driver.findElement(conti).click();
	}
	//Test1
	public void test1_click_orderhistory() {
		driver.findElement(orderhistory).click();
	}
	public boolean test1_ret_result() {
		boolean res=false;
		int count = driver.findElements(orderscount).size();
		if(count>=1) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}

}
