package com.java.selenium.automation.pages;

import org.openqa.selenium.By;

import com.java.selenium.automation.actions.ActionEngine;

public class TextBoxPage extends ActionEngine {
	private By fullNameText = By.id("userName");
	
	
	
	public void submitForm() throws Throwable{
		type(fullNameText, "Zelalem", "Full Name");
	}

}
