package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adaction {

		public static void main (String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://adactinhotelapp.com/");
			
			WebElement user = driver.findElement(By.id("username"));
			
			user.sendKeys("Ruban123");
			
			WebElement pass = driver.findElement(By.name("password"));
			
			pass.sendKeys("Rock@4561");
			
			driver.findElement(By.id("login")).click();
			
			WebElement location = driver.findElement(By.id("location"));
			
			Select s=new Select(location);
			
			s.selectByIndex(1);
			
			WebElement hotel = driver.findElement(By.id("hotels"));
			
			Select s1= new Select(hotel);
			
			s1.selectByValue("Hotel Sunshine");
			
			WebElement room = driver.findElement(By.id("room_type"));
			
			Select s2 =new Select(room);
			
			s2.selectByVisibleText("Double");
			
			WebElement rooms = driver.findElement(By.id("room_nos"));
			
			Select s3=new Select(rooms);
			
			s3.selectByValue("3");
			
			WebElement in = driver.findElement(By.id("datepick_in"));
			
			in.clear();
			
			in.sendKeys("28/12/2022");
			
			WebElement out = driver.findElement(By.id("datepick_out"));
			
			out.clear();
			
			out.sendKeys("30/12/2022");
			
			WebElement adult = driver.findElement(By.id("adult_room"));
			
			Select s4=new Select(adult);
			
			s4.selectByIndex(2);
			
			WebElement child = driver.findElement(By.id("child_room"));
			
			Select s5=new Select(child);
			
			s5.selectByValue("2");
			
			driver.findElement(By.id("Submit")).click();
			
			driver.findElement(By.name("radiobutton_0")).click();
			
			driver.findElement(By.id("continue")).click();
			
			WebElement fname = driver.findElement(By.id("first_name"));
			
			fname.sendKeys("Ruban");
			
			WebElement lname = driver.findElement(By.id("last_name"));
			
			lname.sendKeys("123");
			
			WebElement address = driver.findElement(By.id("address"));
			
			address.sendKeys("No, 123");
			
			WebElement card = driver.findElement(By.id("cc_num"));
			
			card.sendKeys("1234567891234567");
			
			WebElement ctype = driver.findElement(By.id("cc_type"));
			
			Select s6=new Select(ctype);
			
			s6.selectByIndex(1);
			
			WebElement exp = driver.findElement(By.name("cc_exp_month"));
			
			Select s7=new Select(exp);
			
			s7.selectByValue("2");
			
			WebElement expyear = driver.findElement(By.id("cc_exp_year"));
			
			Select s8=new Select(expyear);
			
			s8.selectByVisibleText("2022");
			
			WebElement cvv = driver.findElement(By.id("cc_cvv"));
			
			cvv.sendKeys("123");
			
			driver.findElement(By.id("book_now")).click();
		}
		
	}

	

