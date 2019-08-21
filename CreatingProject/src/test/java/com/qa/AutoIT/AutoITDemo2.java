package com.qa.AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo2 {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='file']")).click();
		
	Runtime.getRuntime().exec("D:\\AutoIT\\fileupload.exe"+"   "+"D:\\Newfolder\\flower.jpg");
		
		
		
		

	}

}
