package com.qa.Selenium;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Demohtmlunit {

	public static void main(String[] args) {
		
		
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
		driver.get("https://www.google.co.in/");
		System.out.println("The title is:"+ driver.getTitle());
		System.out.println("The current URL is:"+driver.getCurrentUrl());
		
		driver.close();

	}

}
