package dataFactoryDesignPatteren;

import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData implements TestDataProvider{

	@Override
	public Map<String, String> dataSource() {

		XSSFWorkbook wbook=new XSSFWorkbook();
		XSSFSheet wsheet=wbook.getSheetAt(0);
		int rowCount=wsheet.getLastRowNum();
		int columnCount=wsheet.getRow(0).getLastCellNum();
		String[][] data=new String[rowCount][columnCount];
		for(int i=1;i<rowCount;i++) {
			XSSFRow row=wsheet.getRow(i);
			for(int j=0;j<columnCount-1;j++) {
				XSSFCell cell=row.getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		
		return null;
	}

}
