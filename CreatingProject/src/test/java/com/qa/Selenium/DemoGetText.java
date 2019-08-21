package com.qa.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGetText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println("The title is :"+ driver.getTitle());
		
		String text=driver.findElement(By.xpath("//span[contains(text(),'India')]")).getText();
		System.out.println(text);
		driver.close();
		


	}

}
