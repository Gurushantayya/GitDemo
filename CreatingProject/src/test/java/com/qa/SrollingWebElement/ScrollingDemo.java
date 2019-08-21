package com.qa.SrollingWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScrollingDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		
	//	WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		
		//	js.executeScript("arguments[0].scrollIntoView()",flag);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}

}
