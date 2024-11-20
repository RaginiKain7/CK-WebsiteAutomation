package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductPageTest {
	static WebDriver driver =null;
	public static String browsername=null;
	
	@BeforeMethod
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
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.calvinklein.ae/en/");
	}
	
	@Test(priority = 2)
	public void titleTest()
	
	{
		Assert.assertEquals(driver.getTitle(), "Kérastase | Scalp and Hair Care - Official Boutique");	
	}
}
