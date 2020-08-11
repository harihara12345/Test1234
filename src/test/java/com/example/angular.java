package com.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class angular {
	
	
	public static NgWebDriver ngDriver;
	
	@Test
	public void Angular() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HARIHARAVIGNESHM\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://juliemr.github.io/protractor-demo/");
		ngDriver = new NgWebDriver((JavascriptExecutor) driver);
		ngDriver.waitForAngularRequestsToFinish();
		driver.findElement(ByAngular.model("first")).sendKeys("2");
		driver.findElement(ByAngular.model("second")).sendKeys("2");
		driver.findElement(ByAngular.buttonText("Go!")).click();
	}

}
