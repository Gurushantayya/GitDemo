package com.qa.Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","F:\\jars\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Set <Cookie> cookies=driver.manage().getCookies();
		
			System.out.println("Size of cookie is:"	+cookies.size());
			
			for(Cookie cookie:cookies)
			{
				System.out.println(cookie.getName()+" : "+cookie.getValue());
			}
		
			
			 Cookie cookieobj=new Cookie("MyCookie123","12345");
			  driver.manage().addCookie(cookieobj);
			cookies= driver.manage().getCookies();
			
			  System.out.println("Size of cookie is:"	+cookies.size());
				
				for(Cookie cookie:cookies)
				{
					System.out.println(cookie.getName()+" : "+cookie.getValue());
				}
				
				driver.manage().deleteCookie(cookieobj);
				cookies=driver.manage().getCookies();
				 System.out.println("Size of cookie is:"	+cookies.size());
				
				 for(Cookie cookie:cookies)
					{
						System.out.println(cookie.getName()+" : "+cookie.getValue());
					}
		driver.close();
		
		

	}

}
