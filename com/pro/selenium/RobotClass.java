package com.pro.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String k = "https://www.facebook.com/";
		driver.get(k);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Nilavu");
		
		Actions a = new Actions (driver);
		a.doubleClick(username).contextClick().build().perform();
		
		Robot r = new Robot();
		
		for (int i = 0; i<2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	WebElement passname = driver.findElement(By.name("pass"));
	String txt = passname.getAttribute("value");
	System.out.println(txt);
	
	Thread.sleep(2000);
	
	driver.quit();
		
	}

}
