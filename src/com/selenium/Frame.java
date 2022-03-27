package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();

		int size = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Navin");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()= 'Iframe with in an Iframe']")).click();
		
		driver.findElement(By.xpath("//div[@class= 'row'] [1]"));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[type= 'text'] [1]")).sendKeys("Navin");
		
		
		
		
		
		
		
		
		
}		
}
