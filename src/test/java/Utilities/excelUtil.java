package Utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class excelUtil{
    FileInputStream fis;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
   XSSFRow headerrow;
    int rowcount;
    XSSFRow row;
int    ColNum;
    XSSFCell cell;



    public  excelUtil(String filepath)
    {
        try
        {
             fis=new FileInputStream(filepath);
             workbook=new XSSFWorkbook(fis);
             fis.close();
        }
        catch (FileNotFoundException e)
        {
          e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public String readExcel( String sheetName, String columnName)  {
        String value="";

       sheet= workbook.getSheetAt(0);
       headerrow= sheet.getRow(0);
       rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
       boolean flag=false;
       for (int i=1; i<=rowcount; i++)
       {
            row = sheet.getRow(i);
            for(int j=0; j<row.getLastCellNum(); j++)
            {
                if(headerrow.getCell(j).getStringCellValue().trim().equals(columnName.trim()))
                    ColNum=j;
            }
            cell = row.getCell(ColNum);
            value = cell.getStringCellValue();
           System.out.println(value);
           if(!value.equals(null))
           {
               flag=true;
               break;
           }
       }
       String v=String.valueOf(value);
       return v;
    }
}

