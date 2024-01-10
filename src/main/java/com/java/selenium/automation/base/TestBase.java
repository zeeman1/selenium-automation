package com.java.selenium.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.java.selenium.automation.utilities.LoadProps;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(LoadProps.getData("url"));
		
		WebElement searchBar = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBar.sendKeys("Zelalem");
		searchBar.sendKeys(Keys.ENTER);
		
		
		//driver.close();
	}

}
