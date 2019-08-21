package com.qa.Actions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


public class BrowserDownloadfileDemo {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver","F:\\jars\\geckodriver.exe");
		
		
		FirefoxProfile profile= new FirefoxProfile(); 
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");
		profile.setPreference("browser.download.manager.showwhenStrating",false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(option);
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("textbox")).sendKeys("hai hello well to automation world");
		
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		
		
				
		
		
		

	}

}
