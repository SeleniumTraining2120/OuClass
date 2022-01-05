package com.NovBatch.Package2;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		FileInputStream fis = new FileInputStream("D:\\CEP_WorkSpace\\TestPractice\\Properties\\Locators.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);		
		
        System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.id(prop.getProperty("tab_btn"))).click();
		
		
		Set<String> childWindows =  driver.getWindowHandles();
		
		Iterator<String> itr = childWindows.iterator();
		
		while(itr.hasNext()) {
			String childWindow = itr.next();
			
			if(childWindow.equals(parentWindow)) {
				System.out.println("This a Parent Window.");
			}else {
				driver.switchTo().window(childWindow);
				String childWindowText = driver.findElement(By.id(prop.getProperty("sampleText"))).getText();
				System.out.println(childWindowText);
				String expText = "This is a sample";
				if(childWindowText.equals(expText)) {
					System.out.println("Text present in the child window");
				}else {
					System.out.println("Text not matching in the child window.");
				}
				
			}
			
			
		}
	}

}
