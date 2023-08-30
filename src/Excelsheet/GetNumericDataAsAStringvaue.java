package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericDataAsAStringvaue 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("E:\\Manual_Notes\\Ashwini-WPS Office.xlsx");

String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
System.out.println(value);
}
}
