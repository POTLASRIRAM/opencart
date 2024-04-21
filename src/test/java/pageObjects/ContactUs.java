package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs extends BaseClass{

	public ContactUs(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	By phone = By.xpath("//i[@class='fa fa-phone']");
	By name = By.xpath("//input[@id='input-name']");
	By email_address = By.xpath("//input[@id='input-email']");
	By enquiry = By.xpath("//textarea[@id='input-enquiry']");
	By submit = By.xpath("//input[@value='Submit']");
	By error_msg = By.xpath("//div[contains(text(),'Name must be between 3 and 32 characters!')]");
	By cont_success_msg = By.xpath("//p[contains(text(),'Your enquiry has been successfully sent to the sto')]");
	
	//Action Methods
	//Test1
	public void test1_click_phone_icon() {
		driver.findElement(phone).click();
	}
	public void test_clear_name_field() {
		driver.findElement(name).clear();
	}
	public void test_clear_email_field() {
		driver.findElement(email_address).clear();
	}
	public void test1_click_submit() {
		driver.findElement(submit).click();
	}
	public boolean test1_output() {
		boolean res = false;
		String msg = driver.findElement(error_msg).getText();
		if(msg.matches("^[a-zA-Z0-9].*$")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	//Test2
	public void test2_input_name() {
		driver.findElement(name).sendKeys("Sammm");
	}
	public void test2_input_email() {
		driver.findElement(email_address).sendKeys("abccc@email.com");
	}
	public void test2_input_enquiry() {
		driver.findElement(enquiry).sendKeys("No queries as of now.In case of further queries will update you");
	}
	public boolean test2_output() {
		boolean res = false;
		String successmsg = driver.findElement(cont_success_msg).getText();
		if(successmsg.matches("^[a-zA-Z].*$")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
		
	}
	//)

}
