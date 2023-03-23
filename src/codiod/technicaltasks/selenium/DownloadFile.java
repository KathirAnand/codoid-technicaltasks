package codiod.technicaltasks.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://demo.guru99.com/test/yahoo.html";
		driver.get(baseUrl);
		 WebElement downloadButton = driver.findElement(By
			        .id("messenger-download"));
			        String sourceLocation = downloadButton.getAttribute("href");
			        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

			        try {
			        Process exec = Runtime.getRuntime().exec(wget_command);
			        int exitVal = exec.waitFor();
			        System.out.println("Exit value: " + exitVal);
			        } catch (InterruptedException | IOException ex) {
			        System.out.println(ex.toString());
			        }
			        driver.close();
		// TODO Auto-generated method stub

	}

}