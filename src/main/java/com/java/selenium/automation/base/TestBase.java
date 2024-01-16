package com.java.selenium.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.java.selenium.automation.utilities.LoadProps;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver = null;;
	
	public static void main(String[] args) throws Throwable{
		
		
		setup("ite");
		
	//	WebElement searchBar = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		//searchBar.sendKeys("Zelalem");
		//searchBar.sendKeys(Keys.ENTER);
		
		
		 WebElement we = driver.findElement(By.linkText("Gmail"));
		 we.click();
		 
		 WebElement we1 = driver.findElement(By.linkText("Sign in"));
		 we1.click();
		 
		 WebElement we2 = driver.findElement(By.partialLinkText("Learn more about using Guest mode"));
		 we2.click();
		
		//label[text()='Name']/parent::div/following-sibling::div[1]/input
		//label[text()='Name']/parent::div/following-sibling::div[3]/input
		
		//driver.close();
	}
	
	public static void setup(String browserType) throws Throwable{
		
		if(browserType.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserType.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browserType.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}else {
			throw new Exception("Browser type is not vlaid, please pass chrome, edge or ie!");
		}
		
		driver.manage().window().maximize();
		driver.get(LoadProps.getData("url"));
		
	}

}
