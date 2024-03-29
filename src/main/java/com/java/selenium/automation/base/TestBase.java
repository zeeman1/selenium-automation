package com.java.selenium.automation.base;

import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.java.selenium.automation.utilities.LoadProps;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver = null;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public String reportFilePath;
	String startDate = "";
	
	
	@BeforeSuite
	public void beforeAll() throws Throwable{
		SimpleDateFormat sdf = new SimpleDateFormat("MMM_dd_yyyy_z_HH_mm_ss");
		startDate = sdf.format(new Date());
		reportFilePath = System.getProperty("user.dir")+File.separator+"Reports"+File.separator+"reports_"+startDate+".html";
		extentReports = new ExtentReports(reportFilePath);	
		
		System.out.println("reportFilePath : "+reportFilePath);
	}
	
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(LoadProps.getData("url"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		extentReports.flush();
	}
	
	@AfterSuite
	public void suiteClose() throws Throwable {
		try {
			File file = new File(reportFilePath);
			Desktop desktop = Desktop.getDesktop();
			desktop.browse(file.toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}