package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main (String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		//To initialize particular (TakeScreenshot) Interface
		
		TakesScreenshot ts = (TakesScreenshot) driver; //narrowing type casting (converting small to large0)
		
		//To call the method for taking screenshot
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//3.path
		
		File des= new File("C:\\Users\\Ruban\\Selinium\\Selenium_New\\Screenshot\\insta.png"); //need to give '\\' then image name (insta) then format (.png)
		
		//4.merge src and des
		
		FileUtils.copyFile(src, des);// to give(srcFile, destFile) // also need to throw exception
		
		
	}

}
