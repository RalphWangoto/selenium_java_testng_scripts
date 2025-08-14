package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	public static WebDriver driver;
	String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
	
	@Test(priority = 1, enabled = true)
	public void openGoogleHomePage() {
		
		// Initialize chrome driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Get URL
		driver.get(url);
		
		driver.quit();
	}
}
