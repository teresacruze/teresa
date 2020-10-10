package com.usa.smarttech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FaceBookLogin {
	static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");	
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.id("//*[@placeholder='Email or Phone Number']")).sendKeys("3474799066");
	driver.findElement(By.id("//input[@type='password']")).sendKeys("hollen");
	driver.findElement(By.id("//*[@name='login']")).click();
	driver.findElement(By.linkText("//a[@aria-label='Facebook']")).click();
	 System.out.println(driver.getTitle());
     
	}
  

}

