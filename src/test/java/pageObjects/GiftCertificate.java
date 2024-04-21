package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCertificate  extends BaseClass{

	public GiftCertificate(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By giftcertificate = By.xpath("//a[normalize-space()='Gift Certificates']");
	By recipents_name = By.xpath("//input[@id='input-to-name']");
	By recipents_email = By.xpath("//input[@id='input-to-email']");
	By name = By.xpath("//input[@id='input-from-name']");
	By email = By.xpath("//input[@id='input-from-email']");
	By gift_theme = By.xpath("//label[normalize-space()='Birthday']");
	By amount = By.xpath("//input[@id='input-amount']");
	By check_box = By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[1]");
	By cont1 = By.xpath("//input[@value='Continue']");
	By cont2 = By.xpath("//a[@class='btn btn-primary']");
	By checkout = By.xpath("//a[@class='btn btn-primary']");
	By checkout_cont = By.xpath("//input[@id='button-payment-address']");
	
	//Action Methods
	public void test_click_gift_certificate() {
		driver.findElement(giftcertificate).click();
	}
	public void test_input_recipents_name() {
		driver.findElement(recipents_name).sendKeys("Johnn");
	}
	public void test_input_recipents_email() {
		driver.findElement(recipents_email).sendKeys("johnn@email.com");
	}
	public void test_input_sender_name() {
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys("Sam");
	}
	public void test_input_sender_email() {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("Sam@email.com");
	}
	public void test_select_gift_theme() {
		driver.findElement(gift_theme).click();
	}
	public void test_input_amount() {
		driver.findElement(amount).sendKeys("10");
	}
	public void test_check_checkbox() {
		driver.findElement(check_box).click();
	}
	public void test_click_continue1() {
		driver.findElement(cont1).click();
	}
	public void test_click_continue2() {
		driver.findElement(cont2).click();
	}
	public void test_click_checkout() {
		driver.findElement(checkout).click();
	}
	public void test_click_checkout_continue() {
		driver.findElement(checkout_cont).click();
	}
	
	public boolean test_output() {
		boolean res = false;
		String title = driver.getTitle();
		if(title.equals("Checkout")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}

}
