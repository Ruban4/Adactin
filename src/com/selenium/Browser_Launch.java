package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver(); //class (ref name) =new class name //need to import both class
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		String Curl = driver.getCurrentUrl();// return type (ctrl2L) of driver.getCurrentUrl();
		
		System.out.println(Curl);
		
		Thread.sleep(3000); //throws exception
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//String pageSource = driver.getPageSource();
		
		//System.out.println(pageSource);
		
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
