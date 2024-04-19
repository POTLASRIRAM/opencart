package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Newsletter  extends BaseClass{

	public Newsletter(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test2
	By selected_radio = By.xpath("//input[@value='1']");
	
	//Test1
	By newsletter_subscribe = By.xpath("//a[normalize-space()='Subscribe / unsubscribe to newsletter']");
	By newsletter = By.xpath("//a[@class='list-group-item'][normalize-space()='Newsletter']");
	By radio_yes = By.xpath("//label[normalize-space()='Yes']");
	By cont  = By.xpath("//input[@value='Continue']");
	By success_message = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//Action Methods
	//Test1
	public void test1_click_newsletter_subscribe() {
		driver.findElement(newsletter_subscribe);
	}
	public void test1_navigate_back() {
		driver.navigate().back();
	}
	public void test1_click_newsletter() {
		driver.findElement(newsletter).click();
	}
	public void test1_select_yes() {
		driver.findElement(radio_yes).click();
	}
	public void test1_click_continue() {
		driver.findElement(cont).click();
	}
	public boolean test1_return_output() {
		boolean res = false;
		String message = driver.findElement(success_message).getText();
		if(message.matches("^[a-zA-Z].*$")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	//Test2
	public boolean test2_return_output() {
		boolean res = false;
		String text = driver.findElement(selected_radio).getAttribute("value");
		if(text.equalsIgnoreCase("1")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}

}
