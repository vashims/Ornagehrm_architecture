package com.Orangehrm_Architecture.TestCases;

import org.testng.annotations.Test;

import com.Orangehrm_Architecture.PageObject.Login_Page;
import com.Orangehrm_Architecture.PageObject.My_Info;
import com.Orangehrm_Architecture.Utilities.Base_Class;

public class TC_001_LoginTest extends Base_Class
{
	@Test(priority = 1, description = "To Verify User should be login")
   
	public void login() throws Exception {
		Login_Page lgn= new Login_Page(driver);
		lgn.login();
//		String title = driver.getTitle();
//		log.info(title);
	}
	
	@Test(priority = 2, description = "To Verify My Info tab should be open")
	public void myinfo()
	{
		My_Info tab = new My_Info(driver);
		tab.click_myinfo();
	}
	
	@Test(priority = 3, description = "To Verify Form should be editable")
	public void edit_btn() throws Exception
	{
		My_Info edit = new My_Info(driver);
		edit.click_edit();
	}
	
	@Test(priority = 4)
	public void pd_form() throws Exception
	{
		My_Info form = new My_Info(driver);
		form.personal_details_form();
	}
	

	}

