package com.NovBatch.Package2;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	WebDriver driver = null;

	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("D:\\CEP_WorkSpace\\TestPractice\\Properties\\Locators.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(prop.getProperty("timeAlert_btn"))));
		driver.findElement(By.id(prop.getProperty("timeAlert_btn"))).click();		
		wait.until(ExpectedConditions.alertIsPresent());		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		a.accept();
		// Opening an alert again
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement element2 = w.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.id(prop.getProperty("timeAlert_btn")));
			}
		});

		element2.click();

		wait.until(ExpectedConditions.alertIsPresent());
		Alert a1 = driver.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(3000);
		a1.accept();

	}

}
