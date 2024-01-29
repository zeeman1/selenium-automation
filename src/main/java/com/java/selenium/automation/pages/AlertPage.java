package com.java.selenium.automation.pages;

import org.openqa.selenium.By;

import com.java.selenium.automation.actions.ActionEngine;

public class AlertPage extends ActionEngine {
	private By alertButon = By.id("confirmButton");
	
	public void acceptAlertBox() throws Throwable{
		Thread.sleep(3000);
		scrollPage(200);
		click(alertButon, "Click Me Button");
		acceptAlert();
	}
     public void dissmisAletbox() throws Throwable{
    	 
    	Thread.sleep(3000);
 		scrollPage(200);
 		click(alertButon, "Click Me Button");
 		Thread.sleep(1000);
 		dissmisAlert();

     }
}
     
     
