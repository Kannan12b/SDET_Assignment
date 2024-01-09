package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFirstItem {
	WebDriver driver;

	public SelectFirstItem(WebDriver driver) {
		this.driver = driver;
	}

	public void selectFirstItem() {
		driver.findElement(By.xpath("(//div[@class=\"col col-7-12\"])[1]")).click();

	}
}
