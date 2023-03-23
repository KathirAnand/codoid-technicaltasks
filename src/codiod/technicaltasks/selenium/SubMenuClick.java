package codiod.technicaltasks.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubMenuClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	      //identify menu
	      WebElement accountList=driver.findElement(By.id("nav-link-accountList"));
	      // object of Actions with method moveToElement
	      Actions action = new Actions(driver);
	      action.moveToElement(accountList).perform();
	      //identify sub-menu element
	      WebElement subMentElement=driver.
	      findElement(By.xpath("//*[text()='Create a List']"));
	      //move to element and click
	      action.moveToElement(subMentElement).click().perform();
	      WebElement pageElement=driver.findElement(By.id("//navigatedPageElement"));
	      pageElement.click();
	      System.out.println("Page navigated to: " +driver.getTitle());
	      driver.quit();
		
		// TODO Auto-generated method stub

	}

}