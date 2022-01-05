package com.NovBatch.Package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

FileInputStream fis = new FileInputStream("D:\\CEP_WorkSpace\\TestPractice\\Properties\\Locators.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");		
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.xpath(".//a[text() = 'Sign in']")).click();		
	
		driver.findElement(By.id("identifierId")).sendKeys(prop.getProperty("email_value"));
		
		/*driver.findElement(By.tagName("a")).click();
		
		driver.findElement(By.partialLinkText("use Inco")).click();		
		
		driver.findElement(By.partialLinkText("Learn more")).click();
		
		driver.findElement(By.className("appbar-helpcenter-sections__link appbar-helpcenter-sections--community")).click();		
		
		driver.findElement(By.cssSelector("CSSValueString")).click();*/
		
		/*driver.findElement(By.xpath(".//span[text() = 'Next']")).click();
		
		driver.findElement(By.name("identifier")).sendKeys("DesiredPasswworde");
		
		driver.findElement(By.xpath(".//button[@id = 'value']")).click();
		
		driver.findElement(By.tagName("input")).sendKeys("desiredText");
*/
	}

}
