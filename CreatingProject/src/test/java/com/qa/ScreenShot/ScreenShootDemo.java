package com.qa.ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class ScreenShootDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Shutterbug.shootPage(driver).save();

	}

}
