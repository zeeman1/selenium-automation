package com.java.selenium.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.java.selenium.automation.utilities.LoadProps;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver = null;;
	
	@Parameters({"browser"})
	@BeforeMethod
	public static void setup(String browserType) throws Throwable{
		
		System.out.println("Browser name from testNg.xml file: "+browserType);
		
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
			throw new Exception("Browser type is not valid, please pass chrome, edge or ie!");
		}
		
		driver.manage().window().maximize();
		driver.get(LoadProps.getData("url"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}