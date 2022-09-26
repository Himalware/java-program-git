package com.pro.selenium;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String k = "https://www.instagram.com/";
		driver.get(k);
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String title = driver.getTitle();
		
		File target = new File("C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\screenshots\\"+title+".png");
	
	FileUtils.copyFile(source, target);
	
	Thread.sleep(2000);
	
	driver.quit();
	
	}
	
}
