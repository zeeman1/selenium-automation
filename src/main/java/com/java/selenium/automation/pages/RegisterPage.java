package com.java.selenium.automation.pages;

import org.openqa.selenium.By;

import com.java.selenium.automation.actions.ActionEngine;

public class RegisterPage extends ActionEngine {
	private By newUserButton = By.id("newUser");
	private By firstNameText = By.id("firstname");
	private By lastNameText = By.id("lastname");
	private By userNameText = By.id("userName");
	private By passwordText = By.id("password");
	private By recaptchID = By.id("recaptcha-anchor");
	private By registerButton = By.id("register");
	
	public void registerUser() throws Throwable{
		scrollPage(100);
		click(newUserButton);
		scrollPage(100);
		type(firstNameText, "Nahom");
		type(lastNameText, "Tegegn");
		type(userNameText, "Nahom1");
		type(passwordText, "Nahom@2024");
		scrollPage(120);
		switchToFrame("a-azpax2w7fxdj");
		jsClick(recaptchID);
		Thread.sleep(5000);
		click(registerButton);
	}

}
