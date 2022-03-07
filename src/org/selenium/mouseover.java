package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\LENOVO\\\\eclipse-workspace\\\\Selenium1\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement tab = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions as = new Actions(driver);
		as.moveToElement(tab).perform();
		
		Thread.sleep(2000);
		
		
		WebElement cdress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		as.moveToElement(cdress).perform();
		cdress.click();
		
	}
}
