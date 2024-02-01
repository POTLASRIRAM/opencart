package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	 static public WebDriver driver;
	 public Logger logger;
	 public Properties p;
	@BeforeClass(groups = {"Sanity","Regression","Master"})
	@Parameters({"OS","browser"})
	  public void openBrowser(String os,String br) throws Exception {
		  logger = LogManager.getLogger(this.getClass());
		  FileReader file= new FileReader("D:\\Selenium with Java\\opencart\\src\\test\\resources\\config.properties");
		  p = new Properties();
		  p.load(file);
		  if(p.getProperty("exe_env").equalsIgnoreCase("remote")) {
			  DesiredCapabilities cap = new DesiredCapabilities();
			  switch(os.toLowerCase()) {
			  case "windows" : cap.setPlatform(Platform.WINDOWS);break;
			  case "linux" : cap.setPlatform(Platform.LINUX);break;
			  case "mac" : cap.setPlatform(Platform.MAC);break;
			  default : System.out.println("Please select operating system...."); return;
			  }
			  switch(br.toLowerCase()) {
			  case "chrome" : cap.setBrowserName("Chrome"); break;
			  case "firefox" : cap.setBrowserName("Firefox");break;
			  case "edge" : cap.setBrowserName("Edge");break;
			  default : System.out.println("Please select a browser....");return;
			  }
			  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			  
		  }
		  else {
		  switch(br.toLowerCase()) {
		  case "chrome" : driver = new ChromeDriver(); break;
		  case "firefox": driver = new FirefoxDriver(); break;
		  case "edge"   : driver = new EdgeDriver(); break;
		  default : System.out.println("Please select matching browser");
		             return;
		  }
		  }
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(p.getProperty("url"));
		  
	  }
	
	public String generate_randomfname() {
		  String fname = RandomStringUtils.randomAlphabetic(5);
		  return fname;
		  
	  }
	  public String generate_randomlname() {
		  String lname = RandomStringUtils.randomAlphabetic(4);
		  return lname;
	  }
	  public String generate_email() {
		  String email = RandomStringUtils.randomAlphabetic(7);
		  String email_no = RandomStringUtils.randomNumeric(4);
		  String emil = email+email_no;
		  return emil;
	  }
	  public String captureScreen(String tname) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
					
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			
			String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
			File targetFile=new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
				
			return targetFilePath;

		}
	  @AfterClass(groups = {"Sanity","Regression","Master"})
	  public void closeBrowser() {
		  driver.quit();
	  }
}