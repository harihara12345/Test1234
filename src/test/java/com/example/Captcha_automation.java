package com.example;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Captcha_automation {
	public static void main(String args[]) throws Throwable{
		//Driver initialization part
		WebDriverManager.chromedriver().setup();	
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("http://nlpcaptcha.in/index.php/pages/signup");
		Thread.sleep(20000);
		
		
		WebElement captchaImg=driver.findElement(By.xpath("(//*[@id='nlpImgContainer']//img)[2]"));
		
		//WebElement captchaImg=driver.findElement(By.xpath("//*[@id='nlpCaptchaImg']"));
		
		
		getScreenshot(captchaImg,"Captcha");
		Thread.sleep(5000);
		driver.quit();
		
				
	}
	
	//Reusable method to take screenshot at Webelement Level
		public static void getScreenshot(WebElement Element, String FileName) throws Throwable{
			File srcFile=Element.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\HARIHARAVIGNESHM\\Desktop\\Eclipse source folders\\New folder\\"+FileName+".png"));
			extractTextFromImage("C:\\Users\\HARIHARAVIGNESHM\\Desktop\\Eclipse source folders\\New folder\\"+FileName+".png");
		}
		
		
		public static void extractTextFromImage(String strPath) throws Throwable{
			ITesseract img=new Tesseract();
			String imgText=img.doOCR(new File(strPath));
			System.out.println("The text is : " + imgText);
			
			
		}

}
