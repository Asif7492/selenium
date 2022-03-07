package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Ce%7Cfacebook%7C&placement=&creative=550525804944&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1001394929%26loc_physical_ms%3D9061923%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-sXtq5Ke9gIV_4dLBR1jdg7lEAAYASAAEgK7NvD_BwE");
	
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		firstname.sendKeys("King");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		lastname.sendKeys("Asif");
		
		WebElement emailid = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		emailid.sendKeys("neversharelogin007@gmail.com");
		
		WebElement emailid2 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		emailid2.sendKeys("neversharelogin007@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("king@7492");
		
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1 = new Select(date);
		s1.selectByValue("4");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2 = new Select(month);
		s2.selectByValue("6");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3 = new Select(year);
		s3.selectByIndex(26);
		
		WebElement button = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		button.click();
		
		
		WebElement element = driver.findElement(By.xpath("//div[@class='_1lch']"));
		element.click();
		
		
	
	
	}
}
