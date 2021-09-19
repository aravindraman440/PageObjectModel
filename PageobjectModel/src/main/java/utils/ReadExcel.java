package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public  String[][] excelData(String fileName) throws IOException {
	
	XSSFWorkbook book =new XSSFWorkbook("./data/"+fileName+".xlsx");
	XSSFSheet sheet = book.getSheet("Sheet1");
	int lastRowNum = sheet.getLastRowNum();
	short lastCellNum = sheet.getRow(0).getLastCellNum();
	String[][] data=new String[lastRowNum][lastCellNum];
    for (int i = 1; i <= lastRowNum; i++) {
		for (int j = 0; j < lastCellNum; j++) {
			String Value = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(Value);
			data[i-1][j]=Value;
		}
	}
    book.close();
	return data;
}

}
