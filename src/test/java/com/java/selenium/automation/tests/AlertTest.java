package com.java.selenium.automation.tests;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.pages.AlertPage;
import com.java.selenium.automation.utilities.ExcelLib;

public class AlertTest extends ActionEngine {
	AlertPage alertPage = new AlertPage();
	ExcelLib obj = new ExcelLib();
	
	@Test
	public void alertAcceptTest() throws Throwable{
		extentTest = extentReports.startTest("Alert Test Case", "Alert Test Desc");
		Hashtable<String, String> testData = obj.getData("CreateAccount", "RegressionSuite");
		/*
		 * System.out.println(testData); for(String key : testData.keySet()) {
		 * System.out.println("Key: "+key+" Data: "+testData.get(key)); }
		 */
		alertPage.acceptAlertBox();
	}
	
	//@Test
	public void alertDismissTest() throws Throwable{
		extentTest = extentReports.startTest("Alert Test Case to Dismiss", "Alert Test Dismiss Desc");
		alertPage.dissmisAletbox();
	}
	
	//@Test
	public void alertSendKeyssTest() throws Throwable{
		extentTest = extentReports.startTest("Alert Test Case to use send Keys ", "Alert Test send Keys Desc");
		alertPage.handleAlertText();
	}

}
