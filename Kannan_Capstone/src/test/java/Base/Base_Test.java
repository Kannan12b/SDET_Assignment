package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class Base_Test {
	protected WebDriver driver;
  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swayam\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
	    ChromeOptions o=new ChromeOptions();
	    o.addArguments("force-device-scale-factor=0.88");
		driver=new ChromeDriver(o);  
	      
	    driver.navigate().to("http://www.flipkart.com/");  
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
  }

}
