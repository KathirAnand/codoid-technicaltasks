package codiod.technicaltasks.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();

		final String URL = "https://www.google.com";

		// creating driver instance for different browsers
		WebDriver chromeDriver = new ChromeDriver();
		WebDriver fireFoxDriver = new FirefoxDriver();
		WebDriver edgeDriver = new EdgeDriver();

		// launch the url in three different browser
		chromeDriver.get(URL);
		fireFoxDriver.get(URL);
		edgeDriver.get(URL);
		// TODO Auto-generated method stub

	}

}
