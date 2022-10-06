package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		
		String path="C:\\Users\\HP\\eclipse-workspace\\Accenture_framework\\TestData\\Text.xlsx";
	FileInputStream file=new FileInputStream(path);
	 wb=new XSSFWorkbook(file);
	
	}
public String getstringdata(String sheetname ,int row,int cell) {
	return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
}
}
