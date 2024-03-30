package pageObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class HomePage extends BaseClass{
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	
	By myAccount = By.xpath("//span[normalize-space()='My Account']");
	By myAccountbutton = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']");
	//By register = By.xpath("//a[normalize-space()='Register']");
	By login = By.xpath("//a[normalize-space()='Login']");
	By register = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']");
	By desktop = By.xpath("//a[normalize-space()='Desktops']");
	By alldesktops = By.xpath("//a[normalize-space()='Show All Desktops']");
	
	//Test2
	WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement pc = driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
	By pc_continue = By.xpath("//a[@class='btn btn-primary']");
	
	//Test3
	By homepageimage = By.xpath("//img[@title='Your Store']");
	
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
	public void test1_click_register() {
		driver.findElement(register).click();
	}
	
	//Test2
	Actions act = new Actions(driver);
	public void test2_Hover_Desktop_pc() {
		act.moveToElement(desktops).moveToElement(pc).click().perform();
	}
	public void test2_Pc_Continue() {
		driver.findElement(pc_continue).click();
	}
	
	//Test3
	public void test3_click_HomePage() {
		driver.findElement(homepageimage).click();
	}//*[@id="slideshow0"]/div/div[" + index + "]
	public void test3_get_images() throws Exception {
		//String dynamicXPath = String.format("//*[@id=\"slideshow0\"]/div/div[\" + index + \"]");
		//driver.findElement(By.xpath(dynamicXPath));
		//String altText = "iPhone 6"; // or "MacBookAir" depending on which one you want to locate

		//String dynamicXPath = String.format("//div[@class='swiper-slide text-center swiper-slide-active']//img[@alt='%s']", altText);
		
		File src = driver.findElement(By.xpath("//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']//img[@alt='iPhone 6']")).getScreenshotAs(OutputType.FILE);
    	//File src = ts.getScreenshotAs(OutputType.FILE);
    	File trg = new File("D:\\Selenium with Java\\opencart\\screenshots\\Testscreenshots\\expected_image.jpg");
    	FileUtils.copyFile(src, trg);
    	// Load expected image
        BufferedImage expectedImage = ImageIO.read(new File("D:\\\\Selenium with Java\\\\opencart\\\\screenshots\\\\Testscreenshots\\\\expected_image.jpg"));

        // Load actual image
        BufferedImage actualImage = ImageIO.read(src);

        // Compare images
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
        boolean imageotpt = false;
        // Analyze difference
        if (diff.hasDiff()) {
        	imageotpt = false;
        }
        else {
        	imageotpt = true;
        }
	}
	

}
