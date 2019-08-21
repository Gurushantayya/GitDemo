package com.qa.Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("--headless");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.co.in");
		System.out.println("The title is :"+ driver.getTitle());
		
		driver.close();
		

	}

}
