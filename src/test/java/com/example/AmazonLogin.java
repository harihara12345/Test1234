package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;




public class AmazonLogin {

	@Test
	public void Amazon() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARIHARAVIGNESHM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9790797740");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Wewant1!");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(3000);
	}

}
