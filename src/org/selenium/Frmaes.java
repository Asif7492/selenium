package org.selenium;

import java.io.IOException;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frmaes {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		
		driver.switchTo().frame("SingleFrame");
		
		WebElement frame1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame1.sendKeys("Asif");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		frame2.click();
		
		
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(frame3);
		
		
		WebElement frame4 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(0);
		
		
		
		
		WebElement frame5 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame5.sendKeys("Asif");
		
		

		
		


}
}