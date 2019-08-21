package com.BankingApplication.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BankingApplication.PageObjects.LoginPage;

public class TC_Login_001 {

	
	public String url="http://demo.guru99.com/V4/";
	public String username="mngr205036";
	public String  password="zYqAdet";
	public static WebDriver driver;
	
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			}

	public void loginTest()
	{
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
	   lp.setUserName(username);
	   lp.setpassword(password);
	   lp.ClickSubmit();
	   
	   
	   if(driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
	   {
	//	   Assert.assertTrue(true);
	   }
	   else
	   {
	//	   Assert.assertFalse(false);
	   }
	  
	   }
	 
	   public void tearDown()
	   {
		   driver.quit();
				
	}
	
}
