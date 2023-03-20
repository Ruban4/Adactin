package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ruban\\Selinium\\Selenium_New\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement multiple = driver.findElement(By.id("superheros"));
		
		Select s =new Select(multiple);
		
		s.selectByValue("aq");
		s.selectByValue("ta");
		s.selectByVisibleText("Batman");
		
		s.deselectByValue("ta");
		
		//get options
		//to print all options
		List<WebElement> options = s.getOptions(); 
		for (WebElement allOptions : options) {  //foreach concept to get all the text
			System.out.println(allOptions.getText()); //to get all the options in text, we use getText
		}
			System.out.println();
			System.out.println("---All Selected Options---");
			
			//to print selected options
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions(); 
			for (WebElement selectedOptions : allSelectedOptions) {
				System.out.println(selectedOptions.getText());
			}
		System.out.println();
		System.out.println("---First Selected Options---");
			//to print first selected options
			
		WebElement firstSelectedOption = s.getFirstSelectedOption();	
		System.out.println(firstSelectedOption.getText());
		
		//deselectAll
		
		s.deselectAll();
		
		}
		
	}


