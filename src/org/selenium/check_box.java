package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_box {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		WebElement check = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[7]"));
		check.click();
		
		
		WebElement javaCheck = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		javaCheck.click();
		
		WebElement vbcheck = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		vbcheck.click();
		

		
	}
}
