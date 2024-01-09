package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	WebDriver driver;

	public Cart(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnCart() throws InterruptedException
	
	{
		String x=driver.findElement(By.xpath("//span[text()=\"Cart\"]")).getText();
		String expected="Cart";
		org.testng.Assert.assertEquals(x, expected);

		driver.findElement(By.xpath("//span[text()=\"Cart\"]")).click();
	    Thread.sleep(2000);
	}
	
	public void verifyItemAdded()
	{
		 boolean t=driver.findElement(By.xpath("//a[text()=\"APPLE 2022 MacBook AIR Apple M2 - (8 GB/256 GB SSD/Mac OS Monterey) MLY33HN/A\"]")).isDisplayed();
		    if(t)
		    {
		    	System.out.println("---------------------------------------");
		    	System.out.println("Item successfully added to the Cart");
		    	System.out.println("---------------------------------------");
		    }
		
	}
}
