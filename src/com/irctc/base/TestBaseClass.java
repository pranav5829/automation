package com.irctc.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass {
	
	public static WebDriver driver;
	

	@BeforeMethod
	public void openUrl(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		System.out.println("Great! You are on IRCTC Website");
	}

}

