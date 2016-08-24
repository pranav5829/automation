package com.irctc.common.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightTicketsPage extends BasePage{

	public FlightTicketsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public WebDriver driver;

	public static final By FROM_CITY = By.xpath("//input[@id='origin']");
	public static final By TO_CITY = By.xpath("//input[@id='destination']");
	public static final By CITY_DROPDOWN_VALUE = By.xpath("//a[@class='ui-corner-all']");
	public static final By CALENDER_ICON = By.xpath("//div[@id='where']/div[4]/img");
	public static final By SELECT_DATE = By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[5]");
	public static final By ADULT_DROPDOWN = By.xpath("//select[@id='noOfAdult']");
	public static final By SELECT_ADULT = By.xpath("//select[@id='noOfAdult']/option[@value='2']");
	public static final By CHILDREN_DROPDOWN = By.xpath("//select[@id='noOfChild']");
	public static final By SELECT_CHILDREN = By.xpath("//select[@id='noOfChild']/option[@value='2']");
	public static final By INFANT_DROPDOWN = By.xpath("//select[@id='noOfInfant']");
	public static final By SELECT_INFANT = By.xpath("//select[@id='noOfInfant']/option[@value='1']");
	public static final By CLASS_DROPDOWN = By.xpath("//select[@id='classType']");
	public static final By SELECT_CLASS = By.xpath("//select[@id='classType']/option[@value='B']");
	public static final By AIRLINES_DROPDOWN = By.xpath("//select[@name='airlinePreference']");
	public static final By SELECT_AIRLINES = By.xpath("//select[@name='airlinePreference']/option[@value='ALL']");
	public static final By SEARCH_BUTTON = By.xpath("//div[@class='srchbtn' and @onclick='submitSearch();']");
	public static final By SEARCH_RESULTS = By.xpath("//div[@id='flightListResult']");


	public void selectOriginCity() throws InterruptedException{
		System.out.println("Selecting the Origin City");
		WebElement originCityButtonElement = driver.findElement(FROM_CITY);
		if (originCityButtonElement.isDisplayed()||originCityButtonElement.isEnabled())
			originCityButtonElement.sendKeys(TestConstants.originCity);
		Thread.sleep(2000);
		originCityButtonElement.sendKeys(Keys.TAB);

	}

	public void selectDestinationCity() throws InterruptedException{
		System.out.println("Selecting the Destination City");
		WebElement destinationCityButtonElement = driver.findElement(TO_CITY);
		if (destinationCityButtonElement.isDisplayed()||destinationCityButtonElement.isEnabled())
			destinationCityButtonElement.sendKeys(TestConstants.destinationCity);
		Thread.sleep(2000);
		destinationCityButtonElement.sendKeys(Keys.TAB);
	}

	public void clickOnCalender() throws InterruptedException{
		driver.findElement(CALENDER_ICON).click();
		Thread.sleep(3000);
	}

	public void selectDate(){
		WebElement dateElement = driver.findElement(SELECT_DATE);
		if (dateElement.isDisplayed()||dateElement.isEnabled())
			dateElement.click();
		else
			System.out.println("Calender Not Visible");
	}

	public void selectAdult() throws InterruptedException{
		driver.findElement(ADULT_DROPDOWN);
		Thread.sleep(2000);
		WebElement adultElement = driver.findElement(SELECT_ADULT);
		if (adultElement.isDisplayed()||adultElement.isEnabled())
			adultElement.click();
		else
			System.out.println("Adult Value Not Visible");
	}

	public void selectChildren() throws InterruptedException{
		driver.findElement(CHILDREN_DROPDOWN);
		Thread.sleep(2000);
		WebElement childrenElement = driver.findElement(SELECT_CHILDREN);
		if (childrenElement.isDisplayed()||childrenElement.isEnabled())
			childrenElement.click();
		else
			System.out.println("Children Value Not Visible");
	}

	public void selectInfant() throws InterruptedException{
		driver.findElement(INFANT_DROPDOWN);
		Thread.sleep(2000);
		WebElement infantElement = driver.findElement(SELECT_INFANT);
		if (infantElement.isDisplayed()||infantElement.isEnabled())
			infantElement.click();
		else
			System.out.println("Infant Value Not Visible");
	}

	public void selectClass() throws InterruptedException{
		driver.findElement(CLASS_DROPDOWN);
		Thread.sleep(2000);
		WebElement classElement = driver.findElement(SELECT_CLASS);
		if (classElement.isDisplayed()||classElement.isEnabled())
			classElement.click();
		else
			System.out.println("Class Value Not Visible");
	}

	public void selectAirlines() throws InterruptedException{
		driver.findElement(AIRLINES_DROPDOWN);
		Thread.sleep(2000);
		WebElement airlineElement = driver.findElement(SELECT_AIRLINES);
		if (airlineElement.isDisplayed()||airlineElement.isEnabled())
			airlineElement.click();
		else
			System.out.println("Airlines Value Not Visible");
	}

	public void clickOnSearchButton() throws InterruptedException{
		driver.findElement(SEARCH_BUTTON).click();
		Thread.sleep(5000);
	}

	public boolean verifySearchResults(){
		WebElement searchResultsBoxElement = driver.findElement(SEARCH_RESULTS);
		if (searchResultsBoxElement.isDisplayed()){
			return true;
		}
		else
			return false;		
	}
	
	public int getCountOfFlights(){
		int rowcount = driver.findElements(By.xpath("//table[@class='flightcont']")).size();
		System.out.println("Total Number of flights are" +rowcount);
		return rowcount;
	} 
}

	
