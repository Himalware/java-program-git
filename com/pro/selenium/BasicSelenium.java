package com.pro.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {
	
	public static void main (String [] args) throws InterruptedException {
		
		// Driver and Path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivash\\3D Objects\\java\\eclipse-jee-2021-12-R-win32-x86_64\\eclipse\\SimpleProgram\\driver\\chromedriver.exe");

		// Object creation for interface and driver
		
		WebDriver driver = new ChromeDriver();
		
		// launch the browser
		
		String url = "https://www.facebook.com/";
		
		driver.get(url);
		
		// Max the window
		
		driver.manage().window().maximize();
		
		// get the title of the page
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// get the URL of the page
		
		String Curl = driver.getCurrentUrl();
		
		if(url.equals(Curl)) {
			
			System.out.println("PASS");
		}else {
			
			System.out.println("Fail");
			
		}
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
