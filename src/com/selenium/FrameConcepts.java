package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcepts {
	
	public static void main (String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://letcode.in/frame");
		
	//main page to frame
	
		driver.switchTo().frame("firstFr");
		//driver.switchTo().frame(1);
		//WebElement outerframe = driver.findElement(By.id("firstFr"));
		
		//driver.switchTo().frame(outerframe);
		
		driver.findElement(By.name("fname")).sendKeys("Ruban");
		
		driver.findElement(By.name("lname")).sendKeys("123");
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']")); //
		
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.name("email")).sendKeys("r@123.com");
		
		//driver.switchTo().parentFrame(); //to come from inner to outer frame
		
		driver.switchTo().defaultContent(); //to come from outer frame to main page
		
		
	}
	

}
