package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingdriver {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://google.com");
         System.out.println(driver.getTitle());
         driver.close();
  }

	}


