package com.NovBatch.Package2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementsByList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/selenium-webdriver/dropdown-in-selenium/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> listTextBox = driver.findElements(By.tagName("h2"));
		
		listTextBox.size();
		
		System.out.println("Number of H2 Tags: " + listTextBox.size());
		
		String exph2Text = "What is Select Class in Selenium?";
		
		for(int i = 0; i < listTextBox.size(); i++) {
			
			String acth2Text = listTextBox.get(i).getText();
			
			if(acth2Text.equals(exph2Text)) {
				
				System.out.println(exph2Text + " Found in Tools QA Page.");
				
			}else {
				System.out.println(exph2Text + " Not Found in Tools QA Page.");
			}
		}
		
		

	}

}
