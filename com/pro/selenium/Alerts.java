package com.pro.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.automationtesting.in/Alerts.html";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement find = driver.findElement(By.xpath("//button[@onclick = 'alertbox()']"));
		find.click();
		
		// switch to Alert
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		Thread.sleep(3000);
		
		WebElement okcan = driver.findElement(By.xpath("//a[text()= 'Alert with OK & Cancel ']"));
		okcan.click();
		
		WebElement okcan1 = driver.findElement(By.xpath("//button[@onclick = 'confirmbox()']"));
		okcan1.click();
		
		al.dismiss();
		
		WebElement cancel = driver.findElement(By.id("demo"));
		String k = cancel.getText();
		if(k.contains("Cancel")) {
			
			System.out.println("Matched");
		}
		
		Thread.sleep(3000);
		WebElement textbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		textbox.click();
		WebElement textbox1 = driver.findElement(By.xpath("//button[@onclick = 'promptbox()']"));
		textbox1.click();
		
		Alert ale = driver.switchTo().alert();
		ale.sendKeys("Nilavu");
		ale.accept();
		
		WebElement textbox2 = driver.findElement(By.id("demo1"));
		String kl = textbox2.getText();
		System.out.println(kl);
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
