package com.NovBatch.Package2;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
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

public class AlertHandeling {

	WebDriver driver = null;

	public boolean fluentWait(By by) {

		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
				public Boolean apply(WebDriver driver) {
					WebElement element = driver.findElement(by);
					return element.isDisplayed();
				}
			};
			wait.until(function);
			return driver.findElement(by).isDisplayed();
		} catch (Exception e) {

			return false;
		}
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("D:\\CEP_WorkSpace\\TestPractice\\Properties\\Locators.properties");

		Properties prop = new Properties();

		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		// Normal Alert Code
		/*
		 * driver.findElement(By.cssSelector(prop.getProperty("noramalAlert_btn"))).
		 * click();
		 * 
		 * Thread.sleep(500); Alert a = driver.switchTo().alert(); String alertText =
		 * a.getText(); System.out.println("Noramal Alert message: " + alertText);
		 * Thread.sleep(5000); a.accept();
		 */

		/*
		 * //Confirm Alert code
		 * driver.findElement(By.cssSelector(prop.getProperty("promtAlert_btn"))).click(
		 * );
		 * 
		 * Thread.sleep(500); Alert a1 = driver.switchTo().alert();
		 * 
		 * String alertText1 = a1.getText();
		 * 
		 * System.out.println("Prompt Alert message: " + alertText1);
		 * 
		 * a1.sendKeys("Vamsi Krishna"); Thread.sleep(5000); a1.accept();
		 */

		driver.findElement(By.id(prop.getProperty("timeAlert_btn"))).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a1 = driver.switchTo().alert();
		String alertText1 = a1.getText();
		System.out.println("Prompt Alert message: " + alertText1);
		Thread.sleep(3000);
		a1.accept();

		driver.findElement(By.id(prop.getProperty("timeAlert_btn"))).click();
		Wait<WebDriver> waitFluent = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		waitFluent.until(ExpectedConditions.alertIsPresent());

		Alert a2 = driver.switchTo().alert();
		String alertText2 = a2.getText();
		System.out.println("Prompt Alert message: " + alertText2);
		Thread.sleep(3000);
		a1.accept();

		WebElement element2 = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.cssSelector(prop.getProperty("promtAlert_btn")));
			}
		});

		element2.click();

	}

}
