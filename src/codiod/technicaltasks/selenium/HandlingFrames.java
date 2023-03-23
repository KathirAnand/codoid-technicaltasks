package codiod.technicaltasks.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("url");
		// grabbing the first frame with the help of index
		driver.switchTo().frame(0);
		// grabbing the frame with the help of frame name
		driver.switchTo().frame("<<name expression>>");
		// grabbing the frame with the help of frame webelement
		WebElement name = driver.findElement(By.name("frame-right"));
		driver.switchTo().frame(driver.findElement(By.name("<<name expression")));
		driver.quit();
	}

}
