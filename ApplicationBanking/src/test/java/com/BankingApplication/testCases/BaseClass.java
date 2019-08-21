package com.BankingApplication.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.BankingApplication.Utility.ReadConfg;

public class BaseClass {
	
	ReadConfg readconfig=new ReadConfg();
	
	public String url=readconfig.getApplicationURL();
	public String username=readconfig.getusername();
	public String  password=readconfig.getpassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		logger=Logger.getLogger("ApplicationBanking");
		PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.chromepath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.firefoxpath());
			driver=new FirefoxDriver();
			}
		driver.get(url);
			}

	 
	@AfterClass
	   public void tearDown()
	   {
		   driver.quit();
				
	}
	
	
	}
