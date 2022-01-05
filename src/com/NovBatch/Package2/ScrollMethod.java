package com.NovBatch.Package2;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\CEP_WorkSpace\\TestPractice\\Properties\\Locators.properties");		
		Properties prop = new Properties();		
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");			
		Thread.sleep(3000);				
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("window.scrollBy(0,3000)", "");		
		WebElement scrollToElement = driver.findElement(By.xpath(prop.getProperty("toolsText_xpath")));		
		js.executeScript("arguments[0].scrollIntoView();", scrollToElement);
		
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0, document.body.scrollTop)");
		
		//WebElement element = driver.findElement(By.xpath(prop.getProperty("toolsText_xpath")));
	
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("toolsText_xpath"))));
		
		boolean value = driver.findElement(By.xpath(prop.getProperty("toolsText_xpath"))).isDisplayed();
		
		if(value == true) {
			System.out.println("Element found in DOM.");
		}else {
			System.out.println("Element not found in DOM.");
		}
	}

}
