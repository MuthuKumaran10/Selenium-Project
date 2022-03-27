package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New_Account {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		WebElement Create = driver.findElement(By.xpath("//a[text()= 'Create New Account']"));
		
		Create.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Navin");
		
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		
		driver.findElement(By.name("reg_email__")).sendKeys("navin@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("navin@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Dwdn@9043");
		
		Select day = new Select(driver.findElement(By.id("day")));
		
		day.selectByValue("4");
		
		Select month = new Select(driver.findElement(By.id("month")));
		
		month.selectByValue("11");
		
		Select year = new Select(driver.findElement(By.id("year")));
		
		year.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("websubmit")).click();
				
	
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Pic\\Creation.png");
		FileUtils.copyFile(src, dest);
		
		

}		
}
