package com.java.selenium.automation.actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
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
	
	public void acceptAlert() throws Throwable {
		boolean flag = false;

		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				extentTest.log(LogStatus.PASS, "Succefully clicked on OK/Accept button");
			} else {
				extentTest.log(LogStatus.FAIL, "Failed to click on OK/Accept button");
			}
		}
	}
	
	public void dissmisAlert() throws Throwable {
		boolean flag = false;

		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.dismiss();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				extentTest.log(LogStatus.PASS, "Succefully clicked on Dissmis/Cancell button");
			} else {
				extentTest.log(LogStatus.FAIL, "Failed to click on Dissmis/Cancell button");
			}
		}
	}
	
	public void handleAlertTextBox(String message) throws Throwable {
		boolean flag = false;

		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.sendKeys(message);
			Thread.sleep(2000);
			alert.accept();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				extentTest.log(LogStatus.PASS, "Succefully clicked on Dissmis/Cancell button");
			} else {
				extentTest.log(LogStatus.FAIL, "Failed to click on Dissmis/Cancell button");
			}
		}
	}
	
	public void selectByVisibleText(By locator, String visibleText, String locatorName) throws Throwable{
		boolean flag = false;
		
		try {
			WebElement we = getWebElement(locator);
			Select dropDown = new Select(we);
			dropDown.selectByVisibleText(visibleText);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				extentTest.log(LogStatus.PASS, "Successfully selected the value '"+visibleText+"' from the dropdown '"+locatorName+"'");
			}else {
				extentTest.log(LogStatus.FAIL, "Failed to select the value '"+visibleText+"' from the dropdown '"+locatorName+"'");
			}
		}
	}
	
	public void selectByValue(By locator, String value, String locatorName) throws Throwable{
		boolean flag = false;
		
		try {
			WebElement we = getWebElement(locator);
			Select dropDown = new Select(we);
			dropDown.selectByValue(value);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				extentTest.log(LogStatus.PASS, "Successfully selected the value '"+value+"' from the dropdown '"+locatorName+"'");
			}else {
				extentTest.log(LogStatus.FAIL, "Failed to select the value '"+value+"' from the dropdown '"+locatorName+"'");
			}
		}
	}
	
	public void selectByIndex(By locator, int index, String locatorName) throws Throwable{
		boolean flag = false;
		
		try {
			WebElement we = getWebElement(locator);
			Select dropDown = new Select(we);
			dropDown.selectByIndex(index);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				extentTest.log(LogStatus.PASS, "Successfully selected the value '"+index+"' from the dropdown '"+locatorName+"'");
			}else {
				extentTest.log(LogStatus.FAIL, "Failed to select the value '"+index+"' from the dropdown '"+locatorName+"'");
			}
		}
	}
	
	public void waitForElement(By locator, int withTime, String locatorName) throws Throwable{
		boolean flag = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, withTime);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				
			}else {
				
			}
		}
	}
	
	
	public void fluentWaitForElement(By locator, int withTime, int pollingTime, String locatorName) throws Throwable{
		boolean flag = false;
		try {
			Wait<WebDriver> wait = new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(withTime))
					.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(WebDriverException.class);
			wait.until(new Function<WebDriver, WebElement>(){
				public WebElement apply(WebDriver driver) {
					return getWebElement(locator);
				}
			});
			flag = true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(flag) {
				
			}else {
				
			}
		}
	}
	
	
	
}
