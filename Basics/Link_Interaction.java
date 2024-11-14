package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Interaction {

	public static void main(String[] args) throws InterruptedException {

		String name = "webdriver.chrome.driver";
		String location = "C:\\Users\\Siva\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(name, location);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://the-internet.herokuapp.com/");
		WebElement element = driver.findElement(By.linkText("A/B Testing"));
		element.click();
		Thread.sleep(2500);

		driver.close();
		driver.quit();

	}

}
