package test.framework;

import pages.SearchPageFactoryObjectRepo;
import utilities.listeners.RetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import driver.BaseClass;

public class TestBookFlight  extends BaseClass{


	@Test(description = "Demo ---> xpedia site ",retryAnalyzer = RetryAnalyzer.class)
	public void selectFlightPage() {
		
		SearchPageFactoryObjectRepo.clickFlightTab();
		Assert.assertEquals(1, 2,"The values are not egual");

	}

}
