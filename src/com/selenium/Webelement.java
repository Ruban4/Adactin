package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement (By.xpath("//input[@name='email']"));
		
		email.sendKeys("a@gmail.com");
		
        WebElement password = driver.findElement (By.id("pass"));
		
		password.sendKeys("1234");
		
		System.out.println(password.isDisplayed()); //to check whether it's visible
		System.out.println(password.isEnabled());  //to check whether it's editable
		password.clear(); //to clear the date
		  WebElement login = driver.findElement (By.name("login"));
		  
			
			login.click();
	}

}
