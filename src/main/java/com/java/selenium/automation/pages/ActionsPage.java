package com.java.selenium.automation.pages;

import org.openqa.selenium.By;

import com.java.selenium.automation.actions.ActionEngine;

public class ActionsPage extends ActionEngine {
	
	private By rightClickButton = By.id("rightClickBtn");
	private By doubleClickButton = By.id("doubleClickBtn");	
	
	public void perfRightClick() throws Throwable{
		rightClickAction(rightClickButton, "Right Click Action Button");
	}
	
	public void perfDoubleClick() throws Throwable{
		doubleClickAction(doubleClickButton, "Double Click Action Button");
		
	}
	
}
