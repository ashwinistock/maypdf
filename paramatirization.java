package selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class paramatirization {
//
// public static String getTest(int row,int cell, String sheetname) throws EncryptedDocumentException, IOException {
//		FileInputStream file = new FileInputStream("C:\\Users\\DigitechPC\\Documents\\eclipse.xlsx");
//		String value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
////		System.out.println(value);
//		return value;
	//}
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		
//		String value = paramatirization.getTest();

		
      public static String Getop(int row,int cell,String sheetname) throws EncryptedDocumentException, IOException  {
	FileInputStream file = new FileInputStream ("C:\\Users\\DigitechPC\\Documents\\eclipse.xlsx");
	String val = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	System.out.println(val);
	return val;
}
     
	}

