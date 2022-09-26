package com.pro.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandling {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String k = "https://www.flipkart.com/";
		driver.get(k);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		WebElement logbtn = driver.findElement(By.xpath("//button[text()='✕']"));
		logbtn.click();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Apple Mobile");
		
		WebElement search1 = driver.findElement(By.xpath("//button[@type='submit']"));
		search1.click();
		
		Thread.sleep(2000);
		
		WebElement phone = driver.findElement(By.xpath("(//div[contains(@class,'rR')])[1]"));
		phone.click();
		
		String pWin = driver.getWindowHandle();
		Set <String> allWin = driver.getWindowHandles();
		
		for(String x : allWin) {
			
			if(!x.equals(pWin)) {
				
				driver.switchTo().window(x);
					
			}
			
		}
		
		WebElement next = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		next.click();	
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}

}
