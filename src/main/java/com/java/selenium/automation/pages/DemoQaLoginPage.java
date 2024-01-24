package com.java.selenium.automation.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.utilities.LoadProps;

public class DemoQaLoginPage extends ActionEngine {
	private By userNameText  = By.id("userName");
	private  By passwordText = By.id("password");
	private By logInButton = By.id("login");
	private By LoggedinUsed = By.id("userName-value");
	
	public void loginIntoDemoQA() throws Throwable {
		 type(userNameText, LoadProps.getData("loginuser"), "");
		 type(passwordText, LoadProps.getData("loginpassword"), "");
		 scrollPage(200);
		 Thread.sleep(5000);
		 click(logInButton, "Login Button");
		 Thread.sleep(5000);
		 String userName = getText(LoggedinUsed);
		 System.out.println("userName:: "+userName);
		 Assert.assertEquals(userName, LoadProps.getData("loginuser"));
	}
	

}
