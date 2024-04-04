package pageObjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderInformation extends BaseClass {

	public OrderInformation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By view = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/i[1]");
	By order_id = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]");
	By retrn = By.xpath("//i[@class='fa fa-reply']");
	
	
	//Action Methods
	//Test3
	public boolean test3_ret_output() {
		boolean res = false;
		String title = driver.getTitle();
		if(title.equals("Order History")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	//Test2
	public void test2_click_return() {
		driver.findElement(retrn).click();
	}
	
	//Test1
	public void test1_click_view() {
		driver.findElement(view).click();
	}
	
	public boolean test1_ret_otp() {
		boolean otpt = false;
		String id = driver.findElement(order_id).getText();
		Pattern pattern = Pattern.compile("\\d+"); // Regular expression to match integers
		Matcher matcher = pattern.matcher(id);
		int intValue =0;
		if (matcher.find()) {
		    intValue = Integer.parseInt(matcher.group());
		    System.out.println("Integer value: " + intValue);
		}
		System.out.println(id);
		if(intValue == 2) {
			otpt = true;
		}
		else {
			otpt = false;
		}
		return otpt;
	}

}
