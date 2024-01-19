package com.java.selenium.automation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.java.selenium.automation.actions.ActionEngine;

public class GmailTest extends ActionEngine {
	
	@Test
	public void verifyLinkLearnMoreAboutUsingGuestMode() throws Throwable {
		 click(By.linkText("Sign in"));
		 type(By.id("identifierId"), "my email id");
	}
	
	@Test
	public void verifyLinkLearnMoreAboutUsingGuestMode2() throws Throwable {
		 click(By.linkText("Sign in"));
		 type(By.id("identifierId"), "my email id");
	}

}
