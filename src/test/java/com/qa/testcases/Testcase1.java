package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {

	public static WebDriver driver;
	// testNG annotaions to execute our test script
	
	
	// Test methods
	
	@Test(priority='1')
	public void searchPageTest() throws InterruptedException
	{
		// 1step : open chrome browser
		
		driver  = new ChromeDriver();
		
		//2. enter the app URL
		
		driver.get("https://www.wikipedia.org/");
		
		// Enter input on the search box
	// Locators --> address of your element on the web page	
		// find the element on webpage and perform action on the target
	
		// XPATH  ==> //tagname[@attribute='value']  //
		
		//*[@id="searchInput"]
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("seleniumTest");
		
		
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
		
		Thread.sleep(3000);
		
	String title=	driver.getTitle();
	
	System.out.println(title);
	
	driver.findElement(By.linkText("Main page")).click();
		
		
	}
	
	@Test(priority='2')
	public void closebrowser()
	{
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
