package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetallDatainaCOL 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Nexas\\Downloads\\Ashwini-WPS Office.xlsx");		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			Cell data = sh.getRow(i).getCell(0);
			CellType s1 = data.getCellType();
			
			if(s1==CellType.STRING)
			{
				System.out.println(data.getStringCellValue());
			}
			else if (s1 == CellType.NUMERIC) 
			{
				System.out.println(data.getNumericCellValue());
			}
			else if (s1 == CellType.BOOLEAN) 
			{
				System.out.println(data.getBooleanCellValue());
			}			
		}			
	}	
}
