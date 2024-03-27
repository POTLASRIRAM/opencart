package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout extends BaseClass{

	public Checkout(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By validate_checkout = By.xpath("//h1[normalize-space()='Checkout']");
	
	//Test2
	By billing_newaddress = By.xpath("//input[@value='new']");
	By billing_cont = By.xpath("//input[@id='button-payment-address']");
	By error_warnings = By.xpath("//*[@id=\"payment-new\"]/div[1]/div/div");
	
	//Test3
	By checkout = By.xpath("//a[@class='btn btn-primary']");
	By address = By.xpath("//input[@id='input-payment-address-1']");
	By city = By.xpath("//input[@id='input-payment-city']");
	By post_code = By.xpath("//input[@id='input-payment-postcode']");
	By country = By.xpath("//label[@for='input-payment-country']");
	By state = By.xpath("//select[@id='input-payment-zone']");
	By existing_address = By.xpath("//label[normalize-space()='I want to use an existing address']//input[@name='shipping_address']");
	By cont1 = By.xpath("//input[@id='button-payment-address']");
	By existing_address1 = By.xpath("//label[normalize-space()='I want to use an existing address']//input[@name='shipping_address']");
	By cont2 = By.xpath("//input[@id='button-shipping-address']");
	By add_comments = By.xpath("//div[@id='collapse-shipping-method']//textarea[@name='comment']");
	By cont3 = By.xpath("//input[@id='button-shipping-method']");
	By get_comments = By.xpath("//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea");
	By termsandagreements = By.xpath("//input[@name='agree']");
	By cont4 = By.xpath("//input[@id='button-payment-method']");
	By confirm_order = By.xpath("//input[@id='button-confirm']"); 
	
	
	//Action methods
	//Test3
	public void test3_click_cont1() {
		driver.findElement(cont1).click();
				}
	
	public void test3_click_cont2() {
		driver.findElement(cont2).click();
				}
	public void test3_payments_add_comments() {
		driver.findElement(add_comments).sendKeys("This is my first order");
	}
	public void test3_click_cont3() {
		driver.findElement(cont3).click();
	}
	public boolean test3_ret_comment_output() {
		boolean output = false;
		String comment = driver.findElement(get_comments).getText();
		if(comment.matches("This is my first order")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}
	
	
	//Test2
	public void test2_select_billing_new_address() {
		driver.findElement(billing_newaddress).click();
	}
	public void test2_click_billing_continue() {
		driver.findElement(billing_cont).click();
	}
	public boolean test2_ret_errormsg_otpt() {
		boolean output = false;
		String error = driver.findElement(error_warnings).getText();
		if(error.equalsIgnoreCase("First Name must be between 1 and 32 characters!")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}
	
	//Test1
	public boolean test1_ret_checkoutres() {
		boolean otpt = false;
		String checkot = driver.findElement(validate_checkout).getText();
		if(checkot.equals("Checkout")) {
			otpt = true;
		}
		else {
			otpt = false;
		}
		return otpt;
	}
	
	

}
