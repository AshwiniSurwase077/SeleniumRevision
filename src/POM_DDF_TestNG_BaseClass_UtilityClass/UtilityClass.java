package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass
{
public static String getTestData(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
{

	  FileInputStream file=new FileInputStream("E:\\Manual_Notes\\DDF2.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	  
	  String value = sh.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	  return value;
}
}
