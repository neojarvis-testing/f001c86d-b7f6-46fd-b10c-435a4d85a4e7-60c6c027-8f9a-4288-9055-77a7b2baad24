package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    /*
     * Method name: excelReader
     * Author: Pavan Kumar
     * Description: This method is used to read data from a particular cell from an excel file 
     * Return type:  String
     * Parameters: One String variable and three integer variables
     */

    public static String excelReader(String filePath, int sheetIndex, int rowNum, int colNum) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
                
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            Row row = sheet.getRow(rowNum);
            if (row != null) {
                Cell cell = row.getCell(colNum);
                if (cell != null) {
                    return cell.toString();
                } else {
                    return "Cell cannot be found";
                }
            } else {
                return "Row cannot be found";
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return "Error reading file: " + e.getMessage();
        }
    }

/*
 * Method name: excelDataArrayProvider
 * Author: Pavan Kumar
 * Description: This method returns a 2d array Object  which can be used in test methods to provide data for them usinf @DataProvider annotation
 * Return type: Two Dimensional array of Object
 * Parameters: A Sring variable and an int variable
 */
    public static Object[][] excelDataArrayProvider(String filePath ,int sheetIndex)
    {
        Object[][] data = null;
        try(FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis))
        {
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            int rows = sheet.getPhysicalNumberOfRows();
            int columns = sheet.getRow(0).getPhysicalNumberOfCells();
            data = new Object[rows][columns];
            
            for(int i=0;i<rows;i++)
            {
                Row row = sheet.getRow(i);
                for(int j = 0;j<columns;j++)
                {
                    Cell column = row.getCell(j);
                        data[i][j] = column.getStringCellValue().isEmpty()?null:column.getStringCellValue();
                }
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        return data;
    } 

}
