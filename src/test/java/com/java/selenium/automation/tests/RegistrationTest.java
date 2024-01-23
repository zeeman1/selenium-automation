package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.pages.RegisterPage;

public class RegistrationTest extends ActionEngine {
	RegisterPage registerPage = new RegisterPage();
	
	@Test
	public void registerUser() throws Throwable{
		registerPage.registerUser();
	}

}
