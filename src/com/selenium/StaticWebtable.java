package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtable {

	public static void main (String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/table");
		
		System.out.println("***Selected table***");
		List<WebElement> data = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		for (WebElement all : data) {
			System.out.println(all.getText());
			
		}
		
		System.out.println("***Row data***");
		List<WebElement> rowdata = driver.findElements(By.xpath("(//table)[2]/tbody/tr[3]/td"));
		for (WebElement row : rowdata) {
			System.out.println(row.getText());	
		}
		
		System.out.println("***column data***");
		List<WebElement> columndata = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[1]"));
		for (WebElement column : columndata) {
			System.out.println(column.getText());
		}
		
		System.out.println("***particular data***");
List<WebElement> particulardata = driver.findElements(By.xpath("(//table)[2]/tbody/tr[2]/td[2]"));
		for (WebElement particular : particulardata) {
			System.out.println(particular.getText());
		}
		
	}
	
}
