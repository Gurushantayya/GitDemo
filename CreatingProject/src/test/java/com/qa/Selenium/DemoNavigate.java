package com.qa.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNavigate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println("The title is :"+ driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("The title is:"+ driver.getTitle());
		
		driver.navigate().back();
		System.out.println("The title is:"+ driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("The title is:"+ driver.getTitle());
		
	
		driver.close();

	}

}
