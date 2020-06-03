package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import driver.WebDriverThreadManager;
import logger.Tacitus;

public class SearchPageFactoryObjectRepo {

	public static WebDriver driver;
	public static ExtentTest test; 
	

	@FindBy(id = "tab-flight-tab-hp")
	private static WebElement flightTab;


	    public static void init() {
	        driver = WebDriverThreadManager.getDriver();
	        PageFactory.initElements(driver, SearchPageFactoryObjectRepo.class);
	    }


	public static void clickFlightTab() {
		Tacitus.getInstance().log("Finding flight webelement");
		try {
			flightTab.click();
		} catch (Exception ex) {
			Tacitus.getInstance().logError("Error while finding the webelement", ex);

		}
	}

}
