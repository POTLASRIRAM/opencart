package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public WebDriver driver;
	List<WebElement> drp;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public BaseClass(WebDriver driver) {
		
		this.driver=driver;
		
	}

}
