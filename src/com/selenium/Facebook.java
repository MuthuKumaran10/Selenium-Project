package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.id("email"));
		
		mail.sendKeys("imnavin29@gmail.com");
		
		WebElement Password = driver.findElement(By.name("pass"));
		
		Password.sendKeys("12345");
		
		WebElement log = driver.findElement(By.name("login"));
		
		log.click();
		
		
}

}
