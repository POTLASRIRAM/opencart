package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage extends BaseClass{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	
	By myaccount = By.xpath("//*[@id=\"content\"]/h2[1]");
	By homemyaccount = By.xpath("//span[normalize-space()='My Account']");
	By logout = By.linkText("Logout");
	
	
	//Action Methods
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public void click_myaccount() {
		driver.findElement(homemyaccount).click();
	}
	
	public boolean check_Myaccount() throws Exception {
		String myacc_actual = driver.findElement(myaccount).getText();
		boolean acc_actual;
		if(myacc_actual.equals("My Account")) {
			acc_actual = true;
		}
		else {
			acc_actual = false;
		Assert.fail();
	}
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		return acc_actual;
		
	}
	
	public void clickLogout() {
		driver.findElement(logout).click();
	}
	

}
