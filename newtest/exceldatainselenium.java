package newe.newtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.*;

public class exceldatainselenium {
	
	public static void main(String[] args) {
		
		XSSFWorkbook ExcelBook = null;
		XSSFSheet  ExcelWSheet;
		XSSFRow Row;
		
		XSSFCell Cell;
		
		File excelFile = new File("C:\\Users\\saurabh\\OneDrive\\Desktop\\seleniumexcel.xlsx");
		
		FileInputStream inputStream;
		try {
		 inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ExcelWBook = new XSSFWorkbook(inputStream);
		
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		int ttlRows = ExcelWSheet.getLastRowNum() +1;
		
		int ttlCells = ExcelWSheet.getRow(0).getLastCellNum() 
		
		for (int currentCell =0; currentCell<ttlRows; currentRow++)
		{
			for(int current=0; currentCell<ttlCells; currentCell++) 
			{
			System.out.println(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());	
			
			System.out.println("\t");
			}
			
		System.out.println("");
		}
		
	}

}
