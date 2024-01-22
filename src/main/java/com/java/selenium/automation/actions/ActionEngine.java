package com.java.selenium.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.java.selenium.automation.base.TestBase;

public class ActionEngine extends TestBase {
	
	private WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void click(By locator) throws Throwable {
		try {
			WebElement we =getWebElement(locator);
			we.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void type(By locator, String data) throws Throwable {
		try {
			WebElement we =getWebElement(locator);
			we.sendKeys(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void scrollPage() throws Throwable{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 200)");
	}
	public String getText(By locator) {
		return getWebElement(locator).getText();
	}
}
