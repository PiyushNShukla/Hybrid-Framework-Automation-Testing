package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    static XSSFSheet sheet;

    public static void loadExcel() throws Exception {
        FileInputStream fis = new FileInputStream("src/test/resources/TestSteps.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(1);
    }

    public static int getRowCount() {
        return sheet.getLastRowNum();
    }

    public static String getKeyword(int row) {
        return sheet.getRow(row).getCell(1).toString();
    }

    public static String getTestData(int row) {
        return sheet.getRow(row).getCell(2) == null ? "" :
               sheet.getRow(row).getCell(2).toString();
    }
}

