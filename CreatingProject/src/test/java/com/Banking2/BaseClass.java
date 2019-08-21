package com.Banking2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String url="http://demo.guru99.com/V4/";
	public String username="mngr205036";
	public String  password="zYqAdet";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			}

	 
	@AfterClass
	   public void tearDown()
	   {
		   driver.quit();
				
	}
	
	
	
	
	
	
	
	
	
}
