package com.java.selenium.automation.pages;

import org.openqa.selenium.By;

import com.java.selenium.automation.actions.ActionEngine;

public class WindowHandlePage extends ActionEngine {
	private By tabButton = By.id("tabButton");
	private By sampleHeading = By.id("sampleHeading");
	private String sampleHeadingText = "This is a sample page";
	
	public void switchToWindow() throws Throwable{
		click(tabButton, "New Button");
		handleWithBrowserWindows(1);
		String headingText = getWebElement(sampleHeading).getText();
		if(headingText.equals(sampleHeadingText)) {
			System.out.println("Success");
		}else {
			throw new Exception("Validation failed!!");
		}
		
	}

}
