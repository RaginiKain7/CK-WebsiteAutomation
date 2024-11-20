package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {
	
	static WebDriver driver =null;
	public static String browsername=null;
	
	@BeforeTest
	public void setup() {	
		PropertiesFile.getProperties();
		
		if (browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.calvinklein.ae/en/");
	}
	
	@Test
	public void logoTest()
	{
		boolean flag = false;
		flag = pageObject.HomePage.headerLogo(driver).isDisplayed();
		Assert.assertTrue(flag);
	}

	
	@Test
	public void titleTest()
	
	{
		boolean flag = false;
		flag = pageObject.HomePage.headerLogo(driver).isDisplayed();
		Assert.assertTrue(flag);
		Assert.assertEquals(driver.getTitle(), "Calvin Klein® - Up to 50% Off");	
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}
}
