package com.java.selenium.automation.pages;

import org.openqa.selenium.By;

import com.java.selenium.automation.actions.ActionEngine;

public class AlertPage extends ActionEngine {
	private By alertButon = By.id("confirmButton");
	private By promtButton = By.id("promtButton");
	
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
     
     public void handleAlertText() throws Throwable{
    	Thread.sleep(3000);
  		scrollPage(200);
    	click(promtButton, "Promt Button to enter Some Text");
    	handleAlertTextBox("Good Morning NaHom!");
     }
     
}
     
     
