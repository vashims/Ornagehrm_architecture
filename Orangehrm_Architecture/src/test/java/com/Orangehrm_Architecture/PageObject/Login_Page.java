package com.Orangehrm_Architecture.PageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_Page 
{
	public WebDriver driver;
	public Logger log;
	 public Login_Page(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//input[@id='txtUsername']") WebElement txt_username;
	 @FindBy(xpath = "//input[@id='txtPassword']") WebElement txt_password;
	 @FindBy(xpath = "//input[@id='btnLogin']") WebElement btn_login;
	 
	 public void login() throws Exception
	 {
		 txt_username.sendKeys("Admin");
		 txt_password.sendKeys("admin123");
		 btn_login.click();		 
		 
		 String title=driver.getTitle();     
		 log.info(title);
	 }
	 
}
