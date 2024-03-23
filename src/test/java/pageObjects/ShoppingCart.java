package pageObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ShoppingCart extends BaseClass{

	public ShoppingCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	//Test1
	By sitemap = By.xpath("//a[normalize-space()='Site Map']");
	By sitemap_shoppingcart = By.xpath("//a[contains(text(),'Shopping Cart')]");
	By order_history = By.xpath("//h1[normalize-space()='Order History']");
	
	//Test2
	By cart = By.xpath("//span[@id='cart-total'] ");
	By view_cart = By.xpath("//strong[normalize-space()='View Cart']");
	By quantity = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input");
	
	//Test3
	By update_quantity = By.xpath("//input[contains(@name,'quantity')]");
	By update_button = By.xpath("//i[@class='fa fa-refresh']");
	By success_msg = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	
	//Test4
	By previewimage = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[1]/a/img");
    By productname = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By model = By.xpath("//td[normalize-space()='Product 14']");
    By unitprice = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]");
    By total = By.xpath("//tbody//tr//td[6]");
			
    //Test12_ShoppingCart
    //Test1
    By continue_shopping = By.xpath("//a[@class='btn btn-default']");
    
	//Action Methods
    //Test12_ShoppingCart
    //Test1
    public void test1_Click_Continue_Shopping() {
    	driver.findElement(continue_shopping).click();
    }
    
    //Test4
    TakesScreenshot ts = (TakesScreenshot)driver;
    public boolean test4_validate_image() throws Exception {
    	boolean imageotpt = false;
    	File src = driver.findElement(previewimage).getScreenshotAs(OutputType.FILE);
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

        // Analyze difference
        if (diff.hasDiff()) {
        	imageotpt = false;
        }
        else {
        	imageotpt = true;
        }
        return imageotpt;
        
    }
    public boolean test4_validate_name() {
    	boolean nameotpt = false;
    	String name = driver.findElement(productname).getText();
    	if(name.equals("iMac")) {
    		nameotpt = true;
    	}
    	else {
    		nameotpt = false;
    	}
    	return nameotpt;
    }
    public boolean test4_validate_model() {
    	boolean modelotpt = false;
    	String pdmodel = driver.findElement(model).getText();
    	if(pdmodel.equals("Product 14")) {
    		modelotpt = true;
    	}
    	else {
    		modelotpt = false;
    	}
    	return modelotpt;
    }
    public boolean test4_validate_unitprice() {
    	boolean uprice= false;
    	String unitpr = driver.findElement(unitprice).getText();
    	if(unitpr.equals("$122.00")) {
    		uprice = true;
    	}
    	else {
    		uprice = false;
    	}
    	return uprice;
    }
    public boolean test4_validate_totalprice() {
    	boolean tprice = false;
    	String totalpr = driver.findElement(total).getText();
    	if(totalpr.equals("$244.00")) {
    		tprice = true;
    	}
    	else {
    		tprice = false;
    	}
    	return tprice;
    }
    
    
	//Test3
	public void test3_input() throws Exception{
		driver.findElement(update_quantity).clear();
		//Thread.sleep(3000);
		driver.findElement(update_quantity).sendKeys("4");
		Thread.sleep(3000);
	}
	public void test3_click_update() {
		driver.findElement(update_button).click();
	}
	
	public boolean test3_ret_otpt() {
		boolean res = false;
		String otpt = driver.findElement(success_msg).getText();
		if(otpt.equals("Success: You have modified your shopping cart!")) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	
	//Test2
	public void test2_click_cart() {
		driver.findElement(cart).click();
	}
	public void test2_click_view_cart() {
		driver.findElement(view_cart).click();
	}
	public boolean test2_ret_output() {
		boolean res = false;
		String weight = driver.findElement(quantity).getAttribute("value");
		System.out.println("Printing weight....");
		System.out.println("Quantity :"+weight);
		int count = Integer.parseInt(weight);
		if(count>1) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
	//Test1
	
	public void test1_click_sitemap() {
		driver.findElement(sitemap).click();
	}
	public void test1_click_shopping_cart() {
		driver.findElement(sitemap_shoppingcart).click();
	}
	public boolean test1_ret_output() {
		boolean otpt = false;
		String res = driver.findElement(order_history).getText();
		if(res.equals("Order History")) {
			otpt = true;
		}
		else {
			otpt = false;
		}
		return otpt;
	}
}
