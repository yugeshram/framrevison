package org.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxlsxfile {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\muthu\\eclipse-workspace\\frameRev\\Excel\\book2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		
	Sheet sheet = book.getSheet("data");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(1);
	System.out.println(cell);
		
	int rowcount = sheet.getPhysicalNumberOfRows();
	System.out.println(rowcount);
	
	Row row2 = sheet.getRow(1);
	int Cellscount = row2.getPhysicalNumberOfCells();
	System.out.println(Cellscount);
	
	for (int i = 0; i <row.getPhysicalNumberOfCells(); i++) {
		Cell cell1 = row.getCell(1);
		System.out.println(cell1);
		
	}
	
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			 Row row1 = sheet.getRow(i);
						
		for (int j = 0; j <row1.getPhysicalNumberOfCells(); j++) {
			Cell cells = row1.getCell(j);
			System.out.println(cells);
		}
		}
	}

}
