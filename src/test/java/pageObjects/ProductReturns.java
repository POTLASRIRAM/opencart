package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductReturns extends BaseClass{

	public ProductReturns(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	
	By prodrettitle = By.xpath("//*[@id=\"content\"]/h1");
	//Test1
	By returnreason = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/div[4]/div/div[3]/label/input");
	By submit = By.xpath("//input[@value='Submit']");
	By endmsg = By.xpath("//p[contains(text(),'Thank you for submitting your return request. Your')]");
	//Test2
	By Email = By.xpath("//input[@id='input-email']");
			
	//Action Methods
	public boolean test1_ret_op() {
		boolean output = false;
		String text = driver.findElement(prodrettitle).getText();
		if(text.equals("Product Returns")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}
	//Test2
	public void test2_input_email(String email) {
	     driver.findElement(Email).sendKeys(email);
	}
	
	
	//Test1
	public void test1_click_returnreason() {
		driver.findElement(returnreason).click();
	}
	public void test1_click_submit() {
		driver.findElement(submit).click();
	}
	public boolean test1_ret_otpt() {
		boolean res = false;
		String text = driver.findElement(endmsg).getText();
		if(text.startsWith("Thank you")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}

}
