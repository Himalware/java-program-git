package com.pro.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/test/drag_drop.html";
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(source, target).perform();
		
		
		WebElement s1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement t1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(s1, t1).perform();
		
		
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(source1, target1).perform();
		
		
		WebElement source2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(source2, target2).perform();
		
		WebElement text = driver.findElement(By.xpath("//a[text()='Perfect!']"));
        String t = text.getText();
        System.out.println(t);
        
        if(t.equals(text)) {
        	System.out.println("Text matches");
        	
        }else {
        	
        	System.out.println("Text Not matches");
        }
		
		Thread.sleep(4000);
		
		
	driver.quit();
	
		
	}

}
