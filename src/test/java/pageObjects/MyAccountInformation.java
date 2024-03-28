package pageObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class MyAccountInformation extends BaseClass{

	public MyAccountInformation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	//Test1
	By account_information = By.xpath("//a[normalize-space()='Account Information']");
	By my_account_information = By.xpath("//h1[normalize-space()='My Account Information']");
	
	//Test2
	By drpdownmyaccount = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']");
	By edit_account_information = By.xpath("//a[normalize-space()='Edit your account information']");
	By mandatory_field = By.xpath("//label[@for='input-firstname']");
	
	//Action Methods
	//Test2
	public void test2_click_my_account() {
		driver.findElement(drpdownmyaccount).click();
	}
	public void test2_click_edit_account() {
		driver.findElement(edit_account_information).click();
	}
	public boolean test2_mandatory_field() throws Exception {
		boolean mandatoryotpt = false;
    	File src = driver.findElement(mandatory_field).getScreenshotAs(OutputType.FILE);
    	//File src = ts.getScreenshotAs(OutputType.FILE);
    	File trg = new File("D:\\Selenium with Java\\opencart\\screenshots\\Testscreenshots\\expected_image1.jpg");
    	FileUtils.copyFile(src, trg);
    	// Load expected image
        BufferedImage expectedImage = ImageIO.read(new File("D:\\\\Selenium with Java\\\\opencart\\\\screenshots\\\\Testscreenshots\\\\expected_image1.jpg"));

        // Load actual image
        BufferedImage actualImage = ImageIO.read(src);

        // Compare images
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

        // Analyze difference
        if (diff.hasDiff()) {
        	mandatoryotpt = false;
        }
        else {
        	mandatoryotpt = true;
        }
        return mandatoryotpt;
        
	}
	
	//Test1
	public void test1_click_account_information() {
		driver.findElement(account_information).click();
	}
	public boolean test1_ret_validation_output() {
		boolean output = false;
		String text = driver.findElement(my_account_information).getText();
		if(text.equals("My Account Information")) {
			output = true;
		}
		else {
			output = false;
		}
		return output;
	}

}
