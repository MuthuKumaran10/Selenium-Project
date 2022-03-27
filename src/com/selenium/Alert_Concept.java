package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertButton")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirmButton")).click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().sendKeys("Navin");
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
}
}
