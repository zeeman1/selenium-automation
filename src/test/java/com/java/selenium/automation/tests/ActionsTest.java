package com.java.selenium.automation.tests;

import org.testng.annotations.Test;

import com.java.selenium.automation.actions.ActionEngine;
import com.java.selenium.automation.pages.ActionsPage;

public class ActionsTest extends ActionEngine {
	ActionsPage actionsPage = new ActionsPage();
	
	//@Test
	public void rightClickTest() throws Throwable {
		actionsPage.perfRightClick();
		
	}
	
	@Test
	public void doubleClickTest() throws Throwable {
		actionsPage.perfDoubleClick();
		
	}
}
