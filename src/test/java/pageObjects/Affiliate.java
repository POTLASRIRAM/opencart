package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Affiliate extends BaseClass{

	public Affiliate(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By register_affiliate = By.xpath("//a[normalize-space()='Register for an affiliate account']");
	By company = By.xpath("//input[@id='input-company']");
	By website = By.xpath("//input[@id='input-website']");
	By taxId = By.xpath("//input[@id='input-tax']");
	By payeename = By.xpath("//input[@id='input-cheque']");
	By aboutus_checkbox = By.xpath("//input[@name='agree']");
	By cont = By.xpath("//input[@value='Continue']");
	By successmsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//Action Methods
	public void test1_click_register_affiliate() {
		driver.findElement(register_affiliate).click();
	}
	public void test1_input_company(String comp) {
		driver.findElement(company).sendKeys(comp);
	}
	public void test1_input_website(String site) {
		driver.findElement(website).sendKeys(site);
	}
	public void test1_input_taxid(String tid) {
		driver.findElement(taxId).sendKeys(tid);
	}
	public void test1_input_payeename(String name) {
		driver.findElement(payeename).sendKeys(name);
	}
	public void test1_click_aboutuscheckbox() {
		driver.findElement(aboutus_checkbox).click();
	}
	public void test1_click_continue() {
		driver.findElement(cont).click();
	}
	public boolean test1_return_otpt() {
		boolean res = false;
		String text = driver.findElement(successmsg).getText();
		if(text.matches("^[a-zA-Z].*$")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	//)

}
