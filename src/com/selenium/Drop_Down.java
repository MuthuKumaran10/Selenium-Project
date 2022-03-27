package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ironspider.ca/forms/dropdowns.htm");
		
		driver.manage().window().maximize();
		
		Select Coffee = new Select(driver.findElement(By.name("coffee2")));
		
		System.out.println("*** Use to getAllSelectedOptions***");
		
		boolean multiple = Coffee.isMultiple();
		
		System.out.println(multiple);
		
		Coffee.selectByValue("skim");
		
		Coffee.selectByValue("milk2");
		
		Coffee.selectByValue("cream");
		
		List<WebElement> Select = Coffee.getAllSelectedOptions();
		
		for (WebElement webElement : Select) {
			
			System.out.println(webElement.getText());
			
		}
		
		System.out.println("**** Use to getOptions****");
		
		List<WebElement> all = Coffee.getOptions();
		
		for (WebElement webElement1 : all) {
			
			System.out.println(webElement1.getText());
			
		}
		
		System.out.println("*** Use to getFirstSelectedOptions***");
		
		WebElement firstSelectedOption = Coffee.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());
		
		
}

}
