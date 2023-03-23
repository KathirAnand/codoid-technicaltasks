package codiod.technicaltasks.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindMultipleElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("URL");
		//findElements() method in WebDriver can be used to find more than one web elements and save them into a list.
		List<WebElement> elements=driver.findElements(By.id(""));
		for(WebElement element:elements) {
			String a="a";
			if(element.getTagName().equals(a)) {
				element.click();
			}
		}
	}

}
