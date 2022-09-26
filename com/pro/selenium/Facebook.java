package com.pro.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main (String[] args ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String k = "https://www.facebook.com/";
		driver.get(k);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Nilavu");
		
		WebElement passname = driver.findElement(By.name("pass"));
		passname.sendKeys("vidyut");
		
		Thread.sleep(3000);
		
		WebElement logbtn = driver.findElement(By.name("login"));
		logbtn.click();
		
		driver.quit();
		
	}

}
