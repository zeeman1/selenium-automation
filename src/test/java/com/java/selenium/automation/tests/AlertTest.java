package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.pages.AlertPage;

public class AlertTest extends ActionEngine {
	AlertPage alertPage = new AlertPage();
	
	//@Test
	public void alertAcceptTest() throws Throwable{
		extentTest = extentReports.startTest("Alert Test Case", "Alert Test Desc");
		alertPage.acceptAlertBox();
	}
	
	//@Test
	public void alertDismissTest() throws Throwable{
		extentTest = extentReports.startTest("Alert Test Case to Dismiss", "Alert Test Dismiss Desc");
		alertPage.dissmisAletbox();
	}
	
	@Test
	public void alertSendKeyssTest() throws Throwable{
		extentTest = extentReports.startTest("Alert Test Case to use send Keys ", "Alert Test send Keys Desc");
		alertPage.handleAlertText();
	}

}
