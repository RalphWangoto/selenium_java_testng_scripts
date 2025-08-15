package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	public static FileReader fileReaderUrlConfig;
	public static Properties urlConfigLocators = new Properties();
	public static FileReader fileReaderLocatorManagement;
	public static FileReader fileReaderUsermanagement;
	public static Properties locators = new Properties();

	String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
	
	@BeforeTest
	public void initializeChromeDriver() throws IOException {
		String path = System.getProperty("user.dir");
		try {
			fileReaderUrlConfig = new FileReader(path + "\\src\\test\\java\\config\\url.properties");
			urlConfigLocators.load(fileReaderUrlConfig);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Initialize chrome driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Get URL
		driver.get(urlConfigLocators.getProperty("url"));

	}

}
