package com.irctc.common.pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage implements WebDriver {

	public WebDriver driver;

	public static final By FLIGHT_TICKETS = By.xpath("//a[contains(text(),'Flight Tickets')]");

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnFlightTicketsButton(){
		System.out.println("Clicking the Flight Ticket Button");
		WebElement flightTicketButtonElement = driver.findElement(FLIGHT_TICKETS);
		if (flightTicketButtonElement.isDisplayed()||flightTicketButtonElement.isEnabled())
			flightTicketButtonElement.click();
		else
			System.out.println("Flight Ticket Button Not Found");
	}

	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}

	public String getPageURL(){
		String url = driver.getCurrentUrl();
		return url;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

}
