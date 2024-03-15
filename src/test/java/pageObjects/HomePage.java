package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	

}
