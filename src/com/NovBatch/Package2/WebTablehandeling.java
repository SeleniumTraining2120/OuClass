package com.NovBatch.Package2;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablehandeling {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		FileInputStream fis = new FileInputStream("D:\\CEP_WorkSpace\\TestPractice\\Properties\\Locators.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", "D:\\CEP_WorkSpace\\TestPractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		Thread.sleep(1000);
		
		
		//System.out.println(driver.findElement(By.xpath(".//table[@class = 'dataTable']/tbody/tr[1]/td[4]")).getText());
		
		WebElement table = driver.findElement(By.xpath(prop.getProperty("table_xpath")));
		
		List<WebElement> rows  = table.findElements(By.tagName("tr"));
		
		for(int i = 0; i < rows.size(); i++) {
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			for(int j = 0; j < cols.size(); j++) {
				
				String cellValue = cols.get(0).getText();
				
				System.out.print(" "+cellValue +" ");
			}
			
			System.out.println("");
		}
		
		
	}

}
