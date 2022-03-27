package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions obj = new Actions(driver);
		
		WebElement r = driver.findElement(By.xpath("//h2 [. ='Gifts you can always rely on | From local shops']"));
		
		obj.moveToElement(r).build().perform();
		
		
}
}
