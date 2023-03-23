package codiod.technicaltasks.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataFromExcel {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverWait wait;
		HSSFWorkbook workbook;
		HSSFSheet sheet;
		HSSFCell cell;
		
		public void ReadData() throws IOException {
			WebDriverManager.chromedriver().setup();

			driver = new FirefoxDriver(); 

			driver.get("http://www.facebook.com/"); 

			driver.manage().window().maximize(); 

			wait = new WebDriverWait(driver,30); 

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

			  File src=new File("C:\\Users\\Admin\\Desktop\\TestData.xls"); 

			// Load the file. 

			FileInputStream finput = new FileInputStream(src); 

			// Load the workbook. 

			workbook = new HSSFWorkbook(finput); 

			// Load the sheet in which data is stored. 

			sheet= workbook.getSheetAt(0); 

			for(int i=1; i=sheet.getLastRowNum(); i++) { 

			// Import data for Email. 

			cell = sheet.getRow(i).getCell(1); 

			cell.setCellType(Cell.CELL_TYPE_STRING); 

			driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue()); 

			// Import data for password. 

			cell = sheet.getRow(i).getCell(2); 

			cell.setCellType(Cell.CELL_TYPE_STRING); 

			driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue()); 

			} 

			} 

		// TODO Auto-generated method stub

	}

}
