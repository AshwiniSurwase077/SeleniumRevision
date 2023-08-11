package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowsize 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file=new FileInputStream("C:\\Users\\Nexas\\Downloads\\Ashwini-WPS Office.xlsx");

int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
System.out.println(rowsize);
}
}
