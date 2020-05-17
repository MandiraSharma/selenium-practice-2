package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {
	WebDriver driver;
	public void LaunchBrowsers() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mandira\\selenium\\SeleniumSession1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.manage().window().maximize();

	}

}
