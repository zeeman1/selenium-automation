package com.java.selenium.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.java.selenium.automation.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class ActionEngine extends TestBase {
	
	private WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void click(By locator, String fieldName) throws Throwable {
		boolean flag = false;
		try {
			WebElement we =getWebElement(locator);
			we.click();
			flag = true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				extentTest.log(LogStatus.PASS, "Succefully clicked on the field '"+fieldName+"'");
			}else {
				extentTest.log(LogStatus.FAIL, "Failed to click on the field '"+fieldName+"'");
			}
		}
	}
	
	public void jsClick(By locator) throws Throwable{
		WebElement we =getWebElement(locator);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", we);
	}
	
	public void switchToFrame(String iFrameID) throws Throwable{
		driver.switchTo().frame(1);
	}
	
	public void type(By locator, String data, String fieldName) throws Throwable {
		boolean flag = false;
		try {
			WebElement we =getWebElement(locator);
			we.sendKeys(data);
			flag = true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				extentTest.log(LogStatus.PASS, "The data '"+data+"' is succefully entered into the field '"+fieldName+"'");
			}else {
				extentTest.log(LogStatus.FAIL, "It is failed to enter the data '"+data+"' into the field '"+fieldName+"'");
			}
		}
	}
	
	public void scrollPage(int scrollPixs) throws Throwable{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, "+scrollPixs+")");
	}
	public String getText(By locator) {
		return getWebElement(locator).getText();
	}
	
}
