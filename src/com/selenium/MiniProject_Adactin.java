package com.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject_Adactin {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\Selenium6AM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Navinkaran");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("Messi@@10");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s1 = new Select(loc);
		s1.selectByValue("Brisbane");
		
		WebElement hot = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hot);
		s2.selectByValue("Hotel Hervey");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByValue("Deluxe");
		
		WebElement nos = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(nos);
		s4.selectByValue("1");
		
		WebElement datepick = driver.findElement(By.id("datepick_in"));
		datepick.sendKeys("26/02/2022");
		
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("27/02/2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adult);
		s5.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByValue("0");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys("Muthu");
		
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys("Kumaran");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Chennai 600056");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("1234567895678979");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(cctype);
		s7.selectByValue("AMEX");

		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(expmonth);
		s8.selectByValue("11");
		
		WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(expyr);
		s9.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Muthu\\eclipse-workspace\\Selenium\\Pic\\Hotel.png");
		FileUtils.copyFile(src, dest);
		

}

}
