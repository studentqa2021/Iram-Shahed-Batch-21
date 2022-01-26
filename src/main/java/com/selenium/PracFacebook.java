package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracFacebook {
	public void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("ishahed3914@bths.edu");
		
		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("Iram1n2n3n");
		
		WebElement submitLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		submitLogin.click();
		
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		PracFacebook obj = new PracFacebook();
		obj.testLogin();
	}
}
