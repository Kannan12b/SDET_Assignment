package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class ClickOnADDCart {

	WebDriver driver;

	public ClickOnADDCart(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnAddCarts() throws InterruptedException {
		String originalWindow = driver.getWindowHandle();

		for (String windowHandle : driver.getWindowHandles()) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		String text=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\" and text()=\"Add to cart\"]")).getText();
		String expected="ADD TO CART";
		org.testng.Assert.assertEquals(text, expected);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();

	}
}
