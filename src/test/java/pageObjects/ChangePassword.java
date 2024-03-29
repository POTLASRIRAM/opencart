package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePassword extends BaseClass{

	public ChangePassword(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	//Test1
	By change_password = By.xpath("//a[normalize-space()='Change your password']");
	By password = By.xpath("//input[@id='input-password']");
	By confirm_password = By.xpath("//input[@id='input-confirm']");
	By cont = By.xpath("//input[@value='Continue']");
	By success_msg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//Test3
	By back = By.xpath("//a[@class='btn btn-default']");
			
	//Action Methods
	//Test3
	public void test3_click_back() {
		driver.findElement(back).click();
	}
	public void test3_input_password() {
		
	}
	public boolean test3_ret_res() {
		boolean output=false;
		String word = driver.findElement(password).getAttribute("placeholder");
		if(word.equals("Password")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}
	
	//Test2
	public boolean test2_get_password_type() {
		boolean res = false;
		String type = driver.findElement(password).getAttribute("type");
		if(type.equals("password")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	public boolean test2_get_confirmpassword_type() {
		boolean res = false;
		String type = driver.findElement(confirm_password).getAttribute("type");
		if(type.equals("password")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	//Test1
	public void test1_click_changepassword() {
		driver.findElement(change_password).click();
	}
	public void test1_input_password() {
		driver.findElement(password).sendKeys("Potla@1999");
	}
	public void test1_input_confirm_password() {
		driver.findElement(confirm_password).sendKeys("Potla@1999");
	}
	public void test1_continue() {
		driver.findElement(cont).click();
	}
	public boolean test1_ret_output() {
		boolean otpt = false;
		String smsg = driver.findElement(success_msg).getText();
		if(smsg.equals("Success: Your password has been successfully updated.")) {
			otpt = true;
		}
		else {
			otpt = false;
		}
		return otpt;
	}

}
