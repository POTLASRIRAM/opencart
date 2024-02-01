package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class RgistrationPage extends BaseClass{
	
	
	//Constructor
	public RgistrationPage(WebDriver driver) {
	      super(driver);
	}
	
	//Locators
	
	By first_name = By.xpath("//input[@id='input-firstname']");
	By last_name = By.xpath("//input[@id='input-lastname']");
	By email = By.xpath("//input[@id='input-email']");
	By password = By.xpath("//input[@id='input-password']");
	By news_letter = By.xpath("//input[@id='input-newsletter-no']");
	By checkbox = By.xpath("//input[@name='agree']");
	By cont = By.xpath("//button[@type='submit']");
	By confirmation_message = By.xpath("//*[@class='row']/div[@class='col']/h1");
	
	//ActionMethods
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public void test_firstname(String fname) {
		
		driver.findElement(first_name).sendKeys(fname);
	}
	public void test_lastname(String lname) {
		driver.findElement(last_name).sendKeys(lname);
	}
	public void test_email(String user_email) {
		driver.findElement(email).sendKeys(user_email);
		
	}
	public void test_Password(String pswd) throws InterruptedException {
		driver.findElement(password).sendKeys(pswd);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
	}
	
	public void test_Newsletter() {
		driver.findElement(news_letter).click();
	}
	
	public void test_Checkbox() {
		driver.findElement(checkbox).click(); 	
	}
	
	public void test_continue() throws Exception {
		driver.findElement(cont).click();
	}
	
	public String confn_message() {
		try{
			String message = driver.findElement(confirmation_message).getText();
			return message;
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}

}
