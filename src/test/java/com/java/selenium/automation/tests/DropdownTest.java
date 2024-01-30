package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.pages.DropdownPage;

public class DropdownTest extends ActionEngine {
	DropdownPage dropdownPage = new DropdownPage();
	
	@Test(priority = 1)
	public void selectByVisibletext() throws Throwable{
		extentTest = extentReports.startTest("Select By Visible Text Script", "Select By Visible Text Desc");
		dropdownPage.selectValueByVisibletext();
	}
	
	@Test(priority = 2)
	public void selectByValue() throws Throwable{
		extentTest = extentReports.startTest("Select By Value Script", "Select By Value Desc");
		dropdownPage.selectByValue();
	}
	
	@Test(priority = 3)
	public void selectByIndex() throws Throwable{
		extentTest = extentReports.startTest("Select By Index Script", "Select By Index Desc");
		dropdownPage.selectByIndex();
	}
}
