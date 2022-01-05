package com.NovBatch.Package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandeling {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dropDownXpath = driver.findElement(By.id("oldSelectMenu"));

		Select s = new Select(dropDownXpath);
		s.selectByValue("3");
		s.selectByVisibleText("White");
		s.selectByIndex(5);
		s.deselectByIndex(5);
		WebElement multiDropDownXpath = driver.findElement(By.name("cars"));
		Select ms = new Select(multiDropDownXpath);
		ms.selectByIndex(3);
		ms.selectByVisibleText("Saab");
		ms.selectByValue("volvo");
		Thread.sleep(2000);
		ms.deselectByIndex(0);
		ms.deselectByIndex(1);
		
		
		driver.findElement(By.className(" css-1wa3eu0-placeholder")).sendKeys("Blue");

	}

}
