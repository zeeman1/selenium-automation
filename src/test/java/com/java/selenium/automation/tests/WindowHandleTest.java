package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.pages.WindowHandlePage;

public class WindowHandleTest extends ActionEngine {
	WindowHandlePage windowHandlePage = new WindowHandlePage();
	
	@Test
	public void navigateToWindowtest() throws Throwable{
		extentTest = extentReports.startTest("Navigate To Window Test", "Navigate To Window Test Desc");
		windowHandlePage.switchToWindow();
	}
}
