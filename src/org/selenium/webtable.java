package org.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));
		
		for (WebElement data : table) {
			System.out.println(data.getText());
			
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		WebElement single = driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr/td)[12]"));
		String Country = single.getText();
		System.out.println(Country);
	
		System.out.println("---------------------------------------------------");
		
		List<WebElement> header = driver.findElements(By.xpath("(//table[@id='customers']/tbody/tr)[1]"));
		for (WebElement head : header) {
			System.out.println(head.getText());
			
		}
	
		
		
		
		
		
	}
}
