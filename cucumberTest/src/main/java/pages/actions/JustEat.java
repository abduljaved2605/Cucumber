package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.SeleniumDriver;


public class JustEat {
	WebDriver driver = SeleniumDriver.getDriver();

	
	public void enterAreaCode(String areaCode) throws Exception
	{
		driver.findElement(By.cssSelector("#main label")).click();
		//SeleniumDriver.getDriver().findElement(By.cssSelector("#main label input")).click();
		WebElement input = SeleniumDriver.getDriver().findElement(By.cssSelector("#main label input"));
		Thread.sleep(10000);
	      Actions action1 = new Actions(driver);
	      action1.moveToElement(input).sendKeys(areaCode).build().perform();
	      
	     
	}
	
	public void clickOnSearch() throws Exception
	{
		driver.findElement(By.cssSelector(".Form_c-search-btn-text_6RDDX")).click();
		Thread.sleep(10000);

	}

}
