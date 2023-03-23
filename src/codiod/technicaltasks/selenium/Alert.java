package codiod.technicaltasks.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		// TODO Auto-generated method stub

	}
	public void testAlertPositive() {
	    // Navigate to website with alert
	    driver.get("http://example.com");
	    
	    // Click button to trigger alert
	    driver.findElement(By.id("alertButton")).click();
	    
	    // Switch to alert and accept it
	    org.openqa.selenium.Alert alert = driver.switchTo().alert();
	    alert.accept();
	    
	    // Assert that alert was displayed and accepted
	    assertTrue(alert.getText().equals("Alert message"));
	}
	private void assertTrue(boolean equals) {
		// TODO Auto-generated method stub
		
	}

	public void testAlertNegative() {
	    // Navigate to website without alert
	    driver.get("http://example.com");
	    
	    // Attempt to switch to alert
	    try {
	        org.openqa.selenium.Alert alert = driver.switchTo().alert();
	        fail("Expected exception not thrown");
	    } catch (NoAlertPresentException e) {
	        // Expected exception thrown, test passed
	        assertTrue(true);
	    }
	}
	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}
}