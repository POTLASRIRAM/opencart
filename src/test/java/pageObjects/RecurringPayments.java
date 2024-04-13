package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecurringPayments  extends BaseClass{

	public RecurringPayments(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By recurring_payments = By.xpath("//a[@class='list-group-item'][normalize-space()='Recurring payments']");
	By cont = By.xpath("//a[@class='btn btn-primary']");
	
	//Action Methods
	public void test1_click_recurring_methods() {
		driver.findElement(recurring_payments).click();
	}
	
	public void test1_click_continue() {
		driver.findElement(cont).click();
	}
	
	public boolean test1_return_otpt() {
		boolean res = false;
		String title = driver.getTitle();
		if(title.equals("My Account")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	//)

}
