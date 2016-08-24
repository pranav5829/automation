package com.irctc.common.tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.irctc.base.TestBaseClass;
import com.irctc.common.pageObjects.BasePage;
import com.irctc.common.pageObjects.FlightTicketsPage;

public class IrctcTest extends TestBaseClass {
	
	public BasePage basePage;
	public FlightTicketsPage flightTicketsPage;


	@Test
	public void irctcTest() throws InterruptedException{
		String subWindowHandler = null;
		basePage = new BasePage(driver);
		flightTicketsPage = new FlightTicketsPage(driver);		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		flightTicketsPage.clickOnFlightTicketsButton();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); 
		flightTicketsPage.selectOriginCity();
		flightTicketsPage.selectDestinationCity();
		flightTicketsPage.clickOnCalender();
		flightTicketsPage.selectDate();
		flightTicketsPage.selectAdult();
		flightTicketsPage.selectChildren();
		flightTicketsPage.selectInfant();
		flightTicketsPage.selectClass();
		flightTicketsPage.selectAirlines();
		flightTicketsPage.clickOnSearchButton();
		Assert.assertTrue(flightTicketsPage.verifySearchResults(), "Flights can not be searched");
		flightTicketsPage.getCountOfFlights();
		driver.quit();

	}

}
