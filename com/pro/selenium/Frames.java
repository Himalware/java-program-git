package com.pro.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.automationtesting.in/Frames.html";
		driver.get(url);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
									
		driver.switchTo().frame("SingleFrame"); // using name = "SingleFrame"
		
		WebElement frame =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame.sendKeys("Nilavu vidyut");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
