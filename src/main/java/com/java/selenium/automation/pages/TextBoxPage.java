package com.java.selenium.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.utilities.LoadProps;

public class TextBoxPage extends ActionEngine {
	private By fullNameText = By.id("userName");
	private By Email=By.id("userEmail");
	private By CurrentAddress=By.id("currentAddress");
	private By PermanentAddress=By.id("permanentAddress");
	private By Submit=By.id("submit");
	
	public void submitForm() throws Throwable{

		type(fullNameText, "Zelalem", "Full Name");
		type(Email, LoadProps.getData("Email"), "Email");
		
		type(CurrentAddress, LoadProps.getData("currentadders"), "Current Address");
		 scrollPage(200);
		 Thread.sleep(5000);
		type(PermanentAddress , LoadProps.getData("permantadders"), "Permanent Address");
		scrollPage(200);
		 Thread.sleep(5000);
		click(Submit,"Submit Button");
		//click(logInButton, "Login Button");
	}
	
	public void doCopyPaste() throws Throwable{
		type(fullNameText, "Zelalem", "Full Name");
		type(Email, LoadProps.getData("Email"), "Email");
		
		type(CurrentAddress, LoadProps.getData("currentadders"), "Current Address");
		 scrollPage(200);
		 Thread.sleep(5000);
		 Actions action = new Actions(driver);
		 
		 action.keyDown(Keys.CONTROL);
		 action.sendKeys("a");
		 action.keyUp(Keys.CONTROL);
		 action.build().perform();
		 
		 action.keyDown(Keys.CONTROL);
		 action.sendKeys("c");
		 action.keyUp(Keys.CONTROL);
		 action.build().perform();
		 
		 click(PermanentAddress, "PermanentAddress");
		 
		 action.keyDown(Keys.CONTROL);
		 action.sendKeys("v");
		 action.keyUp(Keys.CONTROL);
		 action.build().perform();
		 
	}

}
