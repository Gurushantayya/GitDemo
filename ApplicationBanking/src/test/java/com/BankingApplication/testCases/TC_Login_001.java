package com.BankingApplication.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BankingApplication.PageObject.LoginPage;

public class TC_Login_001 extends BaseClass{
		
	
	@Test
	public void loginTest() throws IOException
	{
		
		
	//	logger.info("url open");
		LoginPage lp=new LoginPage(driver);
	   lp.setUserName(username);
	  // logger.info("Entered user name");
	   lp.setpassword(password);
	  //logger.info("Entered password");
	   lp.clickSubmit();
	  // logger.info("clicked on submit");
	   
	   
	   if(driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
	   {
	   Assert.assertTrue(true);
	 //  logger.info("pass");
	   }
	   else
	   {

	  Assert.assertTrue(false);
	 //s logger.info("fail");
	   }
	  
	   }

	
}
