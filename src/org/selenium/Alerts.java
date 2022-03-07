package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement findElement = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		findElement.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement select1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		select1.click();
		
		
		WebElement findElement2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		findElement2.click();
		
		Thread.sleep(2000);
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		
		WebElement select2 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		select2.click();
		
		WebElement findElement3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		findElement3.click();
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Asif");
		alert3.accept();
		
		Thread.sleep(2000);
		
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium1\\Screenshots\\alert.png");
		FileUtils.copyToDirectory(src, destination);
		
		
		
		
		
		
	}

}
