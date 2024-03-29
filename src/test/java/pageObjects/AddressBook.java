package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddressBook extends BaseClass{

	public AddressBook(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	//Test1
	By addressbook = By.xpath("//a[normalize-space()='Address Book']");
	By edit = By.xpath("//a[@class='btn btn-info']");
	By postalcode = By.xpath("//input[@id='input-postcode']");
	By cont = By.xpath("//input[@value='Continue']");
	By success_message = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//Test2
	By newaddress = By.xpath("//a[@class='btn btn-primary']");
	By firstname = By.xpath("//input[@id='input-firstname']");
	By lastname = By.xpath("//input[@id='input-lastname']");
	By Address1 = By.xpath("//input[@id='input-address-1']");
	By city = By.xpath("//input[@id='input-city']");
	By reg = By.xpath("//*[@id=\"input-zone\"]");
	By newaddsuccessmsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//Test3
	By addresspageheading = By.xpath("//h2[normalize-space()='Address Book Entries']");
	By addressbreadcrumb = By.xpath("//*[@id=\"account-address\"]/ul/li");
	
	//Action Methods
	//Test3
	public boolean test3_val_pageheading() {
		boolean res = false;
		String heading = driver.findElement(addresspageheading).getText();
		if(heading.equals("Address Book Entries")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	public void test3_val_breadcrumb() {
		boolean res = false;
		int count = driver.findElements(addressbreadcrumb).size();
		System.out.println(count);
	}
	
	public boolean test3_val_pagetitle() {
		boolean res=false;
		String title = driver.getTitle();
		if(title.equals("Address Book")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	public void test3_val_pageurl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	//Test2
	public void test2_click_newaddress() {
		driver.findElement(newaddress).click();
	}
	public void test2_add_details() {
		driver.findElement(firstname).sendKeys("ssssssss");
		driver.findElement(lastname).sendKeys("pppppppp");
		driver.findElement(Address1).sendKeys("1234 state line");
		driver.findElement(city).sendKeys("Yorkshire");
	}
	public void test2_select_region() throws Exception{
		String region = "Caerphilly";
		Select regions = new Select(driver.findElement(reg));
		regions.selectByVisibleText(region);
		Thread.sleep(4000);
	}
	public boolean test2_ret_output() {
		boolean res = false;
		String text = driver.findElement(newaddsuccessmsg).getText();
		if(text.equals("Your address has been successfully added")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	//Test1
	public void test1_click_addressbook() {
		driver.findElement(addressbook).click();
	}
	
	public void test1_click_edit_address() {
		driver.findElement(edit).click();
	}
	public void test1_edit_postalcode() {
		driver.findElement(postalcode).sendKeys("123456");
	}
	public void test1_click_continue() {
		driver.findElement(cont).click();
	}
	public boolean test1_ret_output() {
		boolean res = false;
		String text = driver.findElement(success_message).getText();
		if(text.equals("Your address has been successfully updated")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}

}
