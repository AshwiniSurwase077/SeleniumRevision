package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class GetAllDataInARow 
{
public static void main(String[] args) throws InterruptedException,EncryptedDocumentException, IOException 
{
FileInputStream	file=new FileInputStream("E:\\Manual_Notes\\Ashwini-WPS Office.xlsx");
 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
 
 int lastcellindex = sh.getRow(0).getLastCellNum()-1;
 
 
 for(int i=0; i<=lastcellindex; i++)
	{
		Cell data = sh.getRow(0).getCell(i);
		CellType s1 = data.getCellType();
		
		if(s1==CellType.STRING)
		{
			System.out.print(data.getStringCellValue()+" ");
		}
		else if (s1 == CellType.NUMERIC) 
		{
			System.out.print(data.getNumericCellValue()+" ");
		}
		else if (s1 == CellType.BOOLEAN) 
		{
			System.out.print(data.getBooleanCellValue()+" ");
		}

}


}
}
