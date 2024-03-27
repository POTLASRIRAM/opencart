package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountInformation extends BaseClass{

	public MyAccountInformation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	//Test1
	By account_information = By.xpath("//a[normalize-space()='Account Information']");
	By my_account_information = By.xpath("//h1[normalize-space()='My Account Information']");
	
	//Action Methods
	//Test1
	public void test1_click_account_information() {
		driver.findElement(account_information).click();
	}
	public boolean test1_ret_validation_output() {
		boolean output = false;
		String text = driver.findElement(my_account_information).getText();
		if(text.equals("My Account Information")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}

}
