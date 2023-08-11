package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class GetTypeofData
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file=new FileInputStream("C:\\Users\\Nexas\\Downloads\\Ashwini-WPS Office.xlsx");

CellType s1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
System.out.println(s1);

}
}
