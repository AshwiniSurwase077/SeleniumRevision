package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetcellsizeinRow 
{

public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("E:\\Manual_Notes\\Ashwini-WPS Office.xlsx");

 short colsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
System.out.println(colsize);
}
}
