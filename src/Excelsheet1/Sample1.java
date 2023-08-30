package Excelsheet1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Sample1
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
//S1.setup();
//WebDriver driver=new ChromeDriver();
	FileInputStream file=new FileInputStream("E:\\Manual_Notes\\Ashwini-WPS Office.xlsx");
//String value= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//System.out.println(value);

//double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
//System.out.println(value);

//boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
//System.out.println(value);

//int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
//System.out.println(rowsize);

//short cellsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
//System.out.println(cellsize);

//String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
//System.out.println(value);
//
//CellType s1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getCellType();
//System.out.println(s1);

//Cell data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1);
//CellType s1 = data.getCellType();
//
//if(s1==CellType.STRING)
//{
//	System.out.println(data.getStringCellValue());
//}
//else if(s1==CellType.NUMERIC)   
//{
//	System.out.println(data.getNumericCellValue());
//}
//else if(s1==CellType.BOOLEAN)
//{
//	System.out.println(data.getBooleanCellValue());
//}
//
//Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
//int lastcellindex = sh.getRow(0).getLastCellNum()-1;
//
//for(int i=0; i<=lastcellindex; i++)
//{
//	Cell data = sh.getRow(0).getCell(i);   //cchang the getrow value
//	CellType s1 = data.getCellType();
//	
//	if(s1==CellType.STRING)
//	{
//		System.out.println(data.getStringCellValue());
//	}
//	if(s1==CellType.NUMERIC)
//	{
//		System.out.println(data.getNumericCellValue());
//	}
//	if(s1==CellType.BOOLEAN)
//	{
//		System.out.println(data.getBooleanCellValue());
//	}

//}


Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
int lastrowindex = sh.getLastRowNum();

for(int i=0; i<=lastrowindex; i++)
{
	Cell data = sh.getRow(i).getCell(1); // get the 2nd column value we need to chang the value oh getcell
	CellType s1 = data.getCellType();
	
	if(s1==CellType.STRING)
	{
		System.out.println(data.getStringCellValue());
	}
	else if(s1==CellType.NUMERIC)
	{
		System.out.println(data.getNumericCellValue());
	}
	else if(s1==CellType.BOOLEAN)
	{
		System.out.println(data.getBooleanCellValue());
	}
}












}
}
