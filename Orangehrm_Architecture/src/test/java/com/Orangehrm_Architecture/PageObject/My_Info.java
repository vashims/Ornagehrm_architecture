package com.Orangehrm_Architecture.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class My_Info 
{
	public WebDriver driver;
	 public My_Info(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	  
	 @FindBy(xpath = "//b[normalize-space()='My Info']") WebElement tab_myinfo;
	 @FindBy(xpath = "//input[@id='btnSave']") WebElement btn_edit;
	 @FindBy(xpath = "//input[@id='personal_txtEmpFirstName']") WebElement txt_firstname;
	 @FindBy(xpath = "//input[@id='personal_txtEmpMiddleName']") WebElement txt_middlename;
	 @FindBy(xpath = "//input[@id='personal_txtEmpLastName']") WebElement txt_lastname;
	 @FindBy(xpath = "//input[@id='personal_txtEmployeeId']") WebElement txt_EmployeeID;
	 @FindBy(xpath = "//input[@id='personal_txtOtherID']") WebElement txt_OtherID;
	 @FindBy(xpath = "//input[@id='personal_txtLicenNo']") WebElement txt_LicenNo;
	 @FindBy(xpath = "//input[@id='personal_txtLicExpDate']") WebElement txt_LicExpDate;

	 public void click_myinfo()
	 {
		 tab_myinfo.click();
	 }
	 
	 public void click_edit() throws Exception
	 {
		 Thread.sleep(5000);
		 btn_edit.click();
		
	 }
 
	 public void personal_details_form() throws Exception
	 {
		 Thread.sleep(5000);
		 txt_firstname.clear();
		 txt_firstname.sendKeys("Vashim");		 
		 txt_middlename.clear();
		 txt_middlename.sendKeys("N");
		 txt_lastname.clear();
		 txt_lastname.sendKeys("Sheikh");
		 
	 }
}
