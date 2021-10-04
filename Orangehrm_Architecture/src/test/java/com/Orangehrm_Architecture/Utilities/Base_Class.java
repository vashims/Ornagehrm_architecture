package com.Orangehrm_Architecture.Utilities;

import java.sql.Driver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base_Class 
{
	public WebDriver driver;
	public Logger log;
	
	@BeforeTest
	public void Browser_Open() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		log = Logger.getLogger("Orangehrm_Architecture");
		PropertyConfigurator.configure("log4j.properties");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);		
	}
	
	@AfterTest
	public void close_browser() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}
