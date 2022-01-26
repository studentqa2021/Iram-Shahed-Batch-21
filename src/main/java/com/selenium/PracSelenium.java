package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracSelenium {
	public void testLogin() throws InterruptedException {
		//WebDriver obj = new WebDriver(); // not possible since its an interface
		
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // driver path
				WebDriver driver = new ChromeDriver(); // possible to create an obj due to up casting
				driver.get("http://automationpractice.com/index.php");
//				driver.navigate().to("http://automationpractice.com/index.php");
//				driver.navigate().refresh();
//				driver.navigate().back();
//				driver.navigate().forward();
				driver.manage().window().maximize();
				
				WebElement signInButton = driver.findElement(By.xpath("//*[@class='login']"));
				signInButton.click();
				Thread.sleep(3000);//slow down for 3 seconds number in milliseconds
				
				WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
				email.sendKeys("iramshahed1@gmail.com");
				
				WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
				password.sendKeys("password");
				
				WebElement submitLogin = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
				submitLogin.click();
				Thread.sleep(3000);//slow down for 3 seconds
				
				//driver.close();--> will close only the current browser,doesn't stop the driver just the browser 
				driver.quit();//--> will close all the browsers that are open, stops both driver and browsers QUIT IS BETTER
				
				
	}
	public static void main(String[] args) throws InterruptedException {
		PracSelenium obj = new PracSelenium();
		obj.testLogin();
	}
}	
