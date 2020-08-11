package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Stackbrowser {
	
	
	public static final String USERNAME = "koushicksudharsa1";
	  public static final String AUTOMATE_KEY = "6DcAFUH729cyqjG1kohc";
	//Browserstack -->  //"https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  //Local --> //http://192.168.1.100:4444/wd/hub
//	  https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub
	  public static final String URL = "http://192.168.1.117:45272";
	  
	  public static  WebDriver driver;
	  public static void main(String[] args) throws Exception {
		  try
		  {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    
	    //you need to change the capabilites acording to local and Browserstack.
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browser", "Chrome");
//	    caps.setCapability("maxInstances", "5");
//	    caps.setCapability("platform", Platform.WIN10);
	    caps.setCapability("browser_version", "latest");
	    caps.setCapability("browserstack.local", "false");
	    caps.setCapability("browserstack.selenium_version", "3.14.0");

	    
	    caps.setCapability("name", "Chromelatest!");
	    
	    driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://stackoverflow.com/");
	    
	    driver.findElement(By.linkText("Log in")).click();
	    
	    driver.findElement(By.id("email")).sendKeys("mail@gmail.com");
	    
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("testing");
	    
	    driver.findElement(By.xpath("//button[@id='submit-button']")).click();
	    
		  }
		  catch (Exception e) {
			// TODO: handle exception
			  e.printStackTrace();
		}
		  finally {
			driver.close();
		}
	    
	    

}
}
