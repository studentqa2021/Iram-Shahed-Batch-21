package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracSelenium {
	public static void main(String[] args) {
		//WebDriver obj = new WebDriver(); // not possible since its an interface
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // driver path
		WebDriver driver = new ChromeDriver(); // possible to create an obj due to up casting
		driver.get("https://www.amazon.com/");
	}
}	
