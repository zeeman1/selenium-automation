package com.java.selenium.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NofRowsColmns2 {

	public static void main(String[] args) throws Exception {
		WebDriver wd;
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 wd.get("https://demo.guru99.com/test/web-table-element.php"); 
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List <WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List <WebElement> rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr"));
	        System.out.println("Total No of rows are : " + rows.size());
	        for (int row =1;row<rows.size();row++)
	        {    
	    	    //To locate columns(cells) of that specific row.
	    	    List < WebElement > Columns_row = rows.get(row).findElements(By.tagName("td"));
	    	    //To calculate no of columns (cells). In that specific row.
	    	    int columns_count = Columns_row.size();
	    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
	    	    //Loop will execute till the last cell of that specific row.
	    	    for (int column = 0; column < columns_count; column++) {
	    	        // To retrieve text from that specific cell.
	    	        String celtext = Columns_row.get(column).getText();
	    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	    	    }
	    	    System.out.println("-------------------------------------------------- ");
	        }
	        System.out.println("Maximum current price is : "+ r);
   }

}
