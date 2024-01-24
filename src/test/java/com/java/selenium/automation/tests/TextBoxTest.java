package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.pages.TextBoxPage;

public class TextBoxTest extends ActionEngine {
	TextBoxPage textBoxPage = new TextBoxPage();

	@Test
	public void submitFormTest() throws Throwable{
		extentTest = extentReports.startTest("Sunmit Form Test Case", "Sunmit Form Test Case Desc");
		textBoxPage.submitForm();
	}
	
	@Test
	public void submitFormTest2() throws Throwable{
		extentTest = extentReports.startTest("Sunmit Form Test Case2", "Sunmit Form Test Case Desc");
		textBoxPage.submitForm();
	}
}
