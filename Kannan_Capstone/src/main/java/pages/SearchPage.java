package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(xpath="//div[@class="JFPqaw"]/span")
//	private WebElement cancelButton;

//	@FindBy(xpath="//input[@class=\"Pke_EE\"]")
//	private WebElement searchButton;

	public void clickOnCancelButton() {
		driver.findElement(By.xpath("//div[@class=\"JFPqaw\"]/span")).click();
	}

	public void searchQuery(String searchItem) {
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys(searchItem);
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys(Keys.ENTER);
	}
}
