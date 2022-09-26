package com.pro.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.myntra.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement down = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
		WebElement up = driver.findElement(By.xpath("//input[contains(@placeholder,'S')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",up);
	 
		Thread.sleep(3000);
		driver.quit();
		
	}

}
