package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome Browser & Navigate to Home Page

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Siva\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
}
