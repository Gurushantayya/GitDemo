package com.BankingApplication.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfg {

	Properties pro;
	
	public ReadConfg()
	{
		File src=new File("./Configuration/config.Properties");
		
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
		}
	
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("url");
		return url;
	}
	public String getusername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String chromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String firefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	
}
