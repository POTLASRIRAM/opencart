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

}
