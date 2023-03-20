package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Robot {
	
	public static void main (String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropable");
		
		Actions ac= new Actions(driver);
		
		Robot rb = new Robot();
		//Drag and Drop
		WebElement src = driver.findElement(By.id("draggable"));
		
		WebElement des = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(src, des).build().perform(); //for any action need to give build and perform
		
		//ac.clickAndHold(src).moveToElement(des).build().perform(); //other way of code
		
		driver.navigate().to("https://www.amazon.in/");
		
		//Move to element
		
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		
			ac.moveToElement(prime).perform();
			
			WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
			
			ac.contextClick(mobiles).perform();
			
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN); //whenever we press the key need to release
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			
			
	}

}
