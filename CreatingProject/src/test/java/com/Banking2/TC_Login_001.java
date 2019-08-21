package com.Banking2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking1.LoginPage;



public class TC_Login_001 extends BaseClass {
		
	
	@Test
	public void loginTest()
	{
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
	   lp.setUserName(username);
	   lp.setpassword(password);
	   lp.clickSubmit();
	   
	   
	   if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	   {
	   Assert.assertTrue(true);
	   }
	   else
	   {
	  Assert.assertFalse(false);
	   }
	  
	   }

	
}
