package org.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsx {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\muthu\\eclipse-workspace\\frameRev\\Excel\\book2.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook book = new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("sel");
	Row row2 = sheet.getRow(8);
	Cell cell = row2.getCell(0);
	System.out.println(cell);
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell2 = row.getCell(j);
			System.out.println(cell2);
		}
		
	}
	
	
	
	 
	
}
	
}
