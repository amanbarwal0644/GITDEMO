import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data_driven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

		FileInputStream fls= new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\EXCEL WORKSHEET\\Workbook.xlsx");
		
		XSSFWorkbook book_object = new XSSFWorkbook(fls);
		
		int number = book_object.getNumberOfSheets();
		
		for(int i=0; i<number;i++) {
	
		if(book_object.getSheetName(i).equals("Data")){
			
			System.out.println(book_object.getSheetName(i));
			 XSSFSheet grabed =  book_object.getSheetAt(i);
		System.out.println(grabed);
		
		Iterator <Row> R = grabed.rowIterator();
		Row first_row = R.next();
		
		
		Iterator <Cell> column =  first_row.cellIterator();
		while(column.hasNext()) {
			
			Cell first_column = column.next();
			
			if(first_column.getStringCellValue().equalsIgnoreCase("Test cases")) {
				System.out.println("hi");
			}
			
		}
		
		
		
		
		
		}
         
			
		}
	
	
	
		
		
	}

}
