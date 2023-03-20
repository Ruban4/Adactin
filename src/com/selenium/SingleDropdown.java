package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();
	    Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Ruban");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Ruban");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("ab@gmail.com");
		
		WebElement confirmation = driver.findElement(By.name("reg_email_confirmation__"));
		confirmation.sendKeys("ab@gmail.com");		
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("1234");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByValue("5");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByVisibleText("2015");
	
	WebElement Gender = driver.findElement(By.xpath("//label[text()='Male']"));
	Gender.click();
	}
	
}
