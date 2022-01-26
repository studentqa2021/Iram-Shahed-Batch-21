package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.BaseConfig;
import com.util.Highlighter;

public class MasterPageFactory {
	static WebDriver driver;
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@name ='userName']")
	private WebElement user;
	@FindBy(xpath = "//*[@name ='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@name ='submit']")
	private WebElement submit;

	public void testLogin() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // driver path
		WebDriver driver = new ChromeDriver(); // possible to create an obj due to up casting
		driver.get(BaseConfig.getValue("URL"));
		MasterPageFactory obj = new MasterPageFactory(driver);
		driver.manage().window().maximize();
		obj.getUser().sendKeys(BaseConfig.getValue("user"));
		Highlighter.getColor(obj.getUser(), driver);
		obj.getPassword().sendKeys(BaseConfig.getValue("password"));
		Highlighter.getColor(obj.getPassword(), driver);
		obj.getSubmit().click();

	}

	public WebElement getUser() {
		return user;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		new MasterPageFactory(driver).testLogin();
	}
}
