package utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
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
}
