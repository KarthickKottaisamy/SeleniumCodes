package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Website {

	public static void main(String[] args) throws InterruptedException {
		// Enter some keyword & click on search
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Siva\\\\eclipse-workspace\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("APjFqb"));
		element.click();
		element.sendKeys("Madurai");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
