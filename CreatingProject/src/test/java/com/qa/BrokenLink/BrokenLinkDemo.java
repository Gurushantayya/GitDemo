package com.qa.BrokenLink;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		List <WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++)
			{
				WebElement element=links.get(i);
				
				 String url=element.getAttribute("href");
				 
				 URL u= new URL(url);
				 
				 HttpURLConnection httpcon=(HttpURLConnection) u.openConnection();
				 
				Thread.sleep(2000);
				 httpcon.connect();
				 
				 int rescode =httpcon.getResponseCode();
				 
				 
				 if(rescode>=400)
				 {
					 System.out.println(url+"      "+ "Its is broken link");
					 
				 }
				 else
				 {
					 System.out.println(url+"          "+ "it is not broken link");
				 }
	}
		
		
		
		
		
		
		
		

	}

}
