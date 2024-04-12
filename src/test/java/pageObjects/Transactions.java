package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Transactions  extends BaseClass{

	public Transactions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	By transactions = By.xpath("//a[@class='list-group-item'][normalize-space()='Transactions']");
	By cont  = By.xpath("//a[@class='btn btn-primary']");
	
	
	//Action Methods
	//Test1
	public void test1_click_transactions() {
		driver.findElement(transactions).click();
	}
	
	public void test1_click_continue() {
		driver.findElement(cont).click();
	}
	public boolean test1_ret_output() {
		boolean otpt = false;
		String title = driver.getTitle();
		if(title.equals("My Account")) {
			otpt = true;
		}
		else {
			otpt = false;
		}
		return otpt;
	}
}
