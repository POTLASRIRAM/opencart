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
	By warning_msg = By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]");
			
	//Test3
	By returns = By.xpath("//a[@class='list-group-item'][normalize-space()='Returns']");
	By view = By.xpath("//tbody/tr[1]/td[6]/a[1]/i[1]");
	
	
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
	//Test3
	
	public void test3_click_returns() {
		driver.findElement(returns).click();
	}
	public void test3_click_view() {
		driver.findElement(view).click();
	}
	
	public boolean test3_return_output() {
		boolean otpt = false;
		String title = driver.getTitle();
		if(title.equals("Return Information")) {
			otpt = true;
		}
		else {
			otpt = false;
		}
		return otpt;
	}
	
	//Test2
	public boolean test2_input_email(String email) {
		boolean res = false;
	    driver.findElement(Email).sendKeys(email);
	    driver.findElement(submit).click();
	    String error= driver.findElement(warning_msg).getText();
	    if(error.matches("^[a-zA-Z].*$")) {
	    	res = true;
	    }
	    else {
	    	res = true;
	    }
	    return res;
	    
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
