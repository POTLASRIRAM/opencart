package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseClass{
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	
	By myAccount = By.xpath("//span[normalize-space()='My Account']");
	By myAccountbutton = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']");
	By register = By.xpath("//a[normalize-space()='Register']");
	By login = By.xpath("//a[normalize-space()='Login']");
	By desktop = By.xpath("//a[normalize-space()='Desktops']");
	By alldesktops = By.xpath("//a[normalize-space()='Show All Desktops']");
	
	//Test2
	WebElement desktops = (WebElement) By.xpath("//a[normalize-space()='Desktops']");
	WebElement pc = (WebElement) By.xpath("//a[normalize-space()='PC (0)']");
	By pc_continue = By.xpath("//a[@class='btn btn-primary']");
	
	//Action methods
	
	public void clickmy_Account() {
	     driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	}
	public void click_myaccount_button() {
		driver.findElement(myAccountbutton).click();
	}
	public void clickRegister() {
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public void clickdesktop() {
		driver.findElement(desktop).click();
	}
	public void clickalldesktops() {
		driver.findElement(alldesktops).click();
	}
	public String getpagetitle() {
		String title = driver.getTitle();
		return title;
	}
	
	//Test2
	Actions act = new Actions(driver);
	public void test2_Hover_Desktop_pc() {
		act.moveToElement(desktops).moveToElement(pc).click().perform();
	}
	

}
