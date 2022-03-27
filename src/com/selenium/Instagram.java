package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement User = driver.findElement(By.name("username")); // //input[@text ='text']
		
		User.sendKeys("9940931766");
		
		WebElement Password = driver.findElement(By.name("password"));
		
		Password.sendKeys("DwDn@123");
		
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']")); //div[@text ='Log In']
		
		Login.click();
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
}

}
