package com.NovBatch.Package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandeling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\CEP_WorkSpace\\TestPractice\\Properties\\Locators.properties");		
		Properties prop = new Properties();		
		prop.load(fis);				
        System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		
		String text = driver.findElement(By.id(prop.getProperty("sampleText"))).getText();
		
		System.out.println(text);
		
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		String text1 = driver.findElement(By.id(prop.getProperty("sampleText"))).getText();
		System.out.println(text1);
	}

}
