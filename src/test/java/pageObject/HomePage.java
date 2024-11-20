package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
	
	public static WebElement header(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='mainMenuCheckout']"));
		return element;
	}
	
	public static WebElement headerLogo(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[contains(@class,'hidden-tb hidden-mb')]//img[@class='default-logo']"));
		return element;
	}
	
	public static WebElement headerCountrychanger(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[@class='switcher-toggle active']"));
		return element;
		//testing purpose
	}
	
	public static WebElement headerLanguagechanger(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='switcher-language']/a"));
		return element;
	}
	
	public static WebElement emailSignUp(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@class='header-toplinks']/ul/li[1]/a"));
		return element;
		
	}
}
