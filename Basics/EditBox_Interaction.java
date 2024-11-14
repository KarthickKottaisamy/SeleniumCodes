package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox_Interaction {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "webdriver.chrome.driver";
		String location = "C:\\Users\\Siva\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(name, location);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		// Entering a text in a text box
		WebElement element = driver.findElement(By.linkText("Edit"));
		element.click();
		WebElement nameBox = driver.findElement(By.id("fullName"));
		nameBox.click();
		nameBox.sendKeys("KunkfuPanda");
		
		// Adding a text to the text box with existing text in it 
		WebElement joinBox = driver.findElement(By.id("join"));
		joinBox.click();
		joinBox.sendKeys(" at coding");
		
		// Clearing the existing text & entering a new value
		joinBox.clear();
		joinBox.sendKeys("Hello Everyone");
		
		Thread.sleep(2500);
		driver.close();
		driver.quit();
		
	}

}
