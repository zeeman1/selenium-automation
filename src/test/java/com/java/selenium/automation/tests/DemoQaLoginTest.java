package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.pages.DemoQaLoginPage;

public class DemoQaLoginTest extends ActionEngine {
	DemoQaLoginPage demoQaLoginPage = new DemoQaLoginPage();
	
	@Test
	public void verifyGmailLogin() throws Throwable {
		demoQaLoginPage.loginIntoDemoQA();
	}
	
}
