package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDisplay extends BaseClass{

	public ProductDisplay(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	
	By imac = By.xpath("//a[normalize-space()='iMac']");
	By image1 = By.xpath("//li[1]//a[1]//img[1]");
	By back_arrow = By.xpath("//button[@title='Previous (Left arrow key)']");
	By forward_arrow = By.xpath("//button[@title='Next (Right arrow key)']");
	By esc_icon = By.xpath("//button[normalize-space()='×']");
	By image2 = By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[2]/a/img");
	By image3 = By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[3]/a/img");
	
	//Action methods
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

}
