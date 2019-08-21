package com.qa.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		WebElement ele =driver.findElement(By.tagName("span"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).dragAndDropBy(ele, 300,0).build().perform();
		
		
		

	}

}