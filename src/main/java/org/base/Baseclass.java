package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static void launchbrowser() {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void windowMaximise() {
		driver.manage().window().maximize();

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static String pageTitle() {

		String title = driver.getTitle();
		return title;

	}

	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void passText(String txt, WebElement els) {
		els.sendKeys(txt);

	}

	public static void closeEntireBrowser() {
		driver.quit();

	}

	public static void clickBtn(WebElement els) {
		els.click();
	}

	public static void screenShot(String imgname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+imgname.png");
		FileUtils.copyFile(ss, f);

	}

	public static void createNewExcelFile(int rowNum, int cellNum, String data) throws IOException {

		File f = new File("C:\\Users\\Happy\\eclipse-workspace\\MavenInstallation\\Excel\\sampdata.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet mysheet = wb.createSheet("Datas");
		Row row = mysheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void createRow(int creRow, int creCell, String data) throws IOException {

		File f = new File("C:\\Users\\Happy\\eclipse-workspace\\MavenInstallation\\Excel\\sampdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row row = mysheet.createRow(creRow);
		Cell cell = row.createCell(creCell);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void createCell(int rowNum, int cellNum, String data) throws IOException {

		File f = new File("C:\\Users\\Happy\\eclipse-workspace\\MavenInstallation\\Excel\\sampdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row row = mysheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void updateParticularCell(int getRow, int getCell, String existingData, String newData)
			throws IOException {
		File f = new File("C:\\Users\\Happy\\eclipse-workspace\\MavenInstallation\\Excel\\sampdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row row = mysheet.getRow(getRow);
		Cell cell = row.getCell(getCell);

		String cellValue = cell.getStringCellValue();
		if (cellValue.equals(existingData)) {
			cell.setCellValue(newData);
		}

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

}
