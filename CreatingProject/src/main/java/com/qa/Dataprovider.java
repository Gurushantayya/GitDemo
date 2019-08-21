package com.qa;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider="getdata")
	public void logintest(String uid, String passwrd)
	{
		System.out.println("first "+uid);
		System.out.println("second"+passwrd);
	}
	
	@DataProvider(name="getdata")
	public Object[][] getdata()
			{
		Object[][] data = new Object[2][2];
		
		
	data[0][0]="uid";
	data[0][1]="passwrd";
	
	data[1][0]="uid";
	data[1][1]="passwrd;";
	
	return data;
	
			}	
}
