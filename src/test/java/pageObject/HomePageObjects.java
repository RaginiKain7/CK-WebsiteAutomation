package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {

	WebDriver driver = null;
	
	By headerLogo = By.xpath("(//img[@class='default-logo'])[1]");
	By headerCategoryWomen = By.xpath("//a[@id='desktopMenuWomen']");
	By headerCategoryMen = By.xpath("//a[@id='desktopMenuMen']");	
	By headerCategoryKids = By.xpath("//a[@id='desktopMenuKids']");
	By headerSearch = By.xpath("//div[@id='desktopMiniSearch']//input[@id='search']");
	By headerLanguageCountryChanger = By.xpath("//a[@id='openCountryLangSlider']");
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	
	
}
