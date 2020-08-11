package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GoogleIELogin {
	@Test
	public void Amazon() throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\HARIHARAVIGNESHM\\Downloads\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		
		Thread.sleep(3000);
	}

}
