package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDisplay extends BaseClass{

	public ProductDisplay(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	//Test1
	By imac = By.xpath("//a[normalize-space()='iMac']");
	By image1 = By.xpath("//li[1]//a[1]//img[1]");
	By back_arrow = By.xpath("//button[@title='Previous (Left arrow key)']");
	By forward_arrow = By.xpath("//button[@title='Next (Right arrow key)']");
	By esc_icon = By.xpath("//button[normalize-space()='×']");
	By image2 = By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[2]/a/img");
	By image3 = By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[3]/a/img");
	//Test2
	By apple_cinema30 = By.xpath("//a[normalize-space()='Apple Cinema 30\"']");
	By reviews = By.xpath("//a[normalize-space()='Reviews (0)']");
	By reviewer_name = By.xpath("//input[@id='input-name']");
	By review_text = By.xpath("//textarea[@id='input-review']");
	By rating = By.xpath("//*[@id=\"form-review\"]/div[4]/div/input[3]");
	By cont = By.xpath("//button[@id='button-review']");
	By success_msg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	//Test3
	By add_to_cart = By.xpath("//button[@id='button-cart']");
	By shopping_cart = By.xpath("//a[normalize-space()='shopping cart']");
	By checkout = By.xpath("//a[@class='btn btn-primary']");
	By fname = By.xpath("//input[@id='input-payment-firstname']");
	By lname = By.xpath("//input[@id='input-payment-lastname']");
	By address = By.xpath("//input[@id='input-payment-address-1']");
	By city = By.xpath("//input[@id='input-payment-city']");
	By post_code = By.xpath("//input[@id='input-payment-postcode']");
	By country = By.xpath("//label[@for='input-payment-country']");
	By state = By.xpath("//select[@id='input-payment-zone']");
	By existing_address = By.xpath("//label[normalize-space()='I want to use an existing address']//input[@name='shipping_address']");
	By cont1 = By.xpath("//input[@id='button-payment-address']");
	By existing_address1 = By.xpath("//label[normalize-space()='I want to use an existing address']//input[@name='shipping_address']");
	By cont2 = By.xpath("//input[@id='button-shipping-address']");
	By cont3 = By.xpath("//input[@id='button-shipping-method']");
	By termsandagreements = By.xpath("//input[@name='agree']");
	By cont4 = By.xpath("//input[@id='button-payment-method']");
	By confirm_order = By.xpath("//input[@id='button-confirm']"); 
	
	
	//Action methods
	//Test1
	public void click_imacname() {
		driver.findElement(imac).click();
	}
	public void click_imac_image1() {
		driver.findElement(image1).click();
	}
	public void click_backarrow() throws Exception{
		driver.findElement(back_arrow).click();
		Thread.sleep(4000);
		driver.findElement(back_arrow).click();
		Thread.sleep(4000);
		driver.findElement(back_arrow).click();
		Thread.sleep(4000);
	}
	
	public void click_forwardarrow() throws Exception{
		driver.findElement(forward_arrow).click();
		Thread.sleep(4000);
		driver.findElement(forward_arrow).click();
		Thread.sleep(4000);
		driver.findElement(forward_arrow).click();
		Thread.sleep(4000);
	}
	
	public void click_esc_icon() {
		driver.findElement(esc_icon).click();
	}
	public void click_imac_image2() {
		driver.findElement(image2).click();
	}
	public void click_imac_image3() {
		driver.findElement(image3).click();
	}
	//Test2
	public void click_apple_cinema() {
		driver.findElement(apple_cinema30).click();
	}
	public void click_review() {
		driver.findElement(reviews).click();
	}
	public void input_reviewer_name(String name) {
		driver.findElement(reviewer_name).sendKeys(name);
	}
	public void input_review_text(String text) {
		driver.findElement(review_text).sendKeys(text);
	}
	public void select_rating() {
		driver.findElement(rating).click();
	}
	public void click_continue() {
		driver.findElement(cont).click();
	}
	public boolean get_success_msg() {
		boolean msg_output = false;
		String msg = driver.findElement(success_msg).getText();
		if(msg.isEmpty()) {
			msg_output = false;
		}
		else {
			msg_output = true;
		}
		return msg_output;
	}
	//Test3
	

}
