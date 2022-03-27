package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Concept {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(dc).build().perform();
		
		WebElement rc = driver.findElement(By.id("rightClickBtn"));
		
		Actions r = new Actions(driver);
		
		r.contextClick(rc).build().perform();
		
		driver.findElement(By.xpath("(//button[@type= 'button']) [4]")).click();
		
		
		
}
}
