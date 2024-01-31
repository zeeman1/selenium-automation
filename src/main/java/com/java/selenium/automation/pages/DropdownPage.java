package com.java.selenium.automation.pages;

import org.openqa.selenium.By;

import com.java.selenium.automation.actions.ActionEngine;

public class DropdownPage extends ActionEngine {
	private By  selectMenu = By.id("oldSelectMenu");
	
	public void selectValueByVisibletext() throws Throwable{
		scrollPage(300);
		waitForElement(selectMenu, 10, "Old Style Select Menu");
		selectByVisibleText(selectMenu, "Black", "Old Style Select Menu");
	}
	
	public void selectByValue() throws Throwable{
		scrollPage(300);
		fluentWaitForElement(selectMenu, 20, 1, "Old Style Select Menu");
		selectByValue(selectMenu, "6", "Old Style Select Menu");
	}
	
	public void selectByIndex() throws Throwable{
		scrollPage(300);
		selectByIndex(selectMenu, 9, "Old Style Select Menu");
	}
	

}
