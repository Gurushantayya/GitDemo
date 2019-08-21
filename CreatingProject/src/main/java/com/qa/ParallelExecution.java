package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class ParallelExecution{
	
	
	@Test(priority=1)
	public void firefox() {
		System.setProperty("webdriver.gecko.driver","F:\\jars\\geckodriver.exe");
		
     WebDriver driver = new FirefoxDriver();
     driver.get("https://google.com");
     System.out.println(driver.getTitle());
     driver.close();

}
	
	@Test(priority=2)
	public void chrome() {
		System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.get("https://google.com");
         System.out.println(driver.getTitle());
         driver.close();
	}
}