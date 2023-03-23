package codiod.technicaltasks.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTabs {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in//");
		String currentHandle= driver.getWindowHandle();
		// Searching for Headphones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones", Keys.ENTER);

		//Clicking on search button
		String UrlToClick=driver.findElement(By.xpath("//span[contains(text(),'Infinity (JBL) Glide 500 Wireless Headphones with ')]")).getAttribute("href");
		driver.navigate().to(currentHandle);
		// TODO Auto-generated method stub
	}

}
