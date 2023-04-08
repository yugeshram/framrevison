package org.day1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Writexlsx {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\muthu\\eclipse-workspace\\frameRev\\Excel\\book2.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet Sheet = book.createSheet("sel");
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement sel = driver.findElement(By.id("Skills"));
		Select sc = new Select(sel);
		sc.selectByIndex(3);
		List<WebElement> options = sc.getOptions();
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i <options.size(); i++) {
			WebElement all = options.get(i);
			String text = all.getText();
			System.out.println(text);
			
		}
		for (int i = 0; i <options.size(); i++) {
               Row createRow = Sheet.createRow(i);
               Cell createCell = createRow.createCell(0);
               createCell.setCellValue(options.get(i).getText());
		}
		FileOutputStream stream = new FileOutputStream(file);
		
		book.write(stream);
	}

}
