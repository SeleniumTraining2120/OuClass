package com.NovBatch.Package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAutomation {
	
	static String expTitle = "ToolsQA";
	final static String str = "Selenium Training";

	int a = 2;
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub


		FileInputStream fis = new FileInputStream("D:\\CEP_WorkSpace\\TestPractice\\Properties\\Locators.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);		
		
        System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.get(prop.getProperty("url"));		
		
		Thread.sleep(1000);
		
		expTitle = "update title";
		
		System.err.println(expTitle);
		
		if(!driver.getTitle().equals(expTitle)) {
			
			System.out.println("Window Title is correct");
			
		}else {
			
			System.out.println("Window Title is not correct");
		}
		
		driver.findElement(By.xpath(prop.getProperty("SideNav_TextBox"))).click();	
		Thread.sleep(1000);		
		
		driver.findElement(By.id(prop.getProperty("fullName_txt"))).sendKeys(prop.getProperty("fullName_value"));
		Thread.sleep(1000);
		
		driver.findElement(By.id(prop.getProperty("email_txt"))).sendKeys(prop.getProperty("email_value"));
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys(prop.getProperty("currentAdd_value"));
		Thread.sleep(1000);
		
		/*driver.findElement(By.xpath(prop.getProperty("sideNav_CheckBox"))).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("toggle"))).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("desktop_ckb"))).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("downloads_ckb"))).click();
		Thread.sleep(1000);*/
		
		/*driver.findElement(By.xpath(prop.getProperty("button_sideNav"))).click();	
		Thread.sleep(1000);	*/
		
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(1000);
		
		WebElement doubleClickEle = driver.findElement(By.cssSelector(prop.getProperty("doubleClick_btn")));
		WebElement rightClcikEle = driver.findElement(By.cssSelector(prop.getProperty("rightClick_btn")));
		
		Actions act = new Actions(driver);
		act.moveToElement(doubleClickEle).doubleClick().build().perform();
		Thread.sleep(1000);
		act.moveToElement(rightClcikEle).contextClick().build().perform();
		
		driver.findElement(By.xpath(prop.getProperty("SideNav_TextBox"))).click();	
		Thread.sleep(1000);		
		
		WebElement fullNameEle = driver.findElement(By.id(prop.getProperty("fullName_txt")));
		WebElement emailEle = driver.findElement(By.id(prop.getProperty("email_txt")));
		
		act.keyDown(fullNameEle,Keys.SHIFT).sendKeys(prop.getProperty("fullName_value")).keyUp(Keys.SHIFT);
		
		act.build().perform();
		
	//act.key
		
	}

}
