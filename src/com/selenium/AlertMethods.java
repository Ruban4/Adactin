package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {
	
	public static void main (String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("accept")).click();
		
		driver.switchTo().alert().accept();	
		
		System.out.println("accepted");
		
		
		driver.findElement(By.id("confirm")).click();
		
		driver.switchTo().alert().dismiss();
		
		System.out.println("Cancelled");
		
		
		
		driver.findElement(By.id("prompt")).click();
		
		Alert prompt = driver.switchTo().alert();
		
		prompt.sendKeys("Ruban");
		
		prompt.accept();
		
		System.out.println("accept");
		
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des= new File("C:\\Users\\Ruban\\Selinium\\Selenium_New\\Screenshot\\alert.png");
		
		FileUtils.copyFile(src, des);
		
	}

}
