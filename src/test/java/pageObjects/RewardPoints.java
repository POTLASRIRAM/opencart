package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RewardPoints extends BaseClass{

	public RewardPoints(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By rewardpoints = By.xpath("//a[normalize-space()='Reward Points']");
	By cont = By.xpath("//a[@class='btn btn-primary']");
	
	//Action Methods
	public void test1_click_rewardpoints() {
		driver.findElement(rewardpoints).click();
	}
	public void test1_click_continue() {
		driver.findElement(cont).click();
	}
	public boolean test1_ret_output() {
		boolean res = false;
		String currentpagetitle = driver.getTitle();
		if(currentpagetitle.equals("My Account")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	

}
